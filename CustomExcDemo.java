class NonIntException extends Exception {

int n,d;

NonIntException (int i, int j) {

n = i;
d = j;

}

public String toString() {

return "Non Integer Division:" + n + "/" + d;

 }
}

class CustomExcDemo {

public static void main (String args[]) {

int numer[] = {2,4,8,15,16,32,64,65};
int denom[] = {2,2,4,4,8,8,0,32};


  for (int i = 0; i < numer.length; i++) {
  try {
    if (numer[i] % 2 !=0) throw new NonIntException(numer[i],denom[i]);
    
    System.out.println (numer[i] + "/" + denom[i] + "=" + numer[i] / denom[i]);
    }
 catch (ArithmeticException Exc) {
    System.out.println ("Cannot divide by 0");
    }
 catch (ArrayIndexOutOfBoundsException exc) {
    System.out.println ("Array Index Out Of Bounds");
    }
  catch (NonIntException exc) {
    System.out.println (exc);
   }
  }
 }
} 
