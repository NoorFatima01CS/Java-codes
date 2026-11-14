import java.util.Scanner;
public class ScoreMonitor {
    public static boolean isValidMark(int mark) {
        if(mark >= 0 && mark <= 100) {
            return true;
        }
        else {
            return false;
        }
    }
    public static char grade(double average) {
        if(average >= 80) {
            return 'A';
        }
        else if(average >= 65) {
            return 'B';
        }
        else if(average >= 50) {
            return 'C';
        }
        else {
            return 'F';
        }
    }
    public static int countVowels(String name) {
        int count = 0;
        for(int i = 0; i < name.length(); i++) {
            char ch = Character.toLowerCase(name.charAt(i));
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        name = name.trim();
        int sum = 0;
        int validcount = 0;
        int rejectedcount = 0;
        while(true) {
            int marks = in.nextInt();
            if(marks == -1) {
                break;
            }
            else if(!isValidMark(marks)) {
                rejectedcount++;
            }
            else {
                sum = sum + marks;
                validcount++;
            }
        }


        System.out.println("Name: " + name);
        System.out.println("Vowels: " + countVowels(name));
        System.out.println("Valid: " + validcount);
        System.out.println("Rejected: " + rejectedcount);

        if(validcount > 0) {

            double average = sum / (double) validcount;
            System.out.printf("Average: %.2f%n", average);
            System.out.println("Grade: " + grade(average));
        }
        else {

            System.out.println("No valid marks");
        }

    }
}