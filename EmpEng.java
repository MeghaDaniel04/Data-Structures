class Employee
{
void display()
{
System.out.println("Name of the class is Employee");
}
void calSalary()
{
System.out.println("Salary of Employee is 10000");
}
}

class Engineer extends Employee
{
void display()
{
super.display();
System.out.println("Name of the class is Engineer");
}
void calSalary()
{
super.calSalary();
System.out.println("Salary of Engineer is 20000");
}
}
class EmpEng
{
public static void main(String args[])
{
Engineer En1 = new Engineer();
En1.display();
En1.calSalary();
}

}
