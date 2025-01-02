package finterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerAcceptMethod {
	public static void main(String[] args) {
		//  Performs an operation on the given argument(s).-------------------------
		
		// Consumer Example -----------
		Consumer<String> consumer = input -> System.out.println("Input: " + input);
		consumer.accept("Hello, World!"); // Calls the accept method

		// BiConsumer Example ------------
		BiConsumer<String, Integer> biConsumer = (name, age) -> System.out.println(name + " is " + age + " years old.");
		biConsumer.accept("Alice", 30);
	}

}
