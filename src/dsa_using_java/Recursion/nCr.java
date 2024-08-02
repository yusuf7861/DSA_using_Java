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
public class nCr {
    public static void main(String[] args) {
//        Combination formula
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number n: ");
        int n = sc.nextInt();
        System.out.println("Enter the number r: ");
        int r = sc.nextInt();
    }
    
    private static int C(int n, int r)
    {
//        formula = n!/r!(n-r)!
        int t1, t2, t3;
        t1 = f(n);
        t2 = f(r);
        t3 = f(n - r);
        
        return t1 / (t2 * t3);
    }
    
    private static int f(int n)
    {
        if(n <= 1)
            return n;
        
        return f(n-2)+f(n-1);
        
    }
}
