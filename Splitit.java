import java.util.*;
public class Splitit {
    public static boolean split(int n, String s){
        int mid = n/2;
        for(int i=mid;i<n;i++){
            String sub = s.substring(i,n);
            String str = s.substring(0, i);
            if(str.contains(sub))
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            String s = sc.next();
            if(split(n, s))
                System.out.println("YES");
            else
                System.out.println("NO");
                
        }
    }
}
