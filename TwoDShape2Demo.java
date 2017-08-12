class TwoDShape {

private double width, height;

double getwidth() {

return width;

}

double getheight() {

return height;

}

TwoDShape() {

width = height = 0;

}

TwoDShape(int w, int h) {

width = w;
height = h;

}

TwoDShape(double x) {

width = height = x;

}

TwoDShape(TwoDShape ob) {

width = ob.width;
height = ob.height;

}

void showDim() {

System.out.println ("Width = " + width + "Height = " + height);

 }
}

class Triangle extends TwoDShape {

String style;

Triangle() {

super();

style = "none";

}

Triangle (int w, int h, String s) {

super(w,h);

style = s;
}

Triangle (double d) {

super(d);

style = "double";

}

Triangle (Triangle ob) {

super(ob);

style = ob.style;

}

void showstyle() {

System.out.println("Style = " + style);

}

double showarea () {

return getwidth() * getheight() / 2;

 }
}

class TriangleColor extends Triangle {

String color;

TriangleColor (String c, int w, int h, String s) {

super(w,h,s);

color = c;

}

String getColor() { return color; }

}


class TwoDShape2Demo {

public static void main (String args[]) {

Triangle tr1 = new Triangle();
Triangle tr2 = new Triangle(4,10,"Filled");
Triangle tr3 = new Triangle(20.4);

Triangle tr4 = new Triangle(tr2);

TriangleColor tc1 = new TriangleColor("Red",10,20,"Outlined");

tr1.showDim();
System.out.println("Area = " + tr1.showarea());
tr1.showstyle();

tr2.showDim();
System.out.println("Area = " + tr2.showarea());
tr2.showstyle();

tr3.showDim();
System.out.println("Area = " + tr3.showarea());
tr3.showstyle();

tr4.showDim();
System.out.println("Area = " + tr4.showarea());
tr4.showstyle();


tc1.showDim();
System.out.println("Area = " + tc1.showarea());
tc1.showstyle();
System.out.println("Color = " + tc1.getColor());

 }
}