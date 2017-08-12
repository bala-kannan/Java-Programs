class A {

void callMe() {

 System.out.println ("In A");

 }
}

class B extends A {

void callMe() {

 System.out.println ("In B");

 }
}


class C extends B {

void callMe() {

 System.out.println ("In C");

 }
}

class Dispatch {

public static void main (String[] args) {

A a = new A();
B b = new B();
C c = new C();

A r;

r = a;
r.callMe();
r = c;
r.callMe();

 }
}