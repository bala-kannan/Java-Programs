public class PassByVal {

public static void main (String[] args) {

int num = 123;

String str = "Test";

num = numbers(num);

System.out.println(num);

str = str(str);

System.out.println(str);

}

public static int numbers(int num) {

 num++;

 return num;

}

public static String str(String str) {

str = str + " Val";

return str;

 }

 
}
 

