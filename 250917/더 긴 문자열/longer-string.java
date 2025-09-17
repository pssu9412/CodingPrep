import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String[] strs = (sc.nextLine()).split(" ");
      
        if(strs[0].length() == strs[1].length()){
            System.out.println("same");
        }else if(strs[0].length() > strs[1].length()){
            System.out.println(strs[0] +" "+ strs[0].length());
        }else{
            System.out.println(strs[1] +" "+ strs[1].length());
        }
    }
}