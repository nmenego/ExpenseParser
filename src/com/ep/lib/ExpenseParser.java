package com.ep.lib;

import java.util.List;

public interface ExpenseParser {

	/**
	 * Returns a list of parsing candidates.
	 * 
	 * @param rawString
	 *            string to parse
	 * @return list of parsing candidates
	 * @throws ParseException
	 */
	public List<ExpenseDetails> parse(String rawString) throws ParseException;
}
