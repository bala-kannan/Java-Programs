import java.io.*;

class suppZero {

public static void main (String[] args) throws IOException {

String str;

int counter, limit;

counter = limit = 0;

BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
limit =  Integer.parseInt(br.readLine());

for (int i = 1; i <= limit; i++) {

 str = String.valueOf(i);

 for (int j = 0; j < str.length() ; j++) {

   
     if (str.charAt(j) == '0') {
       counter++;
       System.out.println(str);
       break;
      } 

   }

  }
 System.out.println("Counter = " + counter);
 }
}
       
