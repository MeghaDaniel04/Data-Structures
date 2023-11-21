import java.util.Scanner;
class overloading
{ 
double p;
overloading(int r)
{
p=2*3.14*r;
System.out.println("perimeter of circle:"+p);
}
overloading(int h, int t, int b)
{
p=h+t+b;
System.out.println("perimeter of triangle:"+p);
}
overloading(int l, int b)
{
p=2*(l+b);
System.out.println("perimeter of rectangle:"+p);
}
void display()
{

}

}
class perimeter
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
overloading[] shape = new overloading[3];
System.out.println("Enter the radius of circle");
int r = sc.nextInt();
System.out.println("Enter the sides of triangle");
int h = sc.nextInt();
int t = sc.nextInt();
int q = sc.nextInt();
System.out.println("Enter the length and breadth of  rectangle");
int l = sc.nextInt();
int b = sc.nextInt();
System.out.println();
shape[0] = new overloading(r);
shape[1] = new overloading(h,t,q);
shape[2] = new overloading(l,b);
}

}

