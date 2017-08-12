class ExcDemo2 {

public static void main (String args[]) {

int numer[] = {2,4,8,16,32,64,128};

int denom[] = {2,2,0,4,16,0};

for (int i=0; i < numer.length; i++) 

try {

System.out.println(numer[i] + "/" + denom[i] + "=" + numer[i]/denom[i]);

}

catch (ArrayIndexOutOfBoundsException exc) {

System.out.println("Element not found");

  }
catch (Throwable exc) {

System.out.println("Some Exception");
 } 

 }
}