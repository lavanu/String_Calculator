package com.incubyte.String_Calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StringCalculatorTest {
	private StringCalculator stringCalculator;

  @BeforeEach
  public void init() {
	  stringCalculator = new StringCalculator();
  }
   
  @Test
  public void emptyStringReturnZero() throws Exception {
    assertEquals(stringCalculator.add(""), 0);
  }
  
  @Test
  public void singleNumberReturnValue() throws Exception {
    assertEquals(stringCalculator.add("2"), 2);
  }
  
  @Test
  public void singleNumberGreaterThanTwoDigitReturnValue() throws Exception {
    assertEquals(stringCalculator.add("42"), 42);
  }
  
  @Test
  public void twoNumbersCommaDelimitedReturnSum() throws Exception {
    assertEquals(stringCalculator.add("2,3"), 5);
  }
  
  @Test
  public void twoNumbersNewLineDelimitedReturnSum() throws Exception {
    assertEquals(stringCalculator.add("2\n3"), 5);
  }
  
  @Test
  public void ThreeNumbersDelimitedEitherWayReturnSum() throws Exception {
    assertEquals(stringCalculator.add("2,3,4"), 9);
  }
  
  @Test
  public void negativeInputthrowException() {
	  Assertions.assertThrows(Exception.class, () -> {
		    stringCalculator.add("-2");
		  });
  }
  @Test
  public void ignoreNumbersGreaterThan1000() throws Exception {
    assertEquals(stringCalculator.add("2,3,4000"), 5);
  }
}
