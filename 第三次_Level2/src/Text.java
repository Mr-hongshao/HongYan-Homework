/**
 * Created by Shenghong_Li on 2016/10/26.
 */
abstract class Shape{
    public abstract double getArea();
}
class Triangle extends Shape{
    private double lenght1;
    private double lenght2;
    private double lenght3;

    Triangle(double len1,double len2,double len3){
        this.lenght1 = len1;
        this.lenght2 = len2;
        this.lenght3 = len3;
    }

    public double getArea(){
        double p;
        p =(lenght1 + lenght2 + lenght3)/2;
        return p*Math.sqrt(p*(p-lenght1)*(p-lenght2)*(p-lenght3));
    }
}
class Square extends Shape{
    protected double lenght;
    Square(float len){
        this.lenght = len;
    }
    public double getArea(){
        return lenght*lenght;
    }
}
class Circle extends Shape{
    protected float radius;
    final double Pi = 3.1415926;
    Circle(float R){
        this.radius = R;
    }
    public double getArea(){
        return radius*radius*Pi;
    }
}
public class Text {
    public static void main(String args[]){
        Triangle tri1 = new Triangle(3,4,5);
        Square squ1 = new Square(2);
        Circle cir1 = new Circle(4);
        System.out.println("Triangle's area = "+tri1.getArea());
        System.out.println("Square's area = "+squ1.getArea());
        System.out.println("Circle's area = "+cir1.getArea());
    }
}
