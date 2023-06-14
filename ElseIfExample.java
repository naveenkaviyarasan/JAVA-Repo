import java.util.Scanner;

class ElseIfExample{

public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter your Mark :");
int mark = sc.nextInt();

if(mark<=35){
System.out.println("Grade C ");
}else if(mark>=36 && mark<=75){
System.out.println("Grade B ");
}else if(mark>=76 && mark<=90){
System.out.println("Grade A+ ");
}else if(mark>=91 && mark<=100){
System.out.println("Grade B+ ");
}else{
System.out.println("veliya poda");
}
}
}