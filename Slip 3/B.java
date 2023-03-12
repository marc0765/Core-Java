// Define an abstract class Shape with abstract methods area() and volume(). Derive abstract class Shape into two classes Cone and Cylinder.
// Write a java Program to calculate area and volume of Cone and Cylinder (Use Super Keyword).

import java.util.Scanner;
abstract class Shape
{
    double r,h;
    Shape(double r, double h)
    {
        this.r = r;
        this.h = h;
    } 
    abstract double area();
    abstract double volume();
}

class Cone extends Shape
{
    Cone(double r, double h)
    {
        super(r, h);
    }
    double area()
    {
        return 3.14*r*(r+Math.sqrt(r*r+h*h));
    }
    double volume()
    {
        return 3.14*r*r*h/3;
    }
}

class Cylinder extends Shape
{
    Cylinder(double r, double h)
    {
        super(r, h);
    }
    double area()
    {
        return 2*3.14*r*(h+r);
    }
    double volume()
    {
        return 3.14*r*r*h;
    }
}

public class Slip3B 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter radius of cone: ");
        int r1 = s.nextInt();
        System.out.print("Enter height of cone: ");
        int h1 = s.nextInt();
        Shape s1 = new Cone(r1,h1);
        System.out.println("Area of cone: "+s1.area());
        System.out.println("Volume of cone: "+s1.volume());
        System.out.print("Enter radius of cylinder: ");
        int r2 = s.nextInt();
        System.out.print("Enter height of cylinder: ");
        int h2 = s.nextInt();
        Shape s2 = new Cylinder(r2,h2);
        System.out.println("Area of cylinder: "+s2.area());
        System.out.println("Volume of cylinder: "+s2.volume());
        s.close();
    }
}
