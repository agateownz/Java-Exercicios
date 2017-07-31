package controlebancario;

import java.math.BigDecimal;
import java.math.RoundingMode;

public final class ConversorDeMoedas {
    
    private static final BigDecimal CotacaoDolar =  new BigDecimal("3.16645082");
    
    public static BigDecimal DolarParaReal(BigDecimal dolar) {
        return dolar.divide(CotacaoDolar, 3, RoundingMode.HALF_DOWN);
    }
    
    public static BigDecimal RealParaDolar(BigDecimal real) {
        return real.multiply(CotacaoDolar);
    }
}
