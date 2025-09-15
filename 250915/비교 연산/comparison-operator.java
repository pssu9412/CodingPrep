import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        if(checkRange(A) && checkRange(B)){
            
            System.out.println(A >= B ? 1:0);
            System.out.println(A > B ? 1:0);
            System.out.println(A <= B ? 1:0);
            System.out.println(A < B ? 1:0);
            System.out.println(A == B ? 1:0);
            System.out.println(A != B ? 1:0);

        }
    }

    private static boolean checkRange(int num){
        return 1<= num && num <= 100;
    }
}