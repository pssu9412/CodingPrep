import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        if(checkRange(N)){
            System.out.println(N >= 80 ? "pass" : 80 - N + " more score");
        }
    }

    private static boolean checkRange(int num){
        return 0 <= num && num <= 100;
    }
}