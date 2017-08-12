class ArgsTest {

public static void main (String[] args) {

try {

   System.out.println(args[args.length-2]);

   } catch (ArrayIndexOutOfBoundsException e) { }

  }
}