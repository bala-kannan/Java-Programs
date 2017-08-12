// varargs sum

class varargssum {

int varsum(int...v) {

int sum = 0;

for (int i = 0 ; i < v.length; i++)
 sum += v[i];

return sum;

 }
}

class varsumdemo {

public static void main (String args[]) {

varargssum vs = new varargssum();

System.out.println(vs.varsum(1,2,3));

System.out.println(vs.varsum(1));

System.out.println(vs.varsum(10,20,30,40,50,60));

System.out.println(vs.varsum());

 }
}