package com.alexandreesl.handson;

@FunctionalInterface
public interface MyInterface {

	void methodA(String message);

	default String methodB(String message) {
		System.out.println("I received: " + message);
		message += " ALTERED!";
		return message;
	}

}
