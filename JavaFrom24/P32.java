import java.util.Scanner;
 
abstract class calcArea {
    abstract double findTriangle(double b, double h);
    abstract double findRectangle(double l, double b);
}
 
class findArea extends calcArea {
 
    double findTriangle(double b, double h)
    {
        double area = (b * h) / 2;
			return area;
    }
 
    double findRectangle(double l, double b)
    {
        double area = l * b;
			return area;
    }
}
 
class P32 {
    public static void main(String args[])
    {
        double l, b, h;
        findArea area = new findArea();
        Scanner s = new Scanner(System.in);
 
        System.out.println("Enter Base & Vertical Height of Triangle: ");
        b = s.nextDouble();
        h = s.nextDouble();
        System.out.println("Area of Triangle = " + area.findTriangle(b, h));
 
        System.out.println("Enter Length & Breadth of Rectangle: ");
        l = s.nextDouble();
        b = s.nextDouble();
        System.out.println("Area of Rectangle = " + area.findRectangle(l, b));
    }
}   