package entornos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class Fibonacci1Test {
	
	Fibonacci1 f;
	/* Fibonacci1 f=new Fibonacci1();
	 */

	@BeforeEach
	void setUp() throws Exception {
		f = new Fibonacci1();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void should_calculate_factorial() {
		
		int input=5;
		int result=5;
		int fibonacciResult=f.calculateFibonacci(input);
		assertEquals(result,fibonacciResult);
	}

}
