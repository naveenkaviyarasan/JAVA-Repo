import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int number1 = in.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = in.nextInt();

        int hcf = findHCF(number1, number2);

        System.out.println("The HCF of " + number1 + " and " + number2 + " is: " + hcf);
    }

    private static int findHCF(int number1, int number2) {
        while (number2 != 0) {
            int temp = number2;
            number2 = number1 % number2;
            number1 = temp;
        }
        return number1;
    }
}
