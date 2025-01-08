import java.util.Scanner;

public class SelfProblem_03 {
    public static void main(String[] args) {
        // Power Calculation
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int exponent = sc.nextInt();
        System.out.println(Math.pow(base, exponent));
    }
}
