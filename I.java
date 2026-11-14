import java.util.Scanner;
public class I {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Units: ");
        int units = in.nextInt();
        int bill;
        if (units <= 300) {
            bill = units * 12;
        } else if (units <= 500) {
            bill = units * 15;
        } else {
            bill = units * 17;
        }
        System.out.println("Electricity Bill = " + bill);

        
    }
}