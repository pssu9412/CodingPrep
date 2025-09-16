import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc  = new Scanner(System.in);

        int Y = sc.nextInt();

        if(checkRange(Y)){
            if(Y % 100 == 0 && Y % 400 != 0){
                System.out.println("false");
            }else if(Y % 4 == 0){
                System.out.println("true");
            }else{
                System.out.println("false");
            }
        }
    }

    private static boolean checkRange(int num){
        return 1<= num && num <= 2222;
    }
}