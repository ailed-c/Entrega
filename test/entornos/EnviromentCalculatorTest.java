package entornos;

import java.math.BigDecimal;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class EnviromentCalculatorTest {

	EnviromentCalculator s;

	@BeforeEach
	void setUp() throws Exception {
		s = new EnviromentCalculator();

	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@ParameterizedTest
	@MethodSource("sumatorargs")
	void should_calculate_suma(BigDecimal n1, BigDecimal n2, BigDecimal solution) {

		BigDecimal sumaResult = s.sum(n1, n2);
		assertEquals(sumaResult, solution);
	}

	static Stream<Arguments> sumatorargs() {
		return Stream.of(Arguments.of(new BigDecimal(2), new BigDecimal(2), new BigDecimal(4)),
				Arguments.of(BigDecimal.valueOf(0), BigDecimal.valueOf(0), BigDecimal.valueOf(0)),
				Arguments.of(BigDecimal.valueOf(2.2), BigDecimal.valueOf(3.3), BigDecimal.valueOf(5.5)));
	}

	@ParameterizedTest
	@MethodSource("restarargs")
	void should_calculate_substract(BigDecimal n1, BigDecimal n2, BigDecimal solution) {

		BigDecimal restaResult= s.substract(n1, n2);
		assertEquals(restaResult, solution);
	}

	static Stream<Arguments> restarargs() {
		return Stream.of(Arguments.of(new BigDecimal(2), new BigDecimal(2), new BigDecimal(0)),
				Arguments.of(BigDecimal.valueOf(0), BigDecimal.valueOf(0), BigDecimal.valueOf(0)),
				Arguments.of(BigDecimal.valueOf(2.2), BigDecimal.valueOf(3.3), BigDecimal.valueOf(-1.1)));
	}
			
	@ParameterizedTest
	@MethodSource("multiargs")
	void should_calculate_multiplicacion(BigDecimal n1, BigDecimal n2, BigDecimal solution) {

		BigDecimal multiResult = s.multiply(n1, n2);
		assertEquals(multiResult, solution);
	}

	static Stream<Arguments> multiargs() {
		return Stream.of(Arguments.of(new BigDecimal(0), new BigDecimal(0), new BigDecimal(0)),
				Arguments.of(null, BigDecimal.valueOf(3), BigDecimal.valueOf(-1)),
				Arguments.of(BigDecimal.valueOf(2.2), BigDecimal.valueOf(3.3), BigDecimal.valueOf(7.26)));
	}		

	@ParameterizedTest
	@MethodSource("disvisionargs")
	void should_calculate_division(BigDecimal n1, BigDecimal n2, BigDecimal solution) {

		BigDecimal divResult = s.divide(n1, n2);
		assertEquals(divResult, solution);
	}

	static Stream<Arguments> divisionargs() {
		return Stream.of(Arguments.of(new BigDecimal(0), new BigDecimal(0), new BigDecimal(-1)),
				Arguments.of(null, BigDecimal.valueOf(3), BigDecimal.valueOf(-1)),
				Arguments.of(BigDecimal.valueOf(2.2), BigDecimal.valueOf(3.3), BigDecimal.valueOf(0.6)));
	}		

	/*@Test
	void should_calculate_mcd() {
		BigDecimal n1=new BigDecimal(12);
		BigDecimal n2=new BigDecimal(8);
		while(n1 != n2)
	        if(n1.compareTo(n2)>0)
	            n1=n1.subtract(n2);
	        else
	            n2=n2.subtract(n1);
		
		
	   BigDecimal mcdResult=s.mcd(n1, n2);	
	   
	   assertEquals(n1,mcdResult);
	}
	
	@Test
	void should_calculate_mcm() {
		BigDecimal n1=new BigDecimal(40);
		BigDecimal n2=new BigDecimal(60);
		BigDecimal resultmcm=new BigDecimal(0);
		 while(n1 != n2)
             if(n1.compareTo(n2)>0)
            	 resultmcm=(n1.divide(s.mcd(n1,n1))).multiply(n2);
             else 
            	 resultmcm=(n2.divide(s.mcd(n2,n1))).multiply(n1);
		 BigDecimal mcmResult=s.mcd(n1, n2);	
		 assertEquals(resultmcm,mcmResult);
	}
	
	
	/*@ParamentedTest
	 * @Method Source("sumatorargs)
	 * Test con argumentos
	 * void should_algo(BigDecimal1,BigDecimal2){
	 * 
	 * static stream<arguments> sumatorArgs(){  -->creamos cadenas de argumentos
	 * return stream.of (              )
	 * Arguments.of(BD(2),BD(3)),
	 * Arguments.of(BD(0),BD(0)),
	 * Arguments.of(BD(1000000),BD(2000000)),
	 * );
	 */
}
