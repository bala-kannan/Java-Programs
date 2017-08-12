class MyClass {

int x;

MyClass() {

System.out.println("No Param");

}

MyClass(int i) {

System.out.println("One Int Param");

x = i;
}

MyClass(int i, int j) {

System.out.println("Two Int Params");

x = i*j;

}

MyClass(double d) {

System.out.println("Double");

x = (int) d;

 }
}

class MyClassDemo {

public static void main (String args[]) {

MyClass t1 = new MyClass();

MyClass t2 = new MyClass(5);

MyClass t3 = new MyClass(5,10);

MyClass t4 = new MyClass(10.5);

System.out.println (t1.x);
System.out.println (t2.x);
System.out.println (t3.x);
System.out.println (t4.x);
 }
}
 