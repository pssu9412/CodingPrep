import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        if(checkRange(a)){
            if((a % 13 == 0) || (a % 19 == 0)){
                System.out.println("True");
            }else{
                System.out.println("False");
            }
        }
    }

    private static boolean checkRange(int num){
        return 1 <= num && num <= 1000;
    }
}