import java.util.Scanner;
public class MarksAverage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num =in.nextInt();
int sum = 0;
int counter = 1;

while (counter <= 7) {

    sum += counter;

    counter += 2;
}

System.out.println("Sum = " + sum);
System.out.println("Counter = " + counter);
    }
}