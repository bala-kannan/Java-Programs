// Factorial

class Factorial {

long result;

long factR (int num) {

if (num == 1) return 1;

result = factR(num - 1) * num;

return result;

 }
}

class Fact {

public static void main (String args[]) {

Factorial fact = new Factorial();

System.out.println(fact.factR(25));

 }
}
