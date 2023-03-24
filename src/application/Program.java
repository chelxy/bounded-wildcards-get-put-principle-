//Princ�pio get/put - covari�ncia
package application;

import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {

		List<Integer> intList = new ArrayList<Integer>();
		intList.add(10);
		intList.add(5);
		
		List<? extends Number> list = intList;
		
		Number x = list.get(0);// Posso acessar, mas n�o posso adicionar
		
		//list.add(20); // erro de compilacao
	}

}
