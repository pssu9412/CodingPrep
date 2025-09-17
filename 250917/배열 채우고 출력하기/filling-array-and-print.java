import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String[] strArr = str.split(" ");

        for(int i = strArr.length; i > 0; i--){
            System.out.print(strArr[i -1]);
        }

    }
}