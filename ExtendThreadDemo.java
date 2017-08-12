class ExtendThreadDemo {

public static void main (String[] args) {

new NewThread1();


try {

  for (int n = 10; n > 0; n--) {

  System.out.println("Main: " + n);

  Thread.sleep(1000);

   }
  }
catch (InterruptedException e) {

  e.printStackTrace();

   }
 System.out.println("Exiting Main");
  }
}
  

class NewThread1 extends Thread {

Thread t;

NewThread1() {

super("Demo");

start();

}

public void run() {

try {

  for (int n = 10; n > 0; n--) {

  System.out.println("Child :" + n);

  t.sleep(500);

   }
  }
catch (InterruptedException e) {

  e.printStackTrace();

   }
 System.out.println("Exiting Child");
  }
 }