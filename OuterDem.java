class OuterDemStat {

int i;

 static class Inner {

   int j;

 }

public static void main (String[] args) {

OuterDemStat.Inner in = new OuterDemStat.Inner();

in.j = 5;

System.out.println(in.j);

 }
}