class WrapperTest {

public static void main(String[] args) {

Integer i = new Integer(42);

Long l = new Long(42);

Double d = new Double(42.0);

System.out.println(i.equals(l));

System.out.println(i.equals(d));

System.out.println(l.equals(d));

 }
}