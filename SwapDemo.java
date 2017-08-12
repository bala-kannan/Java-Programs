// Swap 

class Swap {

int a;

Swap (int i) {

a = i;

 }

static void SwapMeth (Swap ob1, Swap ob2) {

int t;
t = ob1.a;
ob1.a = ob2.a;
ob2.a = t;
 }
}

class SwapDemo {

public static void main (String args[]) {

Swap sw1 = new Swap(10);
Swap sw2 = new Swap(20);
System.out.println(sw1.a + " " + sw2.a);

Swap.SwapMeth(sw1,sw2);
System.out.println(sw1.a + " " + sw2.a);
 }
}