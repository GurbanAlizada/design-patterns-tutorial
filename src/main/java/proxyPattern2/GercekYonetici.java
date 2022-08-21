package proxyPattern2;

import java.math.BigDecimal;


public class GercekYonetici implements SirketBilgileri {


    @Override
    public BigDecimal getCiro() {
        return BigDecimal.valueOf(10000);
    }



}
