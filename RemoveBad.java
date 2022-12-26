import java.util.*;
public class RemoveBad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] nums = new int[n];
            for(int i=0;i<n;i++){
                nums[i] = sc.nextInt();
            }
            Map <Integer, Integer> map = new HashMap<>();
            for(int i=0;i<n;i++){
                if(map.containsKey(nums[i])){
                    map.put(nums[i], map.get(nums[i])+1);
                }
                else{
                    map.put(nums[i], 1);
                }
            }
            int max = 0;
            for(Integer v : map.values()){
                if(v > max)
                    max = v;
            }
            System.out.println(n-max);
        }
    }
}
