import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int total = A + B;
        double avg = total / 2.0;

        if (checkRange(A) && checkRange(B)){
            System.out.printf("%d %.1f", total, avg);
        }else{
            System.out.println("입력값이 조건을 벗어났습니다.");
        }
    }

    private static boolean checkRange(int num){
        return 1<= num && num <= 100;
    }
}