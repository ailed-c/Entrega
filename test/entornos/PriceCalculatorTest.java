package entornos;

import static org.junit.jupiter.api.Assertions.*;


import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class PriceCalculatorTest {

	PriceCalculator p;
	@BeforeEach
	void setUp() throws Exception {
		p=new PriceCalculator();
	}


	@ParameterizedTest
	@MethodSource("sumProducts")
	void should_calculate_sumaProductsPrice(Integer n1, Integer n2, Integer solution) {
    
		Integer sumaResult= p.sumProductsPrice(new Integer[] {n1,n2});
		assertEquals(sumaResult,solution);
	}
	static Stream<Arguments> sum() {
		return Stream.of(
				Arguments.of(1,null,-1),
				Arguments.of(250000,0,250000),
				Arguments.of(-10,8,-1)
				);
	}
	
	@ParameterizedTest
	@MethodSource("calculate")
	void should_calculate_calculatePrice(String name, Integer n, Integer solution) {
		Integer result=p.calculatePrice(name,n);
		assertEquals(result,solution);
	}
	static Stream<Arguments> Price() {
		return Stream.of(
				Arguments.of("CAR",1,5100),
				Arguments.of("HOUSE",1, 56000),
				Arguments.of("TRUCK",1,20400 ),
				Arguments.of("APPARTMENT",1,32000),
				Arguments.of("FOOD",1,3),
				Arguments.of("PLANE",1,1540000),
				Arguments.of("HELICOPTER",1,616000),
				Arguments.of("carol",1,-1),
				Arguments.of("HELICOPTER",-2,-1),
				Arguments.of("HELICOPTER",null,-1)
				);
	}

}
