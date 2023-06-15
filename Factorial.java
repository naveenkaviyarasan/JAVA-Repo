import java.util.Scanner;

class Factorial{
public static void main(String args[]){
int num,i=1,f=1;
System.out.println("Enter the value");
Scanner sc = new Scanner(System.in);
int abc = sc.nextInt();
 
for(i=1;i<=abc;i++){
f = f*i;
}
System.out.println("Factorial of is " + f);
}
}






