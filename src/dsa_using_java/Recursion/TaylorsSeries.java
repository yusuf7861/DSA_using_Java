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
public class TaylorsSeries {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("x = ");
        int x = scanner.nextInt();
        System.out.println("x = ");
        int n = scanner.nextInt();

        System.out.println("Taylor's Series using basic recursive approach: " + e(x, n));
    }

//    private static int e(int x, int n) {
//        int p = 1, f = 1;
//        int r;
//        
//        if(n == 0)
//        {
//            return 1;
//        }
//        else
//        {
//            r = e(x, n -1);
//            p = p * x;
//            f = f * n;
//            return r + p / f;
//        }
//    }
    
    
//    Using Horner's Rule
    private static int e(int x, int n) {
        int s = 1;
        for(int i = 1; i <= n; i++)
        {
            s = 1 + x/n * s;
        }
        return s;
    }
}



//    This code have same bugs or errors please fix it and do research in taylor's series solution