import java.util.*;

class ListTest1 {

public static void main(String[] args) {


List s1 = new ArrayList();

try {

  while(true) {

      s1.add("abcd");
    } } catch(RuntimeException e) {

       e.printStackTrace(); }
   System.out.println(s1.size());

 }
}