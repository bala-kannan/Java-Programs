class TwoDShape {

private int width, height;

int getwidth() {

return width;

}

int getheight() {

return height;

}

void setwidth (int w) {

width = w;

}

void setheight (int h) {

height = h;

}

void showDim() {

System.out.println ("Width = " + width + "Height = " + height);

 }
}

class Triangle extends TwoDShape {

String style;

Triangle (int w, int h, String s) {

setwidth(w);
setheight(h);

style = s;
}

void showstyle() {

System.out.println("Style = " + style);

}

int showarea () {

return getwidth() * getheight() / 2;

 }
}

class TwoDShapeDemo {

public static void main (String args[]) {

Triangle tr1 = new Triangle(4,10,"Filled");
Triangle tr2 = new Triangle(20, 10, "Oblique");

tr1.showDim();
System.out.println("Area = " + tr1.showarea());
tr1.showstyle();

tr2.showDim();
System.out.println("Area = " + tr2.showarea());
tr2.showstyle();

 }
}