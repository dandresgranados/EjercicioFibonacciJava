import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

public static List<Integer> serieFibonacci(int aux2) {
		
	List<Integer> lista = new ArrayList<Integer>();

    int num1 = 0, num2 = 1;

    lista.add(num1);
    
    for (int i = 0; i < aux2; i++)
    {
        int aux = num1;
        num1 = num2;
        num2 = aux + num1;
        lista.add(num1);
       
    }
    
    return (lista);
    
	}

}
