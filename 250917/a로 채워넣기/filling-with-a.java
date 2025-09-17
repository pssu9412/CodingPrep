import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        char[] strArr = str.toCharArray();
        strArr[1] = 'a';
        strArr[strArr.length - 2] = 'a';

        System.out.println(strArr);
    }
}