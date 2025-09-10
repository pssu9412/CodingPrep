import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(checkRange(a)&& checkRange(b)){
            System.out.printf("%d %d",b,a);
        }else{
            System.out.println("입력값이 범위를 벗어났습니다.");
        }
    }

    private static boolean checkRange(int num){
        return 1<= num && num <= 100;
    }
}