// class MinMax

class MinMax {

public static void main (String args[]) {

int nums[] = {10, 20, -30, 40, 50, 60, 1, 11, 100, 43};

int min = nums[0], max = nums[0];

for (int x : nums) 
        {
 
	min = (min < x) ? min:x;

	max = (x > max) ? x:max;
        }
System.out.println (min + " " + max);

 }
}

