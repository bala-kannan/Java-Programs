class A {

int i;

}

class B extends A {

int i;

B (int a, int b) {

super.i = a;
i = b;

}

void show() {

System.out.println(super.i + " " + i);
 
 }
}

class SuperClass {

public static void main (String args[]) {

B ob = new B(10, 20);

ob.show();

 }
}
