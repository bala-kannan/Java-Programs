// call by val

class Test {

void NoChange (int i, int j) {

i = i * j;

j = -j;
 }
}

class CallByVal {

public static void main (String args[]) {

Test ob = new Test();

int a = 5, b = 10;

System.out.println(a + " " + b);

ob.NoChange(5,10);

System.out.println(a + " " + b);
 }
}
