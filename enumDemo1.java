enum Transport {

CARS, TRUCKS, PLANE, BOAT, TRAIN

}

class enumDemo1 {

public static void main (String args[]) {

Transport tp1, tp2, tp3;

tp1 = Transport.TRAIN;
tp2 = Transport.CARS;
tp3 = Transport.TRAIN;

if (tp1.compareTo(tp3) == 0) System.out.println ("Same");

System.out.println(tp2.compareTo(tp1));

for (Transport t : Transport.values()) {

System.out.println(t.ordinal());

  }
 }
}