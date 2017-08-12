class CharAtTest {

public static void main (String[] args) {

try {

   System.out.println("12345".charAt(6));

   } catch (IndexOutOfBoundsException e) {System.out.println("caught");}

  }
}