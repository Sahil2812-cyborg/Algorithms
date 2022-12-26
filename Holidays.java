import java.util.*;
public class Holidays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int money = sc.nextInt();
            int[] days = new int[n];
            for(int i=0;i<n;i++){
                days[i] = sc.nextInt();
            }
            Arrays.sort(days);
            int earning = 0;
            int count = 0;
            for(int i=n-1;i>=0;i--){
                if(earning >= money)
                    break;
                else{
                earning  = earning + days[i];
                count++;
                }
            }
            System.out.println(n - count);

        }
    }
}
