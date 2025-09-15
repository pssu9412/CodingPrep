import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if(checkRange(a) && checkRange(b)){
            if(a > b){
                System.out.println(a * b);
            }else{
                System.out.println(b / a);
            }
        }
    }

    private static boolean checkRange(int num){
        return 1<= num && num <= 100;
    }
}