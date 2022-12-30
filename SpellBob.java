import java.util.*;
public class SpellBob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String up = sc.next();
            String down = sc.next();
            int i=0,j=0;
            int count = 3;
            while(i<3 && j<3){
                if(up.charAt(i) == 'b' ||up.charAt(i) == 'o' || down.charAt(j)=='b' || down.charAt(j)=='o'){
                    count--;
                }
                i++;
                j++;

            }
            // System.out.println(count);
            if(count == 0){
                System.out.println("yes");
            }
            else{
                System.out.println("no");
            }
        }
    }
}
