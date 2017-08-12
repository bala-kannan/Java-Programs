class MultiThread implements Runnable {

Thread t;

String name;

MultiThread (String threadName) {

name = threadName;

t = new Thread (this, name);

t.start();

}

public void run() {

try {

for (int n = 5; n > 0; n--) {

System.out.println(name + " " + n);

t.sleep(1000);

 } 
} catch(InterruptedException e) {

     e.printStackTrace();
  }
 
    System.out.println("exiting child");
 }
}

class JoinThread {

public static void main(String[] args) {

MultiThread ob1 = new MultiThread("one");
MultiThread ob2 = new MultiThread("two");
MultiThread ob3 = new MultiThread("three");

System.out.println(ob1.t.isAlive());
System.out.println(ob2.t.isAlive());
System.out.println(ob3.t.isAlive());

try {

 ob1.t.join();
 ob2.t.join();
 ob3.t.join(); 

  } catch(InterruptedException e) {

      e.printStackTrace();
  }
    System.out.println("exiting main");
    System.out.println(ob1.t.isAlive());
    System.out.println(ob2.t.isAlive());
    System.out.println(ob3.t.isAlive());
 }
}