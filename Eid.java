import java.util.*;
public class Eid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] coins = new int[n];
            for(int i=0;i<n;i++){
                coins[i] = sc.nextInt();
            }
            Arrays.sort(coins);
            int diff = Integer.MAX_VALUE;
            int curmin = Integer.MAX_VALUE;
            for(int i=1;i<n;i++){
                curmin = coins[i] - coins[i-1];
                diff = Math.min(diff, curmin);
            }
            System.out.println(diff);
        }
    }
}
