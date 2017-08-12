interface VarTest {

int num (int n);

}

class VarTestDemo {

public static void main (String args[]) {

int num = 15;

VarTest numvar = (n) -> {

int v = num + n;

return v;

 };

System.out.println(numvar.num(20));

 }
}