class ArrayNumbers {
public void printAllNumbersThenAllPairSums(int[] arrayOfNumbers) {

    System.out.println("these are the numbers:");
    for (int number = 0; number < arrayOfNumbers.length; number++) {
        System.out.println(number);
    }

    System.out.println("and these are their sums:");
    for (int firstNumber = 0; firstNumber < arrayOfNumbers.length; firstNumber++) {
        for (int secondNumber = 0; secondNumber < arrayOfNumbers.length; secondNumber++) {
            System.out.println(firstNumber + secondNumber);
        }
    }
}

public static void main (String[] args) {

ArrayNumbers an = new ArrayNumbers();

an.printAllNumbersThenAllPairSums(new int[10]);

 }
}