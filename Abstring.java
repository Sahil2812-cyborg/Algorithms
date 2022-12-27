import java.util.*;
public class Abstring {
    public static boolean game(int n, String s){
        if(n%2!=0)
            return false;
        HashMap <Character, Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(s.charAt(i)))
                map.put(s.charAt(i), map.get(s.charAt(i))+1);
            else{
                map.put(s.charAt(i), 1);
            }
        }
        for(Integer v : map.values()){
            if(v%2 != 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            String s = sc.next();
            if(game(n, s))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
