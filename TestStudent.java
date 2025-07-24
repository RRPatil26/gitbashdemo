public class TestStudent{

public static void main(String args[])
{
String stuName="JK";
int rollNo=22;

Student s1=new Student();
Student s2=new Student("Rashmi");
Student s3=new Student("RashmiP",11);

s1.displayInfo();
s2.displayInfo();
s3.displayInfo();
}
}