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
public class Factorial {
    public static void main(String[] args) {
        int n;
        int result;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a number: ");
            n = scanner.nextInt();
            result = fact(n);
        }
        System.out.println("Factorial of "+n+" is "+result);
        
        // using iteration loop TC = O(n)
        int i, s = 1;           // Initially f should be initialized to 1 otherwise garbage value will be mutliplied to i
        for(i = 1; i <= n; i++)
        {
            s = s * i;
        }
        
        System.out.println("Result using loop: "+s);
        
    }

//    simple function which takes O(n) time
    static int fact(int n) {
            if(n == 1)
                return 1;
            return n * fact(n - 1);
    }
}
