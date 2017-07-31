/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlebancario;

import java.math.BigDecimal;

/**
 *
 * @author Luís
 */
public class ControleBancario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Conta minhaConta = new Conta("Santander", Moeda.Real, new BigDecimal("759.99"));
        
        System.out.println("Meu banco é: " + minhaConta.getBanco());
        System.out.println("Meu saldo é: " + minhaConta.getSaldo());
        System.out.println("Meu saldo em dólares é: " + minhaConta.getSaldoAs(Moeda.Dolar));
    }
    
}
