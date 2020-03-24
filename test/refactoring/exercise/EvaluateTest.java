package refactoring.exercise;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import refactoring.exercise.Evaluate;

class EvaluateTest {
	Evaluate evaluate;
	Evaluate evaluate2;
	@BeforeEach
	void setUp() throws Exception {
		evaluate= new Evaluate();
		/*evaluate2= new Evaluate("Carol","abcdefgA","GOOD");
		System.out.println(evaluate2);*/
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	
	@ParameterizedTest
    @MethodSource("evaluatePupil")
	void should_evaluate_pupil(double  n, String solution) {
		String calification=evaluate.evaluate_pupil(n);
		assertEquals(calification,solution);
		
	}

	static Stream<Arguments> evaluatePupil() {
        return Stream.of(
        		 Arguments.of(10.0,"SOBRESALIENTE"),
        		 Arguments.of(9.2,"SOBRESALIENTE"),
        		 Arguments.of(8.0,"NOTABLE"),
        		 Arguments.of(7.5,"NOTABLE"),
        		 Arguments.of(6.0,"GOOD"),
        		 Arguments.of(4.1,"SUSPENSO"),
        		 Arguments.of(11.2,"La nota no es válida. Nadie saca más de 10!!!")
        		 );
	}
	
   
	
	
}
