package br.pucrs.alav;

public class Recursion {

    public static int multiplicaDois(int x, int y) {
        if x == 0 { return 0; }    

        return x + multiplicaDois(x, y-1);
    }

    public static void main(String[] args) { 
        Scanner entrada = new Scanner(System.in);

	    int x = 7;
	    int y = 10;
        
        int result = multiplicaDois(x, 7);

	    System.out.println(result);
    }
	
}
