package entornos;
import java.math.BigDecimal;

public interface Calculator {
	BigDecimal sum(BigDecimal firstSummand, BigDecimal secondSummand);

    BigDecimal substract(BigDecimal minuend, BigDecimal subtrahend);

    BigDecimal multiply(BigDecimal multiplicand, BigDecimal multiplier);

    BigDecimal divide(BigDecimal dividend, BigDecimal divisor);

    BigDecimal mcd(BigDecimal first, BigDecimal second);

    BigDecimal mcm(BigDecimal first, BigDecimal second);
}
