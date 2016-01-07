package com.ep.lib.test;

import java.util.List;

import org.junit.Test;

import com.ep.lib.ExpenseDetails;
import com.ep.lib.ExpenseParser;
import com.ep.lib.ExpenseParserV1;
import com.ep.lib.ParseException;

public class ExpenseParserV1Test {

	@Test
	public void case1Test() throws ParseException {
		ExpenseParser ep = new ExpenseParserV1();
		List<ExpenseDetails> list = ep.parse("test 123");
		print(list);
	}
	
	@Test
	public void case2Test() throws ParseException {
		ExpenseParser ep = new ExpenseParserV1();
		List<ExpenseDetails> list = ep.parse("123 test 345");
		print(list);
	}
	
	private void print(List<ExpenseDetails> list) {
		for(ExpenseDetails ed : list) {
			System.out.println(ed.toString());
		}
	}

}
