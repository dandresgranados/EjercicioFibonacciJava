import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import prueba1.Inicio;

class FibonacciTest {

	@Test
	void test1() {
		int result = Fibonacci.serieFibonacci(10);
		assertEquals(1, result);	}

}
