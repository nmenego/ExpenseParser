package com.ep.lib;

public class ExpenseParserV1 implements ExpenseParser {

	@Override
	public ExpenseDetails parse(String rawString) throws ParseException {
		ExpenseDetails ed = new ExpenseDetails();
		if(rawString == null || rawString.isEmpty()) {
			throw new ParseException("null/empty input.");
		}
		
		// split string.
		String[] arr = rawString.split("\\s+");
		if(arr == null || arr.length < 2) {
			throw new ParseException("must have at least expense name and amount");
		}
		
		
		return ed;
	}

}
