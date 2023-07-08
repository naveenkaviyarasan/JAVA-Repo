//class subclass extends superclass
//{
//instance variable declaration;
//Instance nethod definition;
//}

class A
{
int a =1,b=2;
void print()
{
System.out.println(a+" "+b);
}
}
class B extends A
{
int c =3;
void display()
{
System.out.println(a+" "+b+" "+c);
}
}
class Demo
{
public static void main(String args[])
{
B x=new B();
x.print();
x.display();
x.a=10;
x.a=20;
x.c=30;
x.print();
x.display();
}
}


