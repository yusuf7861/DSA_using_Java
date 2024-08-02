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

public class SumOfNnumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scanner.nextInt();
        int result = sum(n);
        int result2 = sum2(n);
        
        System.out.println("Using simple function: "+result);
        System.out.println("Using simple better and faster approach: "+result2);
        
        // using iteration loop TC = O(n)
        int i, s=0;
        for(i = 0; i <= n; i++)
        {
            s = s + i;
        }
        
        System.out.println("Result using loop: "+s);
        
    }

//    simple function which takes O(n) time
    private static int sum(int n) {
            if(n == 0)
                return 0;
            return n + sum(n - 1);
    }

//    simple function which takes O(n) time
    private static int sum2(int n) {
            return n * (n+1) / 2;
    }
}
