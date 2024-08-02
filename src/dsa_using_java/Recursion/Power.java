/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa_using_java.Recursion;

import java.util.Scanner;

/**
 *
 * @author yjama
 */
public class Power {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter base: ");
        int m = scanner.nextInt();
        System.out.println("Enter exponent: ");
        int n = scanner.nextInt();
        
//      m = base , n = exponent

        System.out.println("Using Basic recursive function: "+power(m, n));
        System.out.println("Using better and faster recursive function: "+power2(m, n));
        
    }

//    Simple recursive function
    private static int power(int m, int n) {
        if(n == 0)
            return 1;
        return power(m, n-1)*m;
    }
    
//    Simple recursive function
    private static int power2(int m, int n) {
        if(n == 0)
            return 1;
        if(n % 2 == 0)  // if power is even
            return power2(m*m, n/2);
        else                // when power is odd
            return m*power2(m*m, n/2);
    }
}
