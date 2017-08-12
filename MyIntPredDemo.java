interface IntPredicate {

boolean IntPredicateTest (int n);

}

class MyIntPredicate {

static boolean isPrime (int n) {

if (n < 2) return false;

for (int i = 2; i <= n/i; i++) {
 if ((n % i) == 0) return false;
 } 
 return true;
}

static boolean isEven (int n) {

return (n%2 == 0);

}

static boolean isPositive (int n) {

return (n > 0);

 }
}

class MyIntPredDemo {

static boolean numTest(IntPredicate p, int v) {

return p.IntPredicateTest(v);

}

public static void main (String args[]) {

boolean result;

result = numTest(MyIntPredicate::isPrime,18);

if (result) 
 System.out.println("18 is prime");
else
 System.out.println("18 is not prime");

result = numTest(MyIntPredicate::isEven,20);

if (result) System.out.println("20 is even");

result = numTest(MyIntPredicate::isPositive,1);

if (result) System.out.println("1 is positive");

 }
}
 