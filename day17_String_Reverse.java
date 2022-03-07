import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String c=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        boolean isPalindrome = false;
        StringBuilder sb = new StringBuilder(c);
        String kebalikan = sb.reverse().toString();
        System.out.println(c.equals(kebalikan)?"Yes":"No");
    }
}