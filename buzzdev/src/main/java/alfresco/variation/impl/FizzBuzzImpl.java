package alfresco.variation.impl;

import org.apache.commons.lang3.StringUtils;

import fizzbuzz.dto.FizzBuzz;

public class FizzBuzzImpl {

	public static void main(String[] args) {
		FizzBuzz fizzBuzz = new FizzBuzz();
		fizzBuzz.setInferiorLimit(1);
		fizzBuzz.setSuperiorLimit(20);
		fizzBuzz.setGenerateReport(true);

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
		if (String.valueOf(number).contains("3"))
			return "alfresco";
		else if (number % 3 == 0 && number % 5 == 0)
			return "fizzbuzz";
		else if (number % 3 == 0)
			return "fizz";
		else if (number % 5 == 0)
			return "buzz";
		else
			return String.valueOf(number);
	}

	private StringBuffer generateReport(String input) {
		StringBuffer outputReport = new StringBuffer();

		int countFizzBuzz = StringUtils.countMatches(input, "fizzbuzz");
		int countFizz = StringUtils.countMatches(input, "fizz") - countFizzBuzz;
		int countBuzz = StringUtils.countMatches(input, "buzz") - countFizzBuzz;
		int countAlfresco = StringUtils.countMatches(input, "alfresco");
		int countInteger = input.split(" ").length - (countFizz + countBuzz + countFizzBuzz + countAlfresco);

		outputReport.append("fizz: " + countFizz + " ");
		outputReport.append("buzz: " + countBuzz + " ");
		outputReport.append("fizzbuzz: " + countFizzBuzz + " ");
		outputReport.append("alfresco: " + countAlfresco + " ");
		outputReport.append("integer: " + countInteger);

		return outputReport;
	}

	public StringBuffer generateFizzBuzzString(FizzBuzz fizzBuzz) {
		StringBuffer result = new StringBuffer();
		int[] arrayOfNumbers = generateArrayOfNumbersInRange(fizzBuzz.getInferiorLimit(), fizzBuzz.getSuperiorLimit());

		for (int i = 0; i < arrayOfNumbers.length - 1; i++) {
			result.append(convertNumber(arrayOfNumbers[i]) + " ");
		}

		result.append(convertNumber(arrayOfNumbers[arrayOfNumbers.length - 1]));

		if (fizzBuzz.isGenerateReport()) {
			result.append("\n");
			result.append(generateReport(result.toString()));
		}

		return result;
	}

}
