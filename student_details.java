import java.util.Scanner;
class student
{                                        

String name;
int rollno;
float mark[] = new float[5];
void read()
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter the name:");
name = sc.next();
System.out.println("Enter the roll number:");
rollno = sc.nextInt();
System.out.println("Enter the marks of 5 subjects");
for(int i=0; i<5;i++)
mark[i] = sc.nextFloat();
}
void display()
{
System.out.println("Details of the student");

System.out.println("Name: "+name);

System.out.println("Roll number: "+rollno);

System.out.println("Marks of 5 subjects: ");
for(int i=0; i<5;i++)
System.out.println(mark[i]);
}
}

class student_details
{
public static void main(String args[])
{
student st = new student();
st.read();
st.display();
}

}

