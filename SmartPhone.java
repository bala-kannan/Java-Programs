interface Phone {

public void show();

}


class SmartPhone {

public static void main(String[] args) {

Phone iPhone = new Phone() {

public void show() {

 System.out.println("IOS, Apple");

  }
};
    
iPhone.show();

 }
}