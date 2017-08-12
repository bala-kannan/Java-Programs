// Static Method

class StatMeth {

static int i = 1024;

static int MulBy2() {

 return i * 2;
 
 }
}

class StatMethDemo {

public static void main (String args[]) {

System.out.println(StatMeth.MulBy2());

StatMeth.i = 256;

System.out.println(StatMeth.MulBy2());

 }
}