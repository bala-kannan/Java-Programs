interface StrTest {

MyClass func (String str);

}

class MyClass {

private String str;

MyClass (String s) {str = s;}

MyClass () {str = " ";}

String getStr() {return str;}

}

class StrTestDemo {

public static void main (String args[]) {

StrTest myClassCons = MyClass::new;

MyClass mc = myClassCons.func("Testing");

System.out.println(mc.getStr());

 }
}

