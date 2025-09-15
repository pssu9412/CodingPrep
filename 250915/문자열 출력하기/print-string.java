import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        if(checkRange(N)){
            for(int i = 0; i < N; i++){
                System.out.println("LeebrosCode");
            }
        }else{
            System.out.println("입력값이 범위를 벗어났습니다.");
        }
    }

    private static boolean checkRange(int num){
        return 1 <= num && num <= 10;
    }
}