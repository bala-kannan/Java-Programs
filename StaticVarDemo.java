// Static Var

class StaticVar {

int x;

static int y;

int sum() {

return x + y;

 }
}

class StaticVarDemo {

public static void main (String args[]) {

StaticVar sv1 = new StaticVar();
StaticVar sv2 = new StaticVar();

sv1.x = 10;
sv2.x = 20;
StaticVar.y = 30;

System.out.println(sv1.sum() + " " + sv2.sum());

StaticVar.y = 100;

System.out.println(sv1.sum() + " " + sv2.sum());

 }
}