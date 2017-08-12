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

class MultiThreadDemo {

public static void main(String[] args) {

new MultiThread("one");
new MultiThread("two");
new MultiThread("three");

try {

for (int n = 5; n > 0; n--) {

System.out.println("main: " + n);

Thread.sleep(1000);

  } 
 } catch(InterruptedException e) {

      e.printStackTrace();
  }
    System.out.println("exiting main");
 }
}