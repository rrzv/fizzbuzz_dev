package original.variation.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import alfresco.variation.impl.FizzBuzzImpl;
import fizzbuzz.dto.FizzBuzz;

public class FizzBuzzTest {
	
	public FizzBuzzImpl fizzBuzzImpl = new FizzBuzzImpl();
	public static final StringBuffer RANGE_2_3 = new StringBuffer("2 alfresco");
	public static final StringBuffer RANGE_2_3_WITH_REPORT = new StringBuffer("2 alfresco\nfizz: 0 buzz: 0 fizzbuzz: 0 alfresco: 1 integer: 1");
	public static final StringBuffer RANGE_15_15 = new StringBuffer("fizzbuzz");
	public static final StringBuffer RANGE_5_5 = new StringBuffer("buzz");
	public static final StringBuffer RANGE_5_5_WITH_REPORT = new StringBuffer("buzz\nfizz: 0 buzz: 1 fizzbuzz: 0 alfresco: 0 integer: 0");
	public static final StringBuffer RANGE_1_20 = new StringBuffer("1 2 alfresco 4 buzz fizz 7 8 fizz buzz 11 fizz alfresco 14 fizzbuzz 16 17 fizz 19 buzz");

	@Test
	public void Should_Convert3ToAlfresco_IfRange2_3() {
		FizzBuzz fizzBuzz = new FizzBuzz();
		fizzBuzz.setInferiorLimit(2);
		fizzBuzz.setSuperiorLimit(3);
		assertEquals(RANGE_2_3.toString(), fizzBuzzImpl.generateFizzBuzzString(fizzBuzz).toString());
	}
	
	@Test
	public void Should_Convert3ToAlfrescoAndAddReport_IfRange2_3_AndGenerateReportIsTrue() {
		FizzBuzz fizzBuzz = new FizzBuzz();
		fizzBuzz.setInferiorLimit(2);
		fizzBuzz.setSuperiorLimit(3);
		fizzBuzz.setGenerateReport(true);
		assertEquals(RANGE_2_3_WITH_REPORT.toString(), fizzBuzzImpl.generateFizzBuzzString(fizzBuzz).toString());
	}
	
	@Test
	public void Should_Convert15toFizzBuzz_IfRange15_15() {
		FizzBuzz fizzBuzz = new FizzBuzz();
		fizzBuzz.setInferiorLimit(15);
		fizzBuzz.setSuperiorLimit(15);
		assertEquals(RANGE_15_15.toString(), fizzBuzzImpl.generateFizzBuzzString(fizzBuzz).toString());
	}
	
	@Test
	public void Should_Convert5toBuzz_IfRange5_5() {
		FizzBuzz fizzBuzz = new FizzBuzz();
		fizzBuzz.setInferiorLimit(5);
		fizzBuzz.setSuperiorLimit(5);
		assertEquals(RANGE_5_5.toString(), fizzBuzzImpl.generateFizzBuzzString(fizzBuzz).toString());
	}
	
	@Test
	public void Should_Convert5toBuzzAndAddReport_IfRange5_5_AndGenerateReportIsTrue() {
		FizzBuzz fizzBuzz = new FizzBuzz();
		fizzBuzz.setInferiorLimit(5);
		fizzBuzz.setSuperiorLimit(5);
		fizzBuzz.setGenerateReport(true);
		assertEquals(RANGE_5_5_WITH_REPORT.toString(), fizzBuzzImpl.generateFizzBuzzString(fizzBuzz).toString());
	}
	
	@Test
	public void Should_HaveCorrectFizzBuzzString_IfRange1_20() {
		FizzBuzz fizzBuzz = new FizzBuzz();
		fizzBuzz.setInferiorLimit(1);
		fizzBuzz.setSuperiorLimit(20);
		assertEquals(RANGE_1_20.toString(), fizzBuzzImpl.generateFizzBuzzString(fizzBuzz).toString());
	}	
}
