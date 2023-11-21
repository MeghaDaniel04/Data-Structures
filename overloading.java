import java.util.Scanner;
class method_overloading
{ 
 void area(int r)
{
System.out.println("Area of circle: "+(3.14*r*r));
}
 void area(int h, float b)
{
System.out.println("Area of triangle: "+(0.5*b*h));
}
void area(int l, int b)
{
System.out.println("Area of rectangle: "+(l*b));
}
}
class overloading
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter the radius of the circle");
int r = sc.nextInt();
System.out.println("Enter the height and breadth of the triangle");
int h = sc.nextInt();
float t = sc.nextFloat();
System.out.println("Enter the length and breadth of the rectangle");
int l = sc.nextInt();
int b = sc.nextInt();
method_overloading mo= new method_overloading();
mo.area(r);
mo.area(h,t);
mo.area(l,b);
}

}

