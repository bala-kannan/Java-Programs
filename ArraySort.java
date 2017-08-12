import java.util.Arrays;

class ArraySort {

public static void main (String[] args) {

int[] numbers = {10,100, -1, -10, 1234, 345, 9, -25, 51};

Arrays.sort(numbers);

for (int i = 0; i < numbers.length; i++)
//for (int i : numbers)
 System.out.println(numbers[i]);

 }
}