import java.util.Scanner;
class Pyramid {
public static void main(String args[]) {
int i, j;
Scanner sc = new Scanner(System.in);
System.out.println("Enter no of rows");
int n=sc.nextInt();
for (i=0; i<n; i++){ 
    
for (j=n-i; j>1; j--){  

System.out.print(" ");   
}

for (j=0; j<=i; j++ ){

System.out.print("* ");
}
System.out.println();
}
}
}