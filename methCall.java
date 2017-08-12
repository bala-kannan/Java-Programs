class methCall {

void meth (int i) {

 System.out.println ("Int");

 }

public static void main (String[] args) {

int i = 5;

double d = 1.0;

methCall mc = new methCall();

mc.meth(i);

mc.meth(d);

 }
}