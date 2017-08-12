// Dynamic Demo

class Sup {

void who() {

System.out.println("Inside Sup");

 }
}

class Sub1 extends Sup {

void who() {

System.out.println("Inside Sub1");

 }
}

class Sub2 extends Sup {

void who() {

System.out.println("Inside Sub2");

 }
}

class DynDisp {

public static void main (String args[]) {

Sup supob = new Sup();
Sub1 sub1ob = new Sub1();
Sub2 sub2ob = new Sub2();

Sup supref;

supref = supob;
supref.who();

supref = sub1ob;
supref.who();

supref = sub2ob;
supref.who();

 }
}