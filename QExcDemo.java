class QExcDemo {

public static void main (String args[]) {

FixedQueue q = new FixedQueue(10);

char ch;

try {

for (int i = 0; i < 11; i++) {

ch = (char) ('A' + i);

q.put(ch);

 }
}
catch (QueueFullException exc) {

System.out.println(exc);
 }


try {

for (int i = 0; i < 11; i++) {

ch = q.get();

System.out.println(ch);

 }
}

catch (QueueEmptyException exc) {

System.out.println(exc);
     }
 }
}