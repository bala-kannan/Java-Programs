import java.util.*;

class PrintTest {

static char c;
static float f;

public static void main (String[] args) {

System.out.println("A" + (1 + 2));

String str1 = new String("Hello");

String str2 = new String(str1);

System.out.println(str1 == str2);

String str = "";

System.out.println(str.isEmpty());

System.out.println(c + " " + f);

List<Integer> l = new ArrayList<>();

l.add(1);
l.add(2);
l.add(3);
l.add(2);
l.add(null);
l.remove(2);
l.remove(null);
System.out.println(l);

try {

System.out.println(10 / 0);

 } catch (ArithmeticException e) {

System.out.println(e);

 }

System.out.println("After exception");

 }
}