class ByTwos implements Series {

int val, start, prev;

ByTwos() {

val = 0;
start = 0;
prev = -2;

}

public int getNext() {

val += 2;

return val;

}

public void reset() {

val = start;
prev = -2;

}

public void setStart(int x) {

val = x;
start = x;
prev = x - 2;

 }

public int getPrev() {

prev -= 2;

return prev;
 }
}

class ByTwosDemo {

public static void main(String args[]) {

Series serob;

ByTwos ob = new ByTwos();

for (int i = 0; i < 5; i++)
  System.out.println(ob.getNext());

ob.reset();


for (int i = 0; i < 5; i++)
  System.out.println(ob.getNext());

serob = ob;
serob.setStart(200);

for (int i = 0; i < 5; i++)
  System.out.println(serob.getNext());

for (int i = 0; i < 5; i++)
    System.out.println(ob.getPrev()); 
 }
}