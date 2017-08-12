class Stack {

char[] Stk;

int putloc;

Stack (int size) {

Stk = new char[size];

putloc = 0;

}

Stack (char[] name) {

Stk = new char[name.length];

putloc = 0;

for (int i = 0; i < name.length; i++)
 push(name[i]);
}

Stack (Stack ob) {

putloc = ob.Stk.length;

Stk = new char[ob.Stk.length];

for (int i = 0; i < putloc; i++)
 Stk[i] = ob.Stk[i];

}
 

void push(char ch) {

if (putloc == Stk.length) {
  System.out.println("Top of Stack reached");
  return;
  }
  Stk[putloc] = ch;
  putloc++;
}

char pop() {

if (putloc == 0) {
  System.out.println("Stack bottom reached");
  return (char) 0;
  } 

putloc--;
return Stk[putloc];

 }
}

class StackDemo {

public static void main (String args[]) {

Stack st1 = new Stack(10);

char[] name = {'T','O','M'};

Stack st2 = new Stack(name);



int i;

for (i = 0; i < 10; i++)
  st1.push((char) ('A' + i));

for (i = 0; i < 10; i++)
  System.out.print(st1.pop());

for (i = 0; i < 3; i++)
  System.out.print(st2.pop());
 
Stack st3 = new Stack(st1);

for (i = 0; i < 10; i++)
  System.out.print(st3.pop());
 }
}
