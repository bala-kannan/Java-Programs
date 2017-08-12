@Deprecated
class MyClass {

private String str;

MyClass (String s) {

str = s;

}

@Deprecated
String getMsg() {

return str;
 }
}

class AnnoDemo {

public static void main (String args[]) {

MyClass Cob = new MyClass("Test");

System.out.println(Cob.getMsg());
 
 }
}