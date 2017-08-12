class MultiDim {

public static void main (String[] args) {

int[][] twoD = new int[3][2];

for (int i = 0; i < twoD.length; i++) 
  for (int j = 0; j < twoD[i].length; j++) 
     twoD[i][j] = i + j;

for (int[] inner : twoD) 
  for (int nums : inner) 
     System.out.println(nums);

 }
}