public class Rope {

public static void swing() {
 System.out.println("Swing");
}

public void climb() {
  System.out.println("Climb");
}

public static void play() {
   swing();
   //climb();
}

public static void main(String[] args) {

Rope rope = new Rope();
rope.play();

Rope rope2 = null;
rope2.play();

 }
}