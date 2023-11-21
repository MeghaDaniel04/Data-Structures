 import java.util.Scanner;
class Details
{
String name;
int empno;
long phno;

Details(String name, int empno, long phno)
{
this.name=name;
this.empno=empno;
this.phno=phno;
} 
void display()
{
System.out.println("Employee Name:"+name);
System.out.println("Employee Number:"+empno);
System.out.println("Phone number:"+phno);
}
}
class Employee
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter the number of employee");
int n = sc.nextInt();
Details[] employee = new Details[n];
for(int i=0;i<n;i++)
{
System.out.println("Enter the name of the employee");
String name = sc.next();
System.out.println("Enter the employee number");
int empNo = sc.nextInt();
System.out.println("Enter the phone number");
long phNo = sc.nextLong();
employee[i]=new Details(name,empNo,phNo);
System.out.println();
}
for(int i=0;i<n;i++)
{
employee[i].display();
System.out.println();
}

}

}
