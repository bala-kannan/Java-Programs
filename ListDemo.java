import java.util.*;

class ListDemo {

public static void main (String[] args) {

List<String> names = new ArrayList<> ();

names.add("Kannan");
names.add("Suhanya");

for (String name : names)
  System.out.println(name);

String stringArray[] =  names.toArray(new String[0]);

System.out.println(stringArray.length);

for (int i=0; i < stringArray.length; i++)
   System.out.println(stringArray[i]);

String birds[] = {"hawk","crow","robin"};

List<String> list = Arrays.asList(birds);

for (String lst : list)

  System.out.println(lst);

 }
}