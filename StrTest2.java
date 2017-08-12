class StrTest2 {

public static void main (String[] args) {

String s = new String("Hello World");

String t = new String(s);

System.out.println(s == t);

System.out.println (s.equals(t));

System.out.println ("Hello World".equals(s));

System.out.println ("Hello World".equals(t));

 }
}