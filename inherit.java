import java.util.Scanner;
class Employee
{
String name;
int age;
long phno;
String address;
int salary;

Employee(String name, int age, long phno, String address, int salary)
{
this.name=name;
this.age=age;
this.phno=phno;
this.address=address;
this.salary=salary;
} 
void display()
{
System.out.println("Name:"+name);
System.out.println("Age"+age);
System.out.println("Phone Number:"+phno);
System.out.println("Address:"+address);

}
void print_Salary()
{
System.out.println("Salary of the employee:"+salary);
}
}
class Officer extends Employee
{
String specialization;
Officer(String name, int age, long phno, String address, int salary)
{
super(name, age, phno, address, salary);
System.out.println("\nDetails of officer");
display();
print_Salary();
}
}
class Manager extends Employee
{
String department;
Manager(String name, int age, long phno, String address, int salary)
{
super(name, age, phno, address, salary);
System.out.println("\nDetails of manager");
display();
print_Salary();
}
}
class inherit
{
public static void main(String args[])
{
Officer O1 = new Officer("Megha", 32, 949557667,"Mumbai",500000 );
Manager O2 = new Manager("Nanma", 32, 949554267,"Dehradun",2500000 );
}
}

