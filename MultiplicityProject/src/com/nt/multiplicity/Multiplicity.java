package com.nt.multiplicity;

import java.util.Scanner;

public class Multiplicity {
	public static void main(String[] args) {
		Multiplicity application=new Multiplicity();
		application.checkMultiples();
	}
	public void checkMultiples() {
		do {
			Scanner input=new Scanner(System.in);
			System.out.println("Enter First Number::");
			int firstNumber=input.nextInt();
			System.out.println();
			System.out.println("Enter Second Number::");
			int secondNumber=input.nextInt();
			if(multiple(firstNumber,secondNumber))
				System.out.println(firstNumber+"is the multiple of"+secondNumber+multiple(firstNumber, secondNumber));
			else
				System.out.println(firstNumber+"is not multiple of"+secondNumber+multiple(firstNumber, secondNumber));
		} while (true);
	}
	private boolean multiple(int firstNumber, int secondNumber) {
		// TODO Auto-generated method stub
		return firstNumber/secondNumber==0;
	}

}
