import java.util.*;

public class B1 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number a:");
        int a = in.nextInt();
        System.out.print("Enter number b:");
        int b = in.nextInt();
        System.out.print("Enter number c:");
        int c = in.nextInt();
        if (a <= b && a <= c) {
            System.out.println("Min is " + a);
        }
        else if (b <= a && b <= c) {
            System.out.println("Min is " + b);
        }
        else {
            System.out.println("Min is " + c);
        }

    }
}