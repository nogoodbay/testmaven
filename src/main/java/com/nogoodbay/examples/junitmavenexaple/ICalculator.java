package com.nogoodbay.examples.junitmavenexaple;

public interface ICalculator {
	int sum(int a, int b);
	
	int subtraction(int a, int b);
	
	int multiplication(int a, int b);
	
	int devison(int a, int b) throws Exception;
	
	boolean equalIntegers(int a, int b);

}
