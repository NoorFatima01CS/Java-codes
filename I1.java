import java.util.Scanner;

public class I1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int factorial = 1;
        while (num > 0) {
            factorial = factorial * num;
            num--;
        }
        System.out.println("Factorial = " + factorial);
    }
}