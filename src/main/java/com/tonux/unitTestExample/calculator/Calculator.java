package com.tonux.unitTestExample.calculator;

public class Calculator {

	public int sum(int a, int b) {
		return a + b;
	}

	public int minus(int a, int b) {
		return a - b;
	}

	public int divide(int a, int b) {
		return a / b;
	}

	public int multiply(int a, int b) {
		return a * b ;
	}


	// AJOUTER DEUX MÉTHODES 
	// min(int a, int b)
	public int min(int a, int b){
		return Math.min(a,b);
	} 

	// max(int a, int b)
	public int max(int a, int b){
		return Math.max(a,b);
	} 


}