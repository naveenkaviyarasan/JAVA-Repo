class Student15{

int id;

String name;

int age;

Student15(int i,String n){

id = i;

name = n;

Student15(int i,String n,int a);{

id = i;

name = n;

age =a;

}

void display(){System.out.println(id +""+name+""+age);}

public static void main(String args[]){
Student15 s1 = new Student15(111,"Naveen");
Student15 s2 = new Student15(222,"Navin",23);

s1.display();
s2.display();
}
}
}


