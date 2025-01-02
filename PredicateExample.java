package finterface;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) { 
    	// Tests a condition on the input argument(s). ------------------------------
    	
    	// Predicate Example -----------
        Predicate<Integer> isEven = number -> number % 2 == 0;
        System.out.println(isEven.test(4)); // true
        System.out.println(isEven.test(7)); // false
        
     // BiPredicate Example -----------
        BiPredicate<String, String> isEqual = (s1, s2) -> s1.equals(s2);
        System.out.println(isEqual.test("Java", "Java")); // true
        System.out.println(isEqual.test("Java", "Python")); // false
    }
}
