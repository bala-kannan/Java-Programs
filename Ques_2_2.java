class Ques_2_2 {

 protected int Id;

 protected String name;

 public boolean equals (Ques_2_2 q) {

   return this.name.equals(q.name);
 
}

public static void main (String[] args) {

  Ques_2_2 q1 = new Ques_2_2();

  Ques_2_2 q2 = new Ques_2_2();

  q1.name = "abc";

  q2.name = "abc";

  if (q1.equals((Object)q2)) System.out.println ("true");
  else
    System.out.println("false");

  }
}     