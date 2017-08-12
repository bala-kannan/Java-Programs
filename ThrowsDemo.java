class ThrowsDemo {

static void throwDemo() throws IllegalAccessException {

System.out.println("Inside throw Demo");

throw new IllegalAccessException("demo");

 }

public static void main(String[] args) {

try {
 throwDemo();
} catch (IllegalAccessException e) {

e.printStackTrace();
 }

 }
}