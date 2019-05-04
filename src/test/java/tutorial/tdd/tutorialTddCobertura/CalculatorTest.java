package tutorial.tdd.tutorialTddCobertura;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.logging.Level;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


@DisplayName("Testing class CalculatorTest")
class CalculatorTest  {
	 
	    @Test
	    @DisplayName("Test Sum")
	    void testSum() {
	        Calculator myCalculator = new Calculator();
	        Integer calculatorResult;
	        
	        calculatorResult = myCalculator.sum(1, 1);
	        
	        assertTrue(calculatorResult.equals(2));
	    }
}
