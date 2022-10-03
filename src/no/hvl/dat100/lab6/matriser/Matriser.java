package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		for(int[] i:matrise) {
			for(int y:i) {
				System.out.print(y + " ");
			}
			System.out.println();
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		String a = "";
		for(int[] i:matrise) {
			for(int y:i) {
				a = a + y + " ";
			}
			a = a + "\n";
		}
		return a;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		int[][] newTab = new int[matrise.length][matrise[0].length];
		for(int i = 0; i<matrise.length; i++) {
			for(int y = 0; y<matrise[i].length; y++) {
				newTab[i][y] = matrise[i][y] * tall;
			}
		}
		return newTab;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		boolean lik = true;
		for(int i = 0; i<a.length; i++) {
			for(int y = 0; y<a.length; y++) {
				if(a[i][y] != b[i][y]) {
					lik = false;
				}
			}
		}
		return lik;
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {
		int[][] nyTab = new int[matrise.length][matrise[0].length]; 
		for(int i = 0; i<matrise.length; i++) {
			for(int y = 0; y<matrise[0].length; y++) {
				nyTab[i][y] = matrise[y][i];
			}
		}
		return nyTab;
		//ikke ferdig
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {
		int temp = 0;
		int[][] tabC = new int[a.length][b[0].length]; 
		for(int i = 0; i<a.length; i++) {
			for(int y = 0; y<b.length; y++) {
				for(int x = 0; x<b[0].length; x++) {
					for(int z = 0; z<a.length; z++) {
						temp = temp + b[y][z]*a[z][y];
					}
				}
				tabC[i][y] = temp;
			}
			
		}
		return tabC;
	}
}
