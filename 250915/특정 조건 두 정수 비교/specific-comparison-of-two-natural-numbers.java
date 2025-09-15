import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        if(checkRange(A) && checkRange(B)){
            if(A < B){
                System.out.print(1);
            }else{
                System.out.print(0);
            }
            if(A == B){
                System.out.print(" " + 1);
            }else{
                System.out.print(" " + 0);
            }
        }
    }

    private static boolean checkRange(int num){
        return 1<= num && num <= 100;
    }
}