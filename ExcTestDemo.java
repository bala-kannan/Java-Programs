class ExcTest {

static void genexception() {

int nums[] = new int[4];

System.out.println("Within ExcTest");

nums[7] = 10;
 }

}

class ExcTestDemo {

public static void main (String args[]) {

try {

ExcTest.genexception();

}

catch(ArrayIndexOutOfBoundsException exc) {

System.out.println("After catch");

 }
System.out.println("After try");
 }
}
