class CallMe {

synchronized void call (String msg) {

System.out.print("[");

try {

Thread.sleep(1000);

} catch(InterruptedException e) {

  e.printStackTrace();
 
  }
System.out.println(msg + "]");

 }

}

class Caller implements Runnable {

Thread t;

CallMe target;

String msg;

Caller (CallMe targ, String s) {

target = targ;
msg = s;
t = new Thread(this);
t.start();

}

public void run() {

synchronized(target){
    target.call(msg);
  }
 }
}

class PriorityThread {

public static void main (String[] args) {

CallMe target = new CallMe();

Caller ob1 = new Caller(target, "Hello");
Caller ob2 = new Caller(target, "Synch");
Caller ob3 = new Caller(target,"World");
Caller ob4 = new Caller(target,"Test");

try {
	ob1.t.join();
	ob2.t.join();
	ob3.t.join();
        ob4.t.join();
    } catch (InterruptedException e) {
        e.printStackTrace();
    }


 }
}


   