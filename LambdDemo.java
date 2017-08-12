import java.util.*;

class LambdDemo {

public static void main (String[] args) {

List<Integer>number = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

ArrayList<Integer>num1 = new ArrayList<Integer>();

num1.add(5);
num1.add(10);
num1.add(15);

for (int i = 0; i < number.size(); i++)
  System.out.println(number.get(i));

for (int i : number)
   System.out.println(i);

number.forEach(System.out::println);


for (int i = 0; i < num1.size(); i++)
  System.out.println(num1.get(i));

 }
}
 
