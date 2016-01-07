package com.ep.lib;

import java.util.ArrayList;
import java.util.List;

public class ExpenseParserV1 implements ExpenseParser {

	@Override
	public List<ExpenseDetails> parse(String rawString) throws ParseException {
		List<ExpenseDetails> list = new ArrayList<>();
		if (rawString == null || rawString.isEmpty()) {
			throw new ParseException("null/empty input.");
		}

		// split string.
		String[] arr = rawString.trim().split("\\s+");
		if (arr == null || arr.length < 2) {
			throw new ParseException(
					"must have at least expense description and amount");
		}

		// input should have at least 1 string description, and 1 numeric
		for (int i = 0; i < arr.length; i++) {
			String str = arr[i];
			if (isNumeric(str)) {
				ExpenseDetails ed = new ExpenseDetails();
				if (i == arr.length - 1) {
					ed.setAmount(Double.parseDouble(str));
					ed.setDescription(arrayAsString(arr, 0, i - 1));
				} else {
					ed.setAmount(Double.parseDouble(str));
					ed.setDescription(arrayAsString(arr, i + 1, arr.length - 1));
				}
				// add item to front of list for priority
				list.add(0, ed);
			}
		}

		return list;
	}

	private boolean isNumeric(String str) {
		try {
			Double.parseDouble(str);
		} catch (NumberFormatException e) {
			return false;
		}
		return true;
	}

	private String arrayAsString(String[] arr, int start, int end) {
		String str = "";
		for (int i = start; i <= end; i++) {
			str += arr[i];
		}
		return str;
	}
}
