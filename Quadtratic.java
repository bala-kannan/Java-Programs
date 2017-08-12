import static java.lang.Math.*;

class Quadtratic {

public static void main (String args[]) {

double a = 4,b = 1,c = -3,x;

x = (-b + sqrt (pow(b,2) - 4 * a * c)) / (2 * a);

System.out.println ("First Solution:" + x);

x = (-b - sqrt (pow(b,2) - 4 * a * c)) / (2 * a);

System.out.println ("Second Solution:" + x);

 }
}