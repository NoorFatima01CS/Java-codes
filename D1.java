import java.util.*;

public class D1 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Character: ");
        char ch = in.next().charAt(0);
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Capital Letter");
        }
        else if (ch >= 'a' && ch <= 'z') {
            System.out.println("Small Letter");
        }
        else if (ch >= '0' && ch <= '9') {
            System.out.println("Digit Number");
        }
        else {
            System.out.println("Special Symbol");
        }

    }
}