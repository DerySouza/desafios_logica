package Logica.Desafio2;

import java.util.Scanner;

public class SegundoDesafio {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
        double dinheiroTotal =  entrada.nextDouble();
        
        int[] notas = {100, 50, 20, 10, 5, 2};
        double[] moedas = {1.0, 0.50, 0.25, 0.10, 0.05, 0.01};

        double nota;
        System.out.println("NOTAS:");
        for (int i = 0; i < notas.length; i++) {
            nota = dinheiroTotal / notas[i];
            System.out.println((int)nota + " nota(s) de R$ " + notas[i] + ".00");
            dinheiroTotal = dinheiroTotal % notas[i];
        }
        System.out.println("MOEDAS:");
        for (int i = 0; i < moedas.length-1; i++) {
            nota = (double) ( dinheiroTotal/ moedas[i]);
            System.out.println((int)nota + " moeda(s) de R$ "+String.format("%.2f",moedas[i]));
            dinheiroTotal = (double)(dinheiroTotal % moedas[i]);
        }
        nota = (double) (dinheiroTotal / moedas[moedas.length-1]);
        System.out.println(Math.round(nota) + " moeda(s) de R$ "+String.format("%.2f",moedas[moedas.length-1]));
    }

 


	
}
