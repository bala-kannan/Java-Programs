interface Phone {

 public void show();

}


class IPhone {

public static void main(String[] args) {

Phone p = new IPhone() {

  public void show() { System.out.println("IOS, Apple"); }

  };

p.show();
 }
}