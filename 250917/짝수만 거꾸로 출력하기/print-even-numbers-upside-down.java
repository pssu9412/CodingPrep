import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int[] num = new int[sc.nextInt()];

        for(int i = 0; i < num.length; i++){
            num[i] = sc.nextInt();
        }

        for(int i = num.length - 1; i >= 0; i--){
            if(num[i] % 2 == 0){
                System.out.print(num[i] + " ");
            }
        }


    }
}