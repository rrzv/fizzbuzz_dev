package original.variation.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import fizzbuzz.dto.FizzBuzz;
import original.variation.impl.FizzBuzzImpl;

public class FizzBuzzTest {
	
	public FizzBuzzImpl fizzBuzzImpl = new FizzBuzzImpl();
	public static final StringBuffer RANGE_2_3 = new StringBuffer("2 fizz");
	public static final StringBuffer RANGE_15_15 = new StringBuffer("fizzbuzz");
	public static final StringBuffer RANGE_5_5 = new StringBuffer("buzz");
	public static final StringBuffer RANGE_1_20 = new StringBuffer("1 2 fizz 4 buzz fizz 7 8 fizz buzz 11 fizz 13 14 fizzbuzz 16 17 fizz 19 buzz");

	@Test
	public void Should_Convert3ToFizz_IfRange2_3() {
		FizzBuzz fizzBuzz = new FizzBuzz();
		fizzBuzz.setInferiorLimit(2);
		fizzBuzz.setSuperiorLimit(3);
		assertEquals(RANGE_2_3.toString(), fizzBuzzImpl.generateFizzBuzzString(fizzBuzz).toString());
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
	public void Should_HaveCorrectFizzBuzzString_IfRange1_20() {
		FizzBuzz fizzBuzz = new FizzBuzz();
		fizzBuzz.setInferiorLimit(1);
		fizzBuzz.setSuperiorLimit(20);
		assertEquals(RANGE_1_20.toString(), fizzBuzzImpl.generateFizzBuzzString(fizzBuzz).toString());
	}	
}
