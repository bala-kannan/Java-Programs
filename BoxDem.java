class Box {

double length, width, height;

Box(double l, double w, double h) {

length = l;
width = w;
height = h;

}

Box(Box ob) {
length = ob.length;
width = ob.width;
height = ob.height;
}

Box(double dim) {

length = width = height = dim;

}

double area () {

return length * width * height;

 }
}

public class BoxDem{

public static void main(String[] args) {

Box mybox = new Box(10,20,30);

Box clonebox = new Box(mybox);

System.out.println(mybox.area());


System.out.println(clonebox.area());

  
 }
}
