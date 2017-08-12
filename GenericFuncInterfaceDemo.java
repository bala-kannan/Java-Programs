interface SomeTest<T> {

boolean test(T n, T m);

}

class GenericFuncInterfaceDemo {

public static void main (String args[]) {

SomeTest<Integer>isFactor = (n,m) -> n%m == 0;

if (isFactor.test(10,2)) 
  System.out.println("Factor");
else
  System.out.println("Not a factor");

SomeTest<Double>isFactorD = (n,m) -> n%m == 0;

if (isFactorD.test(10.0,4.0)) 
  System.out.println("Factor");
else
  System.out.println("Not a factor");

SomeTest<String>isIn = (a,b) -> a.indexOf(b) != -1;

String str = "This is a test";

if (isIn.test(str,"is a")) 
  System.out.println("Str 2 is part of Str 1");
else
  System.out.println("Str 2 is not part of Str 1");

 }
}