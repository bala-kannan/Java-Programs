import java.util.*;

class TestList {

public static void main (String[] args) {

List s = new ArrayList();

try {
 while(true) {
    s.add("abcd");
  }
} catch (RuntimeException e) {e.printStackTrace();}
System.out.println(s.size());

  }
}
