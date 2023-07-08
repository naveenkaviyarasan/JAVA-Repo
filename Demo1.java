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
class C extends A
{
int d =4;
void display1()
{
System.out.println(a+" "+b+" "+c+" "+d);
}
}


}
class Demo1
{
public static void main(String args[])
{
B x=new B();
C y=new C();
x.print();
x.display();
x.a=10;
x.a=20;
x.c=30;
x.print();
x.display();
y.print();
y.display1();
y.a=10;
y.a=20;
y.c=30;
x.print();
x.display();
}
}

