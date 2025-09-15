import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        if(checkRange(N)){
            for(int i = 1; i < 6; i++){
                System.out.print(N * i + " ");
            }
        }
    }

    private static boolean checkRange(int num){
        return 1 <= num && num <= 100;
    }
}