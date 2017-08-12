class Computer {

void process(int n) {
     final String taskName = "Task #1";
     class Processor {
         Processor() {
             System.out.println(
                 "Processor " +  n + " processing " + taskName
             );
         }
     }
     Processor p = new Processor();
    // n = 10;
 }

public static void main (String[] args) {

 Computer c = new Computer();
 c.process(5);

 }
}