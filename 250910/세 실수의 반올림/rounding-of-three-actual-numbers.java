import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        if (checkRange(a) && checkRange(b) && checkRange(c)) {
            System.out.printf("%.3f \n%.3f \n%.3f",a,b,c);
        } else {
            System.out.println("입력값이 조건(0 <= a, b, c <= 1000)을 벗어났습니다.");
        }

        sc.close();
    }

    private static boolean checkRange(double num) {
        return num >= 0 && num <= 1000;
    }
}