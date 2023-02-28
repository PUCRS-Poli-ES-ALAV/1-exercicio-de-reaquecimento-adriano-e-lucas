package br.pucrs.alav;
import java.util.Scanner;

public class Recursion {

    // Exercício I
    public static int multiplicaDois(int x, int y) {
        if (y == 1) { return x; }    

        return x + multiplicaDois(x, y-1);
    }

    // Exercício II  
    public static int somaSucessiva(int x, int y) { 
        if (y == 0) { return x; }

        return x + somaSucessiva(x, y-1);
    }

    // Exercício III - Cálculo de 1 + 1/2 + 1/3 + 1/4 + ... + 1/N.
    public static double exercicioTres() { 
        return 0.0;   
    }

    // Exercicio IV - Inversão de uma String
    public static String inverteString(String str) { 
        return str;
    }

    public static void main(String[] args) { 
        Scanner entrada = new Scanner(System.in);

	    int x = 7;
	    int y = 10;

        int result = multiplicaDois(x, y);
        int resultTwo = somaSucessiva(x, y);

	    System.out.println(result);
        System.out.println(resultTwo);
    }
	
}
