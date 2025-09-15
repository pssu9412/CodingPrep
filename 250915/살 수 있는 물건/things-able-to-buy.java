import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        if(checkRange(N)){
            if(N >= 3000){
                System.out.println("book");
            }else if(N >= 1000){
                System.out.println("mask");
            }else{
                System.out.println("no");
            }
        }else{
            System.out.println("입력값이 범위를 벗어났습니다.");
        }
    }

    private static boolean checkRange(int num){
        return 0 <= num && num <= 10000;
    }
}