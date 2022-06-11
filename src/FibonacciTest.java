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
	
	@Test
	void test2() {
		
		List<Integer> lista = new ArrayList<Integer>();
		lista = Fibonacci.serieFibonacci(10);
		assertEquals(10, lista.size());	}
	@Test
	void test3() {
		
		List<Integer> lista = new ArrayList<Integer>();
		lista = Fibonacci.serieFibonacci(10);
		assertEquals(13, lista.get(7));	}
	
	@Test
	void test4() {
		
		List<Integer> lista = new ArrayList<Integer>();
		lista = Fibonacci.serieFibonacci(20);
		assertEquals(13, lista.get(7));	}

	

}
