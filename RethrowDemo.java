class Rethrow {

public static void genException() {

int numer[] = {2,4,8,16,32,64,128,256};
int denom [] = {2,2,0,8,16,0,32};

for (int i=0; i<numer.length; i++) {

try {

System.out.println(numer[i] + "/" + denom[i] + "=" + numer[i]/denom[i]);

 }

catch (ArithmeticException exc) {

System.out.println("Divide by zero");
 }


catch (ArrayIndexOutOfBoundsException exc) {

 System.out.println("Element not found");

 throw exc;
   }
  }
 }
}

class RethrowDemo {

public static void main (String args[]) {

try {
 Rethrow.genException();
}

catch (ArrayIndexOutOfBoundsException exc) {

System.out.println("Program Termed");
  }
 }
}


 