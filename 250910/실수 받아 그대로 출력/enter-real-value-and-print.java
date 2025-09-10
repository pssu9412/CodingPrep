import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();

        if (a >= 0 && a <= 50) {
            System.out.printf("%.2f" , a);
        } else {
            System.out.println("입력값이 조건(0 <= a <= 50)을 벗어났습니다.");
        }

        sc.close();
    }
}