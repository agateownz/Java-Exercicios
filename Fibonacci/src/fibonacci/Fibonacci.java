/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

/**
 *
 * @author Luís
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num = 10;
        System.out.print("The Fibonacci for " + num + " is (" + fibonacci(num) + ").");
    }
    
    static int fibonacci(int n) {
        if(n <= 1) {
            return n;
        }
        return (fibonacci(n - 1) + fibonacci(n - 2));
    }
}
