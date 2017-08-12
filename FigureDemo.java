abstract class Figure{

double dim1, dim2;

Figure(double dim1, double dim2) {

this.dim1 = dim1;
this.dim2 = dim2;
}

abstract double area();

}

class Rectangle extends Figure{

Rectangle(double dim1, double dim2) {
super(dim1, dim2);
}

double area() {

return dim1 * dim2;

 }
}

class Triangle extends Figure{

Triangle(double dim1, double dim2) {
super(dim1, dim2);
}

double  area(){

 return dim1 * dim2 / 2;

 }
}

class FigureDemo {

public static void main(String[] args) {

Rectangle r = new Rectangle(10,20);

Triangle t = new Triangle(20, 40);

Figure figref;

figref = r; 
System.out.println(figref.area());
figref = t;
System.out.println(figref.area());

 }
}