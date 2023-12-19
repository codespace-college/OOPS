//program to use super with variables in java 
class Parent{
    String message="Hello from Parent";
}
class Child extends Parent{
    String message="Hello from child";
    void displayMessages(){
        System.out.println("Parent Message: "+super.message);
        System.out.println("Child Message: "+this.message);
    }
}
public class superwithvariables{
    public static void main(String[] args){
        Child child=new Child();
        child.displayMessages();
    }
}