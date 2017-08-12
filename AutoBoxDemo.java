class AutoBoxDemo {

static void m1 (int v) {

System.out.println ("Value passed is " + v);

 }

static Integer m2 () {return 100; }

static int m3 () {return 200;}


public static void main (String args[]) {

m1(99);

int i = m2();

Integer iOb = m3();

System.out.println (i + " " + iOb);

System.out.println(Math.sqrt(iOb));

 }
}