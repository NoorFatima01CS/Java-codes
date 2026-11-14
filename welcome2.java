public class welcome2 {
    public static void main(String[] args) {
        double sum = 1;
        int i = 2;
        while (i <= 100) {
            sum = sum + (1.0 / i);
            i = i + 2;
        }
        System.out.println("Sum = " + sum);
    }
}