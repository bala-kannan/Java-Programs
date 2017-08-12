class StringBuild {

public static void main (String args[]) {

StringBuilder sb1 = new StringBuilder("Animals");

StringBuilder sb2 = new StringBuilder("Animals");

System.out.print(sb1 == sb2);
System.out.print(sb1.equals(sb2));
sb1.replace(3,5,"MA");
System.out.println(sb1);
sb1.insert(7,"-");
System.out.println(sb1);
System.out.println(sb1.charAt(7));
sb1.deleteCharAt(7);
System.out.println(sb1);
 }
}