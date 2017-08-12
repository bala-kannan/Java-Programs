class Summation {

int sum;

Summation(int num) {
for (int i = 1; i <= num; i++)
 sum += i;
}

Summation(Summation ob) {

 sum = ob.sum;
 }
}

class SummationDemo {

public static void main (String args[]) {

Summation s1 = new Summation(10);
Summation s2 = new Summation(s1);

System.out.println(s1.sum);
System.out.println(s2.sum);

 }
}
