class Student{

int rollno;

String name;

static String college = "DC";

Student(int r,String n){

rollno = r;

name = n;


}
void display(){System.out.println(rollno+" "+name+" " +college);}
}
public class TestStaticVariable1{
public static void main(String  args[]){
Student s1 = new student(111,"Naveen k");
Student s1 = new student(222,"Arun");
s1.display();
s1.display();
}
}

