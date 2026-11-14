import java.util.*;

public class C1 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = in.next().charAt(0);
        if ("aeiouAEIOU".indexOf(ch) != -1) {
            System.out.println("Vowel");
        }
        else {
            System.out.println("Not vowel");
        }

    }
}