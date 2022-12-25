import java.util.*;
public class Accenture {
    public static String palin(String str){
        String s = "";
        for(int i=1;i<str.length();i++){
            if(str.charAt(i) == str.charAt(i-1)){
                s += str.charAt(i);
            }
            else{
                s="";
            }
        }
    return s;          
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String str = sc.nextLine();
            // int n = sc.nextInt();
            System.out.println(palin(str));
        }
    }
    
}
