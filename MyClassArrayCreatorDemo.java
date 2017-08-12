interface MyClassArrayCreator {

MyClass[] func (int n);

}

/* class MyClass {

private int m;

MyClass (int n) {m = n;}

int getNum() {return m;}

} */

class MyClassArrayCreatorDemo {

public static void main(String args[]) {

MyClassArrayCreator myCons = MyClass[]::new;
MyClass[] a = myCons.func(3);

for (int i = 1; i < 3; i++) {
  a[i] = new MyClass(i);

 //System.out.println([i]);
  }

 }
}
  


