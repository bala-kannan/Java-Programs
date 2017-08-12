class Vehicle {

private int passengers, mpg, fuelcap;

Vehicle (int p, int m, int f) {

passengers = p;
mpg = m;
fuelcap = f;

}

int range() {

return mpg * fuelcap;

}

int getpassengers() {return passengers;}

int getmpg() {return mpg;}

int getfuelcap() {return fuelcap;}

}

class Truck extends Vehicle {

int cargocap;

Truck (int p, int m, int f, int c) {

super(p,m,f);

cargocap = c;

 }

double fuelreqd (int dist) {

return (double) dist / getmpg();

}

}

class TruckDemo {

public static void main (String args[]) {

double gallons;

Truck semi = new Truck(2, 12, 20, 40000);

Truck pickup = new Truck(4, 18, 16, 2000);

System.out.println("Semi:" + semi.getpassengers() + "," + semi.getmpg() + "," + semi.getfuelcap());

System.out.println(semi.range() + " " + pickup.range());

gallons = semi.fuelreqd(354);

System.out.println(gallons);

 }
}


