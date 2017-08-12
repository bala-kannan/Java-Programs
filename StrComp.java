class StrComp {

public static void main (String[] args) {

String str = "";

String str1 = "Hello World";

String str2 = "Hello World";

str += 2;

str += 'c';

str += false;

if (str == "2cfalse") System.out.println("==");

if (str.equals("2cfalse")) System.out.println("equals");

if (str1 == str2) System.out.println("==");
if (str1.equals(str2)) System.out.println("equals");
if ("Hello World" == str1) System.out.println("==");l

 }
}