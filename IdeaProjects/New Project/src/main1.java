public class main1 {


    public static void main(String[] args) {
        circle c1= new circle(10);
        System.out.println(c1.area());
        System.out.println(c1.circumference());


        circle c2= new circle();
        System.out.println(c2.area());
        System.out.println(c2.circumference());

        square s1= new square(10);
        s1.area();
    }

}
class circle
{
public int radius;
public static final double PI=3.141;
public int a;
public int b;
circle() {

}
circle(int radius)
{
    this.radius=radius;
}


    public  double area() {

        return PI* radius * radius;
    }
    public double circumference()
    {System.out.println(b);
        return 2*PI*radius;
    }
}
class square {
    int length;
    square(int l)
    {
        length=l;
    }
    public  void area() {
        System.out.println(length * length);
    }
}