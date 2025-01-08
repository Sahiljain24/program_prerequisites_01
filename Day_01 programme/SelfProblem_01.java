import java.util.Scanner;

public class SelfProblem_01 {

    public static void main(String[] args) {
        // Write a program to calculate simple interest using the formula:
        Scanner sc = new Scanner(System.in);
       int Principal = sc.nextInt();
       int Rate = sc.nextInt();
       int Time = sc.nextInt();
       int   Simple_Interest = ((Principal * Rate * Time) / 100);
       System.out.println(Simple_Interest);
    }
}