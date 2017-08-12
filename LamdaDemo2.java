interface NumericTest {

boolean test (int n, int d);

}

class LamdaDemo2 {

public static void main (String[] args) {

NumericTest isFactor = (n,d) -> (n % d == 0);

if (isFactor.test(10,2)) System.out.println("2 is a factor of 10");

if (!isFactor.test(10,3)) System.out.println("3 is not a factor of 10" );

NumericTest isGreater = (n,d) -> (n > d);

if (isGreater.test(10,9)) System.out.println("10 is greater than 9");

 }
}