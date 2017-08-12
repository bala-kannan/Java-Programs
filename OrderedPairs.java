import java.util.*;

class OrderedPairs {
public void printAllPossibleOrderedPairs(int[] arrayOfItems) {
    for (int firstItem : arrayOfItems) {
        for (int secondItem : arrayOfItems) {
            int[] orderedPair = new int[]{firstItem, secondItem};
            //System.out.println(Arrays.toString(orderedPair));
              System.out.println(firstItem, secondItem); 
        }
    }
}

public static void main (String[] args) {

OrderedPairs op = new OrderedPairs();
op.printAllPossibleOrderedPairs(new int[10]);

 }
}