//program on implementing interfaces
interface shape{
    double calculatearea();
}
class circle implements shape{
    private double radius;
    public circle(double radius){
        this.radius=radius;
    }
    @Override
    public double calculatearea(){
        return Math.PI*radius*radius;
    }
}
public class p17{
    public static void main(String[] args){
        circle circle=new circle(5.0);
        double area=circle.calculatearea();
        System.out.println("Area of circle: "+area);
    }
}