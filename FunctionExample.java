package finterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionExample {
	public static void main(String[] args) {
//		 Applies a function to the input argument(s) and produces a result.----------
		
//		Function Example --------------
		Function<Integer, String> convertToString = number -> "Number: " + number;
		System.out.println(convertToString.apply(10)); // Calls the apply method
		
		
//		BiFunction Example --------------
		BiFunction<Integer, Integer, Integer> addNumbers = (a, b) -> a + b;
        System.out.println(addNumbers.apply(5, 10)); // 15
	}
}
