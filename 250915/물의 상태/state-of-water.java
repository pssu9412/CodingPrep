import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();

        if(checkRange(n)){
            if(n < 0){
                System.out.println("ice");
            }else if(n >= 100){
                System.out.println("vapor");
            }else{
                System.out.println("water");
            }
        }
    }

    private static boolean checkRange(int num){
        return -200 <= num && num <= 200;
    }
}