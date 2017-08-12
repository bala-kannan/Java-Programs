// Static Block

class StaticBlock {

static double rootof2, rootof3;

static {

System.out.println("Inside Static Block");

rootof2 = Math.sqrt(2);
rootof3 = Math.sqrt(3);
 }

StaticBlock (String msg) {
System.out.println(msg);
 }
}

class StaticBlockDemo {

public static void main (String args[]) {

StaticBlock sb = new StaticBlock("This is inside main");

System.out.println(StaticBlock.rootof2 + " " +  StaticBlock.rootof3);

 }
}