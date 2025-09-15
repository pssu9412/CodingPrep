import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        // Please write your code here.
        if(checkRange(N) && checkRange(M)){
            for(int i = N; i > 0; i /= M){
                System.out.println(i);
            }
        }
    }

    private static boolean checkRange(int num){
        return 2 <= num && num <= 1000000;
    }
}
