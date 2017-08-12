// Avg
class DblAvg {
public static void main (String args[]) {
double dblarr[] = {1.2, 2.4, 3.5, 1.3, 4.9, 5.6, 7.8, 8.2, 9.1, 10.2};
double sum = 0.0, avg = 0.0;
for (double d:dblarr) {
sum = sum + d;
avg = sum / dblarr.length;
   }
System.out.println("Sum =  " + sum + "Average = " + avg);
  }
}