import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int[] N = new int[sc.nextInt()];
        sc.nextLine(); 
        
        String[] str = (sc.nextLine()).split(" ");
        
        for(int i = 0; i < N.length; i++){
            N[i] = Integer.parseInt(str[i]);
            System.out.print(N[i]*N[i] + " ");
        }
    }
}