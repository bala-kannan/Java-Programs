import java.util.*;

class ArrayListTest {

public static void main (String[] args) {

List <String> list = new ArrayList <> ();

/* list.add("Kannan");
list.add("Suhanya");
list.add("Esvar");
list.add("Subi");
list.set(0,"Genius"); */

list = Arrays.asList("Kannan","Suhanya","Esvar","Subi");

for (String val:list) 
  System.out.println(val);

Object objectArray[] = list.toArray();

String stringArray[] = list.toArray(new String[0]);

System.out.println(stringArray.length);

for (String val:stringArray) 
  System.out.println(val);

 }
}