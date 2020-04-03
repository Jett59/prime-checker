package com.mycodefu.prime;

public class Start {
	public static int number = 21503;
	
public static void main(String[] args) {
	double numberDividedBy2 = number/2d;
	double numberDividedBy3 = number/3d;
	double numberDividedBy5 = number/5d;
	double numberDividedBy7 = number/7d;
	System.out.println("divided by 2 is "+numberDividedBy2);
	System.out.println("divided by 3 is "+numberDividedBy3);
	System.out.println("divided by 5 is "+numberDividedBy5);
	System.out.println("divided by 7 is "+numberDividedBy7);
	boolean isPrime = true;
	if(!Double.toString(numberDividedBy2).endsWith(".0")) {
		System.out.println(number+" is not even");
	}else {
		isPrime = false;
		System.out.println(number+" is even");
	}
	if(!Double.toString(numberDividedBy3).endsWith(".0")) {
		System.out.println(number+" is not divisible by 3");
	}else {
		isPrime = false;
		System.out.println(number+" is divisible by 3");
	}
	if(!Double.toString(numberDividedBy5).endsWith(".0")) {
		System.out.println(number+" is not divisible by 5");
	}else {
		isPrime = false;
		System.out.println(number+" is divisible by 5");
	}
	if(!Double.toString(numberDividedBy7).endsWith(".0")) {
		System.out.println(number+" is not divisible by 7");
	}else {
		isPrime = false;
		System.out.println(number+" is divisible by 7");
	}
	if(number == 2d || number == 3d || number == 5d || number == 7d) {
		isPrime = true;
	}
	if(number == 1) {
		isPrime = false;
	}
	if(isPrime) {
		System.out.println(number+" is prime");
	}else {
		System.out.println(number+" is not prime");
	}
}
}
