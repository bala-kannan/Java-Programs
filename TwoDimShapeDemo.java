abstract class TwoDimShape {

private double width, height;

private String name;

TwoDimShape() {

width = height = 0;

name = "none";

}

TwoDimShape(int w, int h, String s) {

width = w;
height = h;
name = s;

}

TwoDimShape(double x, String s) {

width = height = x;
name = s;

}

TwoDimShape(TwoDimShape ob) {

width = ob.width;
height = ob.height;
name = ob.name;

}

double getWidth() {return width;}
double getHeight() {return height;}
String getName() {return name;}

abstract double area();
}

class Triangle extends TwoDimShape {

String style;

Triangle() {
super();
}

Triangle(int w, int h, String str, String s) {

super(w,h,str);

style = s;
}

Triangle(double d, String str, String s) {

super(d, str);

style = s;

}

String showstyle() {return style;}

double area() {

return getWidth() * getHeight() / 2;

 } 
}

class Rectangle extends TwoDimShape {

String style;

Rectangle() {
super();
}

Rectangle(int w, int h, String str, String s) {

super(w,h,str);

style = s;
}

Rectangle(double d, String str, String s) {

super(d, str);

style = s;

}

String showstyle() {return style;}

double area() {

return getWidth() * getHeight();

 }
}

class Circle extends TwoDimShape {

String style;

Circle() {
super();
}

Circle(double d, String str, String s) {

super(d, str);

style = s;

}

String showstyle() {return style;}

double area() {

return 3.14 * (getWidth() / 2) * (getWidth() / 2);

 }
}


class TwoDimShapeDemo {

public static void main (String args[]) {

TwoDimShape name[] = new TwoDimShape[5];

name[0] = new Triangle(10.0, "Triangle", "Outlined");
name[1] = new Rectangle(30.0, "Rectangle", "Filled");
name[2] = new Triangle(10, 20, "Triangle", "Filled");
name[3] = new Rectangle(10, 20, "Rectangle", "Outlined");
name[4] = new Circle(10, "Circle", "Full");

for (int i = 0; i < 5; i++) 
System.out.println(name[i].getName() + " " + name[i].area());

 }
}