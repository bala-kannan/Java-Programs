class OuterDemo {

int i;

 class Inner {

   int j;

 }

public static void main (String[] args) {

OuterDemo out = new OuterDemo();

OuterDemo.Inner in = out.new Inner();

in.j = 5;

System.out.println(in.j);

 }
}