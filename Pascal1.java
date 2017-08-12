import java.util.Scanner;
public class Pascal1{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
	    int a, num;
        System.out.print("How big do you want the Pascal's triangle to be(zero-based indexing): ");
        int size=input.nextInt();
	    for (int i = 0; i <= size; i++) 
	    {
	        num = 1;
	        a = i + 1;

	        for(int j=size;j>0;j--)
	        { 
	            if(j>i)
	                System.out.print(" ");
	        }

	        for (int j = 0; j <= i; j++) 
	        {
	            if (j > 0) 
	                num = num * (a - j) / j;   

	            System.out.print(num + " ");
	        }
	        System.out.println();
	    } 
	}
}