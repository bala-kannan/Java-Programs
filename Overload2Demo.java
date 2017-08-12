class Overload2 {

void f (int x) {
System.out.println("Int : " + x);
}

void f (double x) {
System.out.println("double : " + x);
 }
}

class Overload2Demo {

public static void main (String args[]) {

Overload2 ov = new Overload2();

int i = 10;
byte b = 120;
short s = 1234;
double d = 123.45;
float f = 98712.3F;

ov.f(i);
ov.f(b);
ov.f(s);
ov.f(d);
ov.f(f);

 }
}