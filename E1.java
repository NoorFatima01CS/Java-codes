import java.util.*;
public class E1{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Character: ");
        char ch = in.next().charAt(0);
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Vowel");
                break;

            default:
                System.out.println("Consonant");
        }
    }
}