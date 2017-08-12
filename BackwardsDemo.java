// String Recursion

class Backwards {

String str;

Backwards (String s) {
str = s;
}

void recursion (int idx) {

if (idx != str.length() - 1) recursion(idx+1);

System.out.print(str.charAt(idx));
 }
}

class BackwardsDemo {

public static void main (String args[]) {

Backwards bck = new Backwards("Java rules the world");

bck.recursion(0);

 }
}