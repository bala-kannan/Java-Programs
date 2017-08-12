interface NumFunc {

int func (int n);

}

class NumFuncDemo {

public static void main (String args[]) {

NumFunc smallF = n -> {

int result = 1;

for (int i = 2; i <= n/i; i++) {

if (n % i == 0) result = i;

break;
 }

 return result;
};

System.out.println(smallF.func(12));

System.out.println(smallF.func(9));

 }
}

 