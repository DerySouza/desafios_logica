package LogicaDesafio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PrimeiroDesafio {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		List<Integer> lista = new ArrayList<>();
		List<Integer> numPar = new ArrayList<>();
		List<Integer> numImpar = new ArrayList<>();

		int num = entrada.nextInt();
		for (int i = 0; i < num; i++)
			lista.add(entrada.nextInt());

		for (Integer L : lista) {
			if (L % 2 == 0)
				numPar.add(L);
			else
				numImpar.add(L);
		}

		Collections.sort(numPar);
		Collections.sort(numImpar);
		Collections.reverse(numImpar);

		numPar.forEach(System.out::println);
		numImpar.forEach(System.out::println);

	}

}
