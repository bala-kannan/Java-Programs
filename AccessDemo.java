// class Access		

class Access {

private int alpha;

public int beta;

int gamma;

void putval (int val) {

alpha = val;

}

int getval () {

return alpha;

 }
}

class AccessDemo {

public static void main (String args[]) {

Access ob = new Access();

ob.putval(7);

ob.gamma = 10;

System.out.println(ob.getval());

System.out.println(ob.gamma);

 }
}