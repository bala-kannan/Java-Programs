// Inner Class

class Outer {

int[] num;

Outer(int[] n) {

num = n;

}

void analyze() {

Inner inob = new Inner();

System.out.println("Min value" + inob.min());
System.out.println("Max Value" + inob.max());
System.out.println("Avg Value" + inob.avg());

}

class Inner {

int min() {

int min;

min = num[0];

for (int i = 1; i < num.length; i++)
 min = (min < num[i])? min:num[i];
return min;
}

int max() {

int max;

max = num[0];

for(int i = 1; i < num.length; i++)
 max = (num[i] > max) ? num[i]:max;
return max;
}

int avg() {

int avg = 0;

for(int i = 0; i < num.length; i++)
 avg += num[i];
 avg = avg / num.length;
return avg;
  } 
 }
}

class NestClass {

public static void main (String args[]) {

int[] x = {10, 20, -5, 30, 5, 40, 2, 3, 4, 90};

Outer ob = new Outer(x);
ob.analyze();

 }
}