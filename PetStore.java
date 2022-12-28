import java.util.*;
public class PetStore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            HashMap <Integer, Integer> map = new HashMap<>();
            for(int i=0;i<n;i++){
                if(map.containsKey(arr[i]))
                    map.put(arr[i], map.get(arr[i])+1);
                else{
                    map.put(arr[i], 1);
                }
            }
            boolean ans = true;
            for(Integer v : map.values()){
                if(v%2 != 0)
                    ans = false;
            }
            if(ans){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
