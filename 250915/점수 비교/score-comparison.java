import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        String B = sc.nextLine();

        String[] aScores = A.split(" ");
        String[] bScores = B.split(" ");

        int aMath = Integer.parseInt(aScores[0]);
        int aEng = Integer.parseInt(aScores[1]);
        int bMath = Integer.parseInt(bScores[0]);
        int bEng = Integer.parseInt(bScores[1]);

        if(checkRange(aMath) && checkRange(aEng) && checkRange(bMath) && checkRange(bEng)){
            if(aMath > bMath && aEng > bEng){
                System.out.println(1);
            }else{
                System.out.println(0);
            }
        }

    }

    private static boolean checkRange(int num){
        return 1 <= num && num <= 100;
    }
}