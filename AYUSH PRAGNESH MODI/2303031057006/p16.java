//program to find the importance and working of the inner classes
class outerclass{
    private int outerData=10;
    //inner class defination
    class innerclass{
        void display(){
            System.out.println("InnerClass: Accessing OuterData from Inner Class: "+outerclass);
        }
    }
    //method that uses the innerclass
    void useinnerclass(){
        innerclass inner=new innerclass();
        inner.display();
    }
}
public class p16{
    public static void main(String[] args){
        outerclass outer= new outerclass();
        outer.useinnerclass();
        outerclass.innerclass innerdirect=outer.new innerclass();
        innerdirect.display();
    }
}