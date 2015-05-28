package com.alexandreesl.handson;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class MethodReferencesExample {

	public static void main(String[] args) {

		List<Client> list = new ArrayList<>();

		Client clientData = new Client();

		clientData.setName("Alexandre Eleuterio Santos Lourenco");
		clientData.setPhone(33455676l);
		clientData.setSex("M");

		list.add(clientData);

		clientData = new Client();

		clientData.setName("Lucebiane Santos Lourenco");
		clientData.setPhone(456782387l);
		clientData.setSex("F");

		list.add(clientData);

		clientData = new Client();

		clientData.setName("Ana Carolina Fernandes do Sim");
		clientData.setPhone(345622189l);
		clientData.setSex("F");

		list.add(clientData);

		// pre Java 8

		System.out.println("PRE-JAVA 8!");

		for (Client client : list) {

			client.markClientSpecial();

		}

		// Java 8 with lambdas

		System.out.println("JAVA 8 WITH LAMBDAS!");

		list.forEach(client -> client.markClientSpecial());

		// Java 8 with method references

		System.out.println("JAVA 8 WITH METHOD REFERENCES!");

		list.forEach(Client::markClientSpecial);

		// Thread with method reference

		Client client = list.get(0);

		Thread thread = new Thread(client::markClientSpecial);

		System.out.println("THREAD WITH METHOD REFERENCES!");

		thread.run();

		// Method references with a parameter and return
		System.out.println("METHOD REFERENCES WITH PARAMETERS!");

		client = list.get(1);

		Consumer<String> consumer = client::setName;

		consumer.accept("Altering the name! ");

		Supplier<String> supplier = client::getName;

		System.out.println(supplier.get());

	}

}
