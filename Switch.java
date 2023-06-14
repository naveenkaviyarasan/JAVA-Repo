import java.util.Scanner;

class Switch{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter your movie for : ");
String movie = sc.nextLine();
System.out.println("Enter your rating for : ");
int rating = sc.nextInt();

switch(rating){
case 5:
System.out.println("This movie is good  ");
break;
case 4:
System.out.println("This movie is bad ");
break;
case 3:
System.out.println("average");
break;
case 2:
System.out.println("ok");
break;
case 1:
System.out.println("very bad");
break;

default:
System.out.println("Try to rate from 1-5,thanks! ");
break;






}

}
}