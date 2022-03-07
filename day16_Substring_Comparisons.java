import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        
        int lastIndex = s.length()-k;
        smallest = s.substring(0,k);
        largest = s.substring(0,k);
        for(int i=0 ;i<=lastIndex;i++){ 
            String sub = s.substring(i, i+k);
            if (smallest.compareTo(sub)>0){
                smallest = sub;
            }
            if (largest.compareTo(sub)<0){
                largest = sub;
            }
        }
        
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}