class Exception
{
public static void main(String args[])
{
try
{
int data = 50/0;
System.out.println(data);

}
catch(ArithmeticException e)
{
System.out.println("Exception is:"+e);
}
try
{
int a[] = new int[5];
a[5] = 30;
System.out.println(a[5]);
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("Exception is:"+e);
}
System.out.println("Exception handled");
}

}
