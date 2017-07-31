/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatorial;

/**
 *
 * @author Luís
 */
public class Fatorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num = 10;
        
        System.out.println("O Fatorial do número: " + num + " é igual a " + 
                fact(num));
    }
    
    public static int fact(int n) {
        if(n <= 0) {
            return 1;
        }
        return (n * fact(n - 1));
    }
}
