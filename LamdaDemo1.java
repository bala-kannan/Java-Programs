interface MyNumber {

double getValue();

}

class LamdaDemo1 {

public static void main (String[] args) {

MyNumber myNum;

myNum = () -> 123.56;

System.out.println(myNum.getValue());

myNum = () -> Math.random() * 200;

System.out.println(myNum.getValue());

 }
}