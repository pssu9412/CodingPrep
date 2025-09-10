import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        if(checkRange(A) && checkRange(B)){
            System.out.printf("%d %d %d", A,B, A+B);
        }else{
            System.out.println("입력값이 조건을 벗어났습니다.");
        }
    }

    private static boolean checkRange(int num){
        return 1<= num && num <= 100;
    }
}