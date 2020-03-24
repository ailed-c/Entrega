package entornos;
import static entornos.PriceCalculator.Products.*;

public class PriceCalculator {
	 public Integer sumProductsPrice(Integer[] productPrices) {
	        Integer result = 0;
	        for(Integer productPrice : productPrices) {
	        	if (productPrice==null|| productPrice<=0) {
		        	result=-1;
		        }
	            result += productPrice;
	        }
	        
	        return result;
	    }
	 
	    public Integer calculatePrice(String productName, Integer numberOfProducts){
	    	Products product=null;
	    	
	    	if (product != Products.valueOf(productName)){
	    		return -1;
	    	}else
	         product = Products.valueOf(productName);

	        double tax = calculateTax(product);
	        double co2Tax = 0;
	        double trushTax = 0;

	        if(isATransport(product)) {
	            if(isAnAirTransport(product)) {
	                co2Tax = 20;
	            } else {
	                co2Tax = 10;
	            }
	        }

	        if(isAHome(product)) {
	            trushTax = 3;
	        }

	        double price = (((1+tax)/100)*product.getUnitPrice()) + //precio con la tasa
	        		(((1+co2Tax)/100)*product.getUnitPrice())  + // se le suma precio con la tasa de contaminación co2
	        		(((1+trushTax)/100)*product.getUnitPrice()); // se le suma precio con la tasa de basura
	        
	        int result;
			if(numberOfProducts==null || numberOfProducts<0) 
	        	return -1;
	        else
            result = (int) (price*numberOfProducts);
	        
	        return result;
	    }

	    private boolean isAHome(Products product) {
	        return HOUSE == product ||  APPARTMENT == product;
	    }

	    private boolean isAnAirTransport(Products product) {
	        return PLANE == product ||  HELICOPTER == product;
	    }

	    private boolean isAnEathTransport(Products product) {
	        return CAR == product || TRUCK == product;
	    }

	    private boolean isATransport(Products product) {
	        return isAnEathTransport(product) || isAnAirTransport(product);
	    }

	    private int calculateTax(Products product) {
	        int tax;
	        switch (product) {
	            case CAR:
	            case PLANE:
	            case TRUCK:
	            case HELICOPTER:
	                tax = 21;
	                break;
	            case HOUSE:
	            case APPARTMENT:
	                tax = 10;
	                break;
	            case FOOD:
	                tax = 4;
	                break;
	            default:
	                return -1;
	        }
	        return tax;
	    }

	    enum Products {
	        CAR("car", 15000),
	        HOUSE("house", 350000),
	        APPARTMENT("appartment", 200000),
	        TRUCK("truck", 60000),
	        FOOD("food", 50),
	        PLANE("plane", 3500000),
	        HELICOPTER("helicopter", 1400000);

	        String name;

	        int unitPrice;

	        Products(String name, int unitPrice) {
	            this.name = name;
	            this.unitPrice = unitPrice;
	        }

	        String getName() {
	            return this.name;
	        }

	        int getUnitPrice() {
	            return this.unitPrice;
	        }
	    }
}
