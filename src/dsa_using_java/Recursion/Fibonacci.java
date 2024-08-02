/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa_using_java.Recursion;

//import java.util.Scanner;

/**
 *
 * @author yjama
 */
public class Fibonacci {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a number to find fibonacci sequence if it: ");
//        int n = scanner.nextInt();
    	
    	int n = 7;
        
        
        for(int i = 0; i < n; i++){
            System.out.print(fib3(i)+"   ");
        }
    }

    /**
     *
     * @param n
     * @return
     */
    private static int fib(int n) {
//        Using basic approach 
        if(n <= 1)
            return n;
        else
            return fib(n-2)+fib(n-1);
    }
    
//    private static int fib2(int n) {
////        Using better and faster approach using iteration
//        int t0 = 0, t1 = 1, s = 0, i;
//        if(n <= 1)
//        {
//            return n;
//        }
//        for(i = 2; i <= n; i++)
//        {
//            s = t0 + t1;
//            t0 = t1;
//            t1 = s;
//        }
//        return s;
//    }
    
    
    
//    this code is giving bad input so check the code again
    static int[] F = new int[20];
    private static int fib3(int n) {
        
//      Using Memoization 
        if(n <= 1)
        {
            F[n] = n;
            return n;
        }
        else
        {
            if(F[n-2] == -1)
                F[n-2] = fib(n-2);
           if(F[n-1] == -1)
               F[n-1] = fib( n - 1);
        }
        return F[n-2]+F[n-1];
    }
}
