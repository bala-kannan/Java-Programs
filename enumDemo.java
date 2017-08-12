enum Transport {

CARS(50), TRUCKS(30), PLANE(600), SHIP(60), TRAIN(70);

int speed;

Transport (int s) {speed = s;}

int getSpeed() {return speed;}

}

class enumDemo {

public static void main (String args[]) {

//Transport tp;

System.out.println(Transport.PLANE.getSpeed());

for (Transport t : Transport.values()) {

System.out.println ("Speed of " + t + " is " + t.getSpeed());

  }
 }
}