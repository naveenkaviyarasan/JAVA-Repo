import java.util.Scanner;
class Swap {
public static void main(String args[]){
int a;
int b;
System.out.println("Enter the A value");
Scanner sc = new Scanner(System.in);
int A = sc.nextInt();
System.out.println("Enter the B value");
//Scanner sc = new Scanner(System.in);
int B = sc.nextInt();

A = A+B;
B = A-B;
A = A-B;

     System.out.println("After swapping:");
        System.out.println("a = " + A);
        System.out.println("b = " + B);
    }
}


