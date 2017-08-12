class NewThreadDemo {

public static void main (String[] args) {

new NewThread();


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
  

class NewThread implements Runnable {

Thread t;

NewThread() {

t = new Thread(this, "Demo");

System.out.println(t);

t.start();

}

public void run() {

try {

  for (int n = 10; n > 0; n--) {

  System.out.println("Child :" + n);

  t.sleep(5000);

   }
  }
catch (InterruptedException e) {

  e.printStackTrace();

   }
 System.out.println("Exiting Child");
  }
 }