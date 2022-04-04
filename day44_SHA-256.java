import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.security.MessageDigest;

public class Solution {

    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            String word = sc.nextLine();
            sc.close();
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(word.getBytes("UTF-8"));
            byte[] byteHash = messageDigest.digest();
            for(byte b: byteHash){
                System.out.format("%02x",b);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
