interface InclNum {

boolean test (int n);

}

class InclNumDemo {

public static void main (String args[]) {

InclNum in = (n) -> (n >= 10 & n <= 20);

System.out.println(in.test(21));

 }
}

