import java.util.Scanner;

class ScannerExample {
public static void main(String arg[]){
System.out.println("Enter your name");
Scanner sc = new Scanner(System.in);
String name = sc.nextLine();
System.out.println("Your name is " + name);

System.out.println("Enter your age");
int age = sc.nextInt();
System.out.println("Your age is " + age);

System.out.println("Enter your float value");
float a = sc.nextFloat();
System.out.println("Your float value is " + a);

System.out.println("Enter your long value");
long b = sc.nextLong();
System.out.println("Your Long value is " + b);

System.out.println("Enter your double value");
double c = sc.nextDouble();
System.out.println("Your Double value is " + c);

System.out.println("Enter your short value");
short d = sc.nextShort();
System.out.println("Your short value is " + d);

System.out.println("Enter your bollean value");
boolean e = sc.nextBoolean();
System.out.println("Your Bollean value is "+ e);

System.out.println("Enter your byte value");
byte f = sc.nextByte();
System.out.println("Your byte value is " + f);

System.out.println("Enter your character");
char g = sc.next().charAt({0,10});
System.out.println("Your character is " + g);
}
}