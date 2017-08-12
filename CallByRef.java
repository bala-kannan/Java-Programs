// Class Ref

class TestRef {

int a,b;

TestRef (int i, int j) {

a = i;
b = j;
}

void Change(TestRef ob) {
ob.a = ob.a * ob.a;
ob.b = -ob.b;
 }
}

class CallByRef {

public static void main (String args[]) {

TestRef ob = new TestRef(5, 10);

System.out.println("Before Call " + ob.a + " "  + ob.b);

ob.Change(ob);
System.out.println("After Call " + ob.a + " " + ob.b);
 }
}