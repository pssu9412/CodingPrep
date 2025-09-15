import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int sum = a + b + c;
        int avg = sum / 3;
        
        if(checkRange(a) && checkRange(b) && checkRange(c)){
            System.out.println(sum);
            System.out.println(avg);
            System.out.println(sum - avg);
        }else{
            System.out.println("입력값이 범위를 벗어났습니다.");
        }
    }

    private static boolean checkRange(int num){
        return 1 <= num && num <= 100;
    }
}