package original.variation.impl;

import fizzbuzz.dto.FizzBuzz;

public class FizzBuzzImpl {

	public static void main(String[] args) {
		FizzBuzz fizzBuzz = new FizzBuzz();
		fizzBuzz.setInferiorLimit(1);
		fizzBuzz.setSuperiorLimit(20);
		
		FizzBuzzImpl fizzBuzzImpl = new FizzBuzzImpl();
		System.out.println(fizzBuzzImpl.generateFizzBuzzString(fizzBuzz));

	}

	private int[] generateArrayOfNumbersInRange(int inferiorLimit, int superiorLimit) {
		int[] outputArray = new int[superiorLimit - inferiorLimit + 1];

		for (int i = 0; i < outputArray.length; i++) {
			outputArray[i] = inferiorLimit + i;
		}

		return outputArray;
	}
	
	private String convertNumber(int number) {
		if(String.valueOf(number).contains("3"))
			return "alfresco";
		else if(number % 3 == 0 && number % 5 == 0)
			return "fizzbuzz";
		else if (number % 3 == 0) 
			return "fizz";
		else if (number % 5 == 0)
			return "buzz";
		else return String.valueOf(number);
	}
	
	public StringBuffer generateFizzBuzzString(FizzBuzz fizzBuzz) {
		StringBuffer result = new StringBuffer();
		int[] arrayOfNumbers = generateArrayOfNumbersInRange(fizzBuzz.getInferiorLimit(), fizzBuzz.getSuperiorLimit());
		
		for(int i = 0; i < arrayOfNumbers.length - 1; i++) {
			result.append(convertNumber(arrayOfNumbers[i]) + " ");
		}
		
		result.append(convertNumber(arrayOfNumbers[arrayOfNumbers.length - 1]));
		
		return result;
	}

}
