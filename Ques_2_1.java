abstract class SuperClass {

 static void print() {

    System.out.println("Super");

  }
}


public class Ques_2_1 extends SuperClass {

 static void print() {

  System.out.println("Sub");

  } 

 public static void main(String[] args) {

 print();

   }
}