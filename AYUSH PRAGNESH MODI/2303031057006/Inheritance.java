//inheritance in java
class Animal{
    void sound(){
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Dog barks");
    }
}
public class Inheritance{
    public static void main(String[] args){
        Animal animal=new Animal();
        Dog dog=new Dog();
        animal.sound();
        dog.sound();
    }
}