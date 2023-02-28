package br.pucrs.alav;
import java.util.Scanner;

public class Recursion {

    public static int multiplicaDois(int x, int y) {
        if (y == 1) { return x; }    

        return x + multiplicaDois(x, y-1);
    }

    public static void main(String[] args) { 
        Scanner entrada = new Scanner(System.in);

	    int x = 7;
	    int y = 10;

        int result = multiplicaDois(x, y);

	    System.out.println(result);
    }
	
}
