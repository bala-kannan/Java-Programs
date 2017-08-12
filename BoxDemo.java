class Box {

double height;
double width;
double depth;

Box(double height, double width, double depth) {

this.height = height;
this.width = width;
this.depth = depth;

}

double volume() {

return height * width * depth;

 }
}

class BoxDemo {

public static void main (String[] args) {

double vol;

Box box1 = new Box(10,20,30);

vol = box1.volume();

System.out.println("Vol is: " + vol);

Box box2 = new Box(3,6,9);

vol = box2.volume();

System.out.println("Vol is: " + vol);
 
 }
}
