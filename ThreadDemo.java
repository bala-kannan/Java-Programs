class ThreadDemo {

public static void main (String[] args) {

Thread t = Thread.currentThread();

System.out.println(t);

t.setName("My Thread");

System.out.println(t);

try {

  for (int n = 10; n > 0; n--) {

  System.out.println(n);

  t.sleep(1000);

   }
  }
catch (InterruptedException e) {

  e.printStackTrace();

   }
 System.out.println(t.isAlive());
  }
}
  