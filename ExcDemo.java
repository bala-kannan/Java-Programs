class ExcDemo {

public static void main (String args[]) {

int nums[] = new int[4];

try {

nums[0] = 10;

 }

catch (ArrayIndexOutOfBoundsException exc){

System.out.println("After catch"); 
}

 System.out.println("After try loop");
 }
}