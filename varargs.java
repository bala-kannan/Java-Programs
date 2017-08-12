// varargs

class varargs {

static void vartest (String msg, int...v) {

System.out.println(msg + " " + v.length);

for (int i = 0; i < v.length; i++)
System.out.println(v[i]);

}

public static void main (String args[]) {

vartest("One arg", 25);
vartest("4 args", 4,5,6,7);
vartest("no args");
 
 }
}
