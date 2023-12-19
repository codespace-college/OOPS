class bike{
  //declaring the variables
  String brand;
  int speed;
  //creating a constructor
  bike(String b,int s){
    this.brand=b;
    this.speed=s;
  }
  //function to display the values
  void display(){
    System.out.println();
    System.out.println("brand of the bike is: "+brand);
    System.out.println("speed of the bike is: "+speed);
  }
}
class p12 {
  public static void main(String[] args) {
    //creating the objects with reference to the above class
    bike b1= new bike("Apache",250);
    bike b2= new bike("Ninja",300);
    //calling the display function
    b1.display();
    b2.display();
  }
}