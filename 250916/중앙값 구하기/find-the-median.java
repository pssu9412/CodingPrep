import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        if(A > B && A > C){
            if(B > C){
                System.out.println(B);
            }else{
                System.out.println(C);
            }
        }else if(B > A && B > C){
            if(A > C){
                System.out.println(A);
            }else{
                System.out.println(C);
            }
        }else if(C > A && C > B){
             if(A > B){
                System.out.println(A);
            }else{
                System.out.println(B);
            }
        }
    }
}