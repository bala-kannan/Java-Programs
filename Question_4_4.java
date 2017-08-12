interface D {
    default void print() {
        System.out.println("D");
    }
}
interface E extends D  {
    default void print() {
        System.out.println("E");
    }
}
public class Question_4_4 implements E {
    public void print() {
        E.super.print();
    }
    public static void main(String[] args) {
        Question_4_4 q = new Question_4_4();
        q.print();
   }
}