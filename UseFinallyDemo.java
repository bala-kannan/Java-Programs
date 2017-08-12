class UseFinally {

public static void genException (int what) {

int nums[] = new int[2];

int t ;

try {

switch(what) {

   case 0: t = 10 / what; break;
   case 1: nums[4] = what; break;
   case 2: System.out.println ("Ok"); break;
    }
  }
catch (ArithmeticException Exc) {
    System.out.println("Divide by zero");  
    return;
  }
catch (ArrayIndexOutOfBoundsException Exc) {
    System.out.println("Array Out Of Bound");
  }
finally {
System.out.println ("Left try catch");
  }
 }
}

class UseFinallyDemo {

public static void main (String args[]) {

for (int i=0; i < 3; i++) {
 UseFinally.genException(i);
 System.out.println();
  }
 }
}
   
  

   
  