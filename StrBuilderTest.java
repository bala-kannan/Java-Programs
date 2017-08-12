class StrBuilderTest {

public static String hidePhone (String phoneNumber) {

return new StringBuilder("xxx-xxx-")+phoneNumber.substring(8);

}

public static void main (String[] args) {

System.out.println(hidePhone("201-921-2193"));

 }
}

