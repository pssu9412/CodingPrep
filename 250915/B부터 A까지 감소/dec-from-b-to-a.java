import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        if(1<= A && A <= B && B <= 100){
            for(int i = B; i >= A; i--){
                System.out.print(i + " ");
            }
        }
    }
}