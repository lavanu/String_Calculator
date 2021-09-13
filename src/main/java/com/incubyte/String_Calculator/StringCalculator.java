package com.incubyte.String_Calculator;

public class StringCalculator {
	private final String delimeter = ",|\n" ;
  
	public int add(String numbers) throws Exception {
		String[] num = numbers.split(delimeter);
	
		if(isEmpty(numbers)) { 
			return 0;
		}
		else {
			if(numbers.length()==1) {
				return (stringToInteger(numbers));
			}
			else {
				return getSum(num);		
			}
		}
	}
	
	private boolean isEmpty(String numbers) {
		return numbers.isEmpty();
	}
	private int stringToInteger(String numbers) {
		return Integer.valueOf(numbers);
	}
	
	private int getSum(String[] num) throws Exception {
		int sum = 0;
		for(String i : num) {
			int number = stringToInteger(i);
			if(number<0) {
				throw new Exception("Negatives not allowed");
			}
			else {
				if(number>1000) {
					continue;
				}	
				sum += number;
			}
		}
		return sum;	
		
	}
	
}


