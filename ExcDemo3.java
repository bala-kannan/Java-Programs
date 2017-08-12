class ExcDemo3 {

public static void main (String args[]) {

int numer[] = {2,4,8,16,32,64,128,256};
int denom[] = {2,2,0,4,2,8,4};

for (int i=0; i < numer.length; i++) {
try {
System.out.println(numer[i] +"/" + denom[i] + "=" + numer[i]/denom[i]);
 }


catch (ArithmeticException | ArrayIndexOutOfBoundsException exc) {

System.out.println("Exception" + exc);
   }
  }
 }
} 
 