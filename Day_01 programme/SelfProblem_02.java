import java.util.Scanner;

public class SelfProblem_02 {

    public static void main(String[] args) {
        // 2. Perimeter of a Rectangle
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int width = sc.nextInt();
        int Perimeter = 2*(length+width);
        System.out.println(Perimeter);
    }
}