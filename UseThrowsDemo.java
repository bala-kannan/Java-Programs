class UseThrows {



public static char prompt (String str) 
throws java.io.IOException {

System.out.println(str + ":");

return (char) (System.in.read());
 
 }
}

class UseThrowsDemo {

public static void main (String args[]) {

char ch;

try {

 ch = UseThrows.prompt("Enter a letter");
 }
catch (java.io.IOException exc) {
 System.out.println("IO Exception occured"); 
 ch = 'X';
  }
 System.out.println("You Entered" + ch);
 }
}
