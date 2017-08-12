interface NumTest {

boolean getValue(int n, int m);

}

class NumTestDemo {

public static void main (String args[]) {

NumTest myTest;

myTest = (n,d) -> (n%d) == 0;

if (myTest.getValue(10,2))
 System.out.println("2 is a factor of 10");

myTest = (n,m) -> n < m;

if (myTest.getValue(8,10))
  System.out.println("8 is less than 10");

myTest = (a,b) -> (a < 0 ? -a:a) == (b < 0 ? -b:b);
if (myTest.getValue(4,-4))
  System.out.println("4 is same as -4 on abs");

 }
}