class Chick {

private String name = "Fluffy";

{ System.out.println ("Instance Variable");}

public Chick() {

name = "Tiny";

System.out.println ("Inside constructor");

}

public static void main (String[] args) {

Chick chick = new Chick();

System.out.println(chick.name);

 }
}