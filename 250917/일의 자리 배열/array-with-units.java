import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int[] nums = new int[10];
        nums[0] = sc.nextInt();
        nums[1] = sc.nextInt();

        for(int j = 0; j < 10; j++){
            for(int i = 2; i < 10; i++){
                if(nums[i-2]+nums[i-1] < 10){
                    nums[i] = nums[i-2] + nums[i-1];
                }else{
                    nums[i] = nums[i-2] + nums[i-1] - 10;
                }
            }
            System.out.print(nums[j] + " ");
        }
    }
}