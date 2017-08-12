class OverLoad {

void OvLoad() {

 System.out.println("No Parameter");

}

int OvLoad(int a) {

return a;

}

int OvLoad(int a, int b) {

return a+b;

}

double OvLoad(double a, double b) {

return a+b;

 }
}

class OverLoadDemo {

public static void main(String args[]) {

int resI;

double resD;

OverLoad ov = new OverLoad();

ov.OvLoad();

System.out.println("One Param : " + ov.OvLoad(1));

resI = ov.OvLoad(3,5);
System.out.println ("Two Int Param : " + resI);

resD = ov.OvLoad(4.5, 6.7);
System.out.println ("Two Double Param : " + resD);
 
 }
}