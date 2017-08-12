// Object Pass

class Block {

int a,b,c, vol;

Block (int i, int j, int k) {

a = i;
b = j;
c = k;
vol = a * b * c;
}

boolean sameblock (Block ob) {

if ((ob.a == a) & (ob.b == b) & (ob.c == c)) {
  return true;
 }
  return false;
}

boolean samevolume(Block ob) {

if (ob.vol == vol) {
 return true;
 }
 return false;
 }
}

class PassObj {

public static void main (String args[]) {

Block ob1 = new Block(2,5,10);
Block ob2 = new Block(2,5,10);
Block ob3 = new Block(4,5,5);

if (ob1.sameblock(ob3) == true)
  System.out.println("Same Dimensions");
else
  System.out.println("Different Dimensions");

if (ob1.samevolume(ob2) == true)
  System.out.println("Same volume");
else
  System.out.println("Different Volume");
 }
}