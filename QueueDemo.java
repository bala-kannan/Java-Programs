class Queue {

char q[];
int putloc, getloc;

Queue (int size) {
 q = new char[size]; 
 getloc = putloc = 0;
}

void put(char ch) {
if (putloc == q.length) {
  System.out.println ("Queue End");
  return;
  }
q[putloc++] = ch;
}

char get() {

if (getloc==putloc) {
  System.out.println("Queue empty");
  return (char) 0;
  }
 return q[getloc++]; 
 }
}

class QueueDemo {

public static void main(String args[]) {

Queue BigQ = new Queue(50);
Queue SmallQ = new Queue(5);

int i;
char ch;

for (i = 0; i < 26; i++)
   {ch = (char) ('A' + i);
   BigQ.put(ch);}

for (i = 0; i < 26; i++)
   System.out.println(BigQ.get());

System.out.println("Small Queue");

for (i = 0; i < 6; i++)
   SmallQ.put((char) ('Z' - i));

for (i = 0; i < 6; i++)
   System.out.println(SmallQ.get());

 }
}  