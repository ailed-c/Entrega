package entornos;
import java.math.BigDecimal;

public class EnviromentCalculator implements Calculator {
	
	@Override
	public BigDecimal sum(BigDecimal firstSummand, BigDecimal secondSummand) {
		BigDecimal result1 = firstSummand.add(secondSummand);
		if (firstSummand != null && secondSummand != null) {
			return result1;
		} else
			return BigDecimal.valueOf(-1);

	}

	    @Override
	    public BigDecimal substract(BigDecimal minuend, BigDecimal subtrahend) {
	    	BigDecimal result2=minuend.subtract(subtrahend);
			if (minuend != null && subtrahend != null) {
				return result2;
			} else
				return BigDecimal.valueOf(-1);
	    }

	    @Override
	public BigDecimal multiply(BigDecimal multiplicand, BigDecimal multiplier) {
		BigDecimal result3 = multiplicand.multiply(multiplier);
		if (multiplicand != null && multiplier != null) {
			return result3;
		} else
			return BigDecimal.valueOf(-1);

	}

	@Override
	public BigDecimal divide(BigDecimal dividend, BigDecimal divisor) {
		BigDecimal result4 = dividend.divide(divisor);
		if (dividend != null && divisor != null) {
			if (BigDecimal.ZERO == divisor) {
				return BigDecimal.valueOf(-1);
			} else
				return result4;
		} else
			return BigDecimal.valueOf(-1);
	}


	   @Override
	    public BigDecimal mcd(BigDecimal first, BigDecimal second) {
	    	 while(first != second)
	             if(first.compareTo(second)>0)
	                 first=first.subtract(second);
	             else
	                 second=second.subtract(first);
	        BigDecimal result5=first;
	        return result5;
	    }

	    @Override
	    public BigDecimal mcm(BigDecimal first, BigDecimal second) {
	    	BigDecimal resultmcm=new BigDecimal(0);
	    	 while(first != second)
	             if(first.compareTo(second)>0)
	            	 resultmcm=(first.divide(mcd(first,second))).multiply(second);
	             else 
	            	 resultmcm=(second.divide(mcd(second,first))).multiply(first);
	    	 
	    	BigDecimal result6=resultmcm;
	    	 return result6;
	       
	    
}
}
	
	

