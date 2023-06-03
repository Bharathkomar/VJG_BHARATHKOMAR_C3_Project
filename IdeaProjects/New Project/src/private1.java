public class private1{
    public static void main(String[] a) {
        Circle c1 = new Circle(2f);
        printCircle(c1);
        System.out.println ("The radius of the circle:"+c1.getRadius());
        c1.setRadius(5f);
        printCircle(c1);
        System.out.println("The radius of the circle:"+c1.getRadius());
    }

    public static void printCircle(Circle c){


        System.out.println("area of circle = " + c.area());
    }
}

class Circle{
   private float radius;
    public static final float PI = 3.1414f;

    public Circle(float radius) {
        setRadius(radius);
        }
    public float getRadius()
    {
        return this.radius;
    }
    public void setRadius(float radius)
    {
        if(radius>=0)
        {
            this.radius = radius;
        }
    }
    private float square(float radius)
    {
        return radius*radius;
    }
    public float area(){
        return PI * square(this.radius);
    }
}





