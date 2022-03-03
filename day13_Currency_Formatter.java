import java.util.*;
import java.text.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        // Write your code here.
        NumberFormat fAm = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat fIndian = NumberFormat.getCurrencyInstance(new Locale("en","in"));
        NumberFormat fChin = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat fFran= NumberFormat.getCurrencyInstance(Locale.FRANCE);
        
        String us = fAm.format(payment);
        String india = fIndian.format(payment);
        String china = fChin.format(payment);
        String france = fFran.format(payment);
        
        
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
