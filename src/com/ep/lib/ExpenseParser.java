package com.ep.lib;

public interface ExpenseParser {

	public ExpenseDetails parse(String rawString) throws ParseException;
}
