class Canine {

public int getAvgWeight() {

 return 50;

 }
}

public class Wolf extends Canine {

public int getAvgWeight() {

 return super.getAvgWeight() + 20;

 }

public static void main (String[] args) {

System.out.println(new Canine().getAvgWeight()); 

System.out.println(new Wolf().getAvgWeight());

 }
}