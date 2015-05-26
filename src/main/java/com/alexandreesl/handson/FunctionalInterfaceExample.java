package com.alexandreesl.handson;

public class FunctionalInterfaceExample {

	public static void main(String[] args) {

		MyInterface myFunctionalInterface = (message) -> System.out
				.println("The message is: " + message);

		String secret = "SECRET MESSAGE!";

		myFunctionalInterface.methodA(secret);

		System.out.println(myFunctionalInterface.methodB(secret));

	}

}
