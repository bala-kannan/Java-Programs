class Armstrong {

public static void main (String[] args) {

int j,k,l, sum;

for (int i = 1; i < 1000; i++) {

l = i;
sum = 0;
  do
   {
   j = l % 10; 
   sum = sum + (j * j * j); 
   l = l / 10;  

   } while (l > 0);

   

  if (i == sum)
 System.out.println(i);
  }
 }
}