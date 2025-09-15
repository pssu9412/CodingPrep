import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int N = sc.nextInt();

        if(checkRange(A) && checkRange(N)){
            for(int i = 0; i < N; i++){
                System.out.println(A += N);
            }
        }
    }

    private static boolean checkRange(int num){
        return 1<= num && num <= 10;
    }
}