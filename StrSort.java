// String sort

class StrSort {

public static void main(String args[]) {

String str[] = {"def","abc", "ghi", "klm", "bin", "egh", "pwd", "aaa", "zyx", "bad"};
String t = "";

for (int i = 1; i < str.length; i++) {
 for (int j = str.length - 1; j>=i; j--) {
   if (str[j - 1].compareTo(str[j]) > 0)
     { 
     t = str[j - 1];
     str[j-1] = str[j];
     str[j] = t; 

     }
   }
}
 for (int k = 0; k < str.length; k++)
   System.out.println(str[k]);

  }
}