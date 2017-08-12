// Queue

class QueueAlloc {

private char[] q;

private int getloc, putloc;

QueueAlloc (int size) {

q = new char[size];

getloc = putloc = 0;

}

void putloc(char ch) {

if (putloc == q.length) {

System.out.println ("Queue is full");
}

q[putloc++] = ch;
}

char getloc() {

if (getloc == putloc) {

System.out.println("Queue is empty");

}

return (char) q[getloc++];
 }
}

class QueueTest {

public static void main (String args[]) {

QueueAlloc bigQ = new QueueAlloc(50);
QueueAlloc smallQ = new QueueAlloc(5);

for (int i=0; i < 26; i++) {

bigQ.putloc((char) ('a' + i));
}

for (int j=0; j < 26; j++) {

System.out.println(bigQ.getloc());

}
for (int i=0; i < 5; i++) {

smallQ.putloc((char) ('A' + i));
}

for (int j=0; j < 5; j++) {

System.out.println(smallQ.getloc());

  }
 }
}