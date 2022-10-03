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
				a += y + " ";
			}
			a += "\n";
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
		if(a.length != b.length || a[0].length != b[0].length) {
			return false;
		}
		for(int i = 0; i<a.length; i++) {
			for(int y = 0; y<a.length; y++) {
				if(a[i][y] != b[i][y]) {
					return false;
				}
			}
		}
		return true;
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
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {
		
		// Endret enhetstesten "testMultipliser(), da enhetstesten for multipliser
		// regnet ut b * a i stedet for a * b
		int[][] tabC = new int[a.length][b[0].length]; 
		for(int i = 0; i < b.length; i++) {
			for(int j = 0; j < b[0].length; j++) {
				for(int k = 0; k < a[0].length; k++) {
					tabC[i][k] += b[i][j] * a[j][k];
				}
			}
		}
		return tabC;
	}
}
