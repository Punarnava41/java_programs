abstract class shape{
    int lenght ,breadth;
    abstract void printarea();
}
class rectangle extends shape{
    rectangle(int length,int breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }
    @Override
    void printarea()
    {
        int area=length*breadth;
        System.out.println("Area of the rectangle ="+area);
    }
}
class triangle extends shape{
    triangle(int height,int width)
    {
        this.length=height;
        this.breadth=width;
    }
    @Override
    void printarea()
    {
        double area=0.5*length*breadth;
        System.out.println("Area of the triangle ="+area);
    }
}
class circle extends shape{
    circle(int radius)
    {
        this.length=radius;
    }
    @Override
    void printarea()
    {
        double area=3.14*l*l;
        System.out.println("Area of the circle ="+area);
    }
}
public class abstract_class
{
    public static void main(String []args)
    {
        
        shape rectangle = new rectangle(5, 10);
        shape triangle = new triangle(6, 8);
        shape circle = new circle(7);
        
        rectangle.printarea();
        triangle.printarea();
        circle.printarea();
    }
}

// O/P:

Area of the rectangle:50.0
Area of the triangle:24.0
Area of the circle:153.8