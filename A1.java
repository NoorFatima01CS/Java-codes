import java.util.*;

public class A1 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number a:");
        int a = in.nextInt();
        System.out.print("Enter number b:");
        int b = in.nextInt();
        System.out.print("Enter number c:");
        int c = in.nextInt();
        if (a == b) {
            if (b == c) {
                System.out.println("All numbers are equal");
            }
            else {
                System.out.println("Not equal");
            }

        }
        else {
            System.out.println("Not equal");
        }
    }
}