package com.alexandreesl.handson;

public class LambdaBaseExample {

	public static void main(String[] args) {

		// pre-java 8, with inner classes

		for (int i = 1; i <= 10; i++) {

			final int number = i;

			Thread thread = new Thread(new Runnable() {

				@Override
				public void run() {

					System.out.println("The number is " + number);

				}

			});

			thread.start();

		}

		// java 8 version with lambdas

		for (int i = 1; i <= 10; i++) {

			int number = i;

			Runnable runnable = () -> System.out
					.println("The number with a lambda is " + number);

			Thread thread = new Thread(runnable);

			thread.start();

			System.out.println("The 'class' of our lambda: "
					+ runnable.getClass());

		}

	}

}
