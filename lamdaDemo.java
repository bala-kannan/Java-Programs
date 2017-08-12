interface MyValue {

double getValue();

}

interface MyParamValue {

double getParamValue(double v);

}

class lamdaDemo {

public static void main (String args[]) {

MyValue myVal;

myVal = () -> 98.6;

System.out.println(myVal.getValue());

MyParamValue myPVal;

myPVal = (n) -> 1/n;

System.out.println(myPVal.getParamValue(4));

System.out.println(myPVal.getParamValue(16));

 }
}

