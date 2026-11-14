import java.util.Scanner;
public class G {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int salary = in.nextInt();
        int grade = in.nextInt();
        double totalSalary;
        if (grade > 15) {
            totalSalary = salary + (salary * 0.50);
        } else {
            totalSalary = salary + (salary * 0.25);
        }
        System.out.println("Total Salary: " + totalSalary);

      
    }
}