import java.util.*;

class ListSort {

public static void main (String[] args) {

List<Integer> numbers = new ArrayList<> ();

numbers.add(10);
numbers.add(-5);
numbers.add(0);
numbers.add(25);

Collections.sort(numbers);

 System.out.println(numbers);

 }
}