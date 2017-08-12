interface IntPredicate {

boolean test (MyIntNum mn, int n);

}

class MyIntNum {

int v;

MyIntNum(int x) {v = x;}

int getNum() {return v;}

boolean isFactor(int n) {

return (v%n == 0);

 }
}

class MyIntPredDemo3 {

public static void main (String args[]) {

boolean result;

MyIntNum myNum = new MyIntNum(12);

MyIntNum myNum2 =new MyIntNum(16);

IntPredicate ip = MyIntNum::isFactor;

result = ip.test(myNum, 3);

if (result) System.out.println ("3 is a factor of" + myNum.getNum());

result = ip.test(myNum2, 3);

if (!result) System.out.println ("3 is not a factor of" + myNum2.getNum());

 }
}