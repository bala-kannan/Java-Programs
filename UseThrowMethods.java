class ThrowDemo {

public static void genException() {

int nums[] = new int[4];

nums[7] = 20;

 }
}

class UseThrowMethods {

public static void main (String args[]) {

try {

ThrowDemo.genException();
 
   }
catch (ArrayIndexOutOfBoundsException exc) {

System.out.println(exc);

exc.printStackTrace();

  }
 }
}   

 