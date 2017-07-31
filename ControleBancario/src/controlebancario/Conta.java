package controlebancario;

import java.math.BigDecimal;

public class Conta {
    private Moeda tipoMoeda;
    private BigDecimal saldo;
    private String banco;

    public Conta(String banco, Moeda tipo, BigDecimal saldo) {
        this.tipoMoeda = tipo;
        this.banco = banco;
        this.saldo = saldo;
    }

    public String getBanco() {
        return banco;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public Moeda getTipoMoeda() {
        return tipoMoeda;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public void setTipoMoeda(Moeda tipoMoeda) {
        this.tipoMoeda = tipoMoeda;
    }
    
    public BigDecimal getSaldoAs(Moeda tipo) {
        if(tipo == Moeda.Real && tipoMoeda != Moeda.Real) {
            return ConversorDeMoedas.RealParaDolar(saldo);
        }
        else if(tipo == Moeda.Dolar && tipoMoeda != Moeda.Dolar) {
            return ConversorDeMoedas.DolarParaReal(saldo);
        }
        return saldo;
    }
}
