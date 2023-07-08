class Student{
int rollno;
String name;
float fee;
Student(int rollno,String name,float fee){
rollno=rollno;
name=name;
fee=fee;
}
void display(
{System.out.println(rollno+""+name+""+fee);}
}
class TestThis1{
public static void main(String args[]){
Student s1 = new Student(111,"Naveen",4000f);
Student s1 = new Student(111,"Hari",6000f);
s1.display();
s1.display();
}
}
