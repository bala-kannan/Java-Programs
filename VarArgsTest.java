class VarArgsTest {

public static void walk (int start, int...nums) {

System.out.println(nums.length);

 }

public static void main (String[] args) {

walk(1);

walk(1,2);

walk(1,2,3,4);

walk(1, new int[] {7,8,9});

walk(0, null);

 }
}