class Q {

private int putloc, getloc;

private char[] q;

Q (int size) {

q = new char[size];

putloc = getloc = 0;

}

Q (Q ob) {

putloc = ob.putloc;
getloc = ob.getloc;
q = new char[ob.q.length];

for (int i = getloc; i < putloc; i++)
q[i] = ob.q[i];

}

Q (char[] a) {

putloc = getloc = 0;
q = new char[a.length];

for (int i = 0; i < a.length; i++) 
  put(a[i]);
}

void put (char ch) {

if (putloc == q.length) {

System.out.println("Queue is full");
return;

 }

q[putloc++] = ch;

}

char get() {

if (getloc == putloc) {

System.out.println("Queue is empty");
return (char) 0;

 }

  return q[getloc++];
 }
}

class QDemo {

public static void main (String args[]) {

Q q1 = new Q(10);

char name[] = {'A','B','C'};

Q q2 = new Q(name);

int i;

for (i = 0; i < 10; i++)
  q1.put((char)('A' + i));

Q q3 = new Q(q1);

for (i = 0; i < 10; i++)
  System.out.print(q1.get());
  
for (i = 0; i < 3; i++)
  System.out.print(q2.get());

for (i = 0; i < 10; i++)
  System.out.print(q3.get());

 }
}