import java.util.function.*;

class PredicateDemo {

public static void main (String args[]) {

Predicate<Integer>isEven = (n) -> (n % 2) == 0;

if (isEven.test(4)) System.out.println ("Even");

if (!isEven.test(3)) System.out.println ("Odd");

 }
}