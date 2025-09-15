import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        if(checkRange(N)){
            if(((N % 2 == 1) && (N % 3 == 0)) || ((N % 2 == 0) && (N % 5 ==0))){
                System.out.println("true");
            }else{
                System.out.println("false");
            }
        }
    }

    private static boolean checkRange(int num){
        return 1 <= num && num <= 100;
    }
}