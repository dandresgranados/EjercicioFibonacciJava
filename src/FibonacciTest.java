import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;


class FibonacciTest {

	@Test
	void test1() {
		
		List<Integer> lista = new ArrayList<Integer>();
		lista = Fibonacci.serieFibonacci(10);
		assertEquals(11, lista.size());	}

}
