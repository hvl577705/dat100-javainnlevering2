package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {
		int i = 0;
		while(i<tabell.length) {
			System.out.print(tabell[i]);
			i++;
		}
	}

	// b)
	public static String tilStreng(int[] tabell) {
		String tab = "[";
		if(tabell.length == 0) {
			tab = (tab + "]");
		} else {
			for(int i = 0; i<tabell.length; i++) {
				if( i == tabell.length-1) {
					tab = (tab + tabell[i] + "]");
				} else {
					tab = (tab + tabell[i] + ",");
				}
	 		}
		}
		return tab;
	}

	// c)
	public static int summer(int[] tabell) {
		int sum = 0;
		
		//for-løkke
		for(int i= 0; i<tabell.length; i++) {
			sum = sum + tabell[i];
		}

		
		//while-løkke
//		int i = 0;
//		while(i<tabell.length) {
//			sum = sum + tabell[i];
//			i++;
//		}
		
		//utvidet for-løkke
//		for(int i:tabell) {
//			sum = sum + i;
//		}
		
		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		boolean fins = false;
		for(int i:tabell) {
			if(i == tall) {
				fins = true;
			}
		}
		return fins;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		int posisjon = -1;
		for(int i = 0; i<tabell.length; i++) {
			if(tabell[i] == tall) {
				posisjon = i;
			}
		}
		return posisjon;
	}

	// f)
	public static int[] reverser(int[] tabell) {
		int[] newTab = new int[tabell.length];
		int teller = tabell.length;
		for(int i = 0; i<tabell.length; i++) {
			newTab[i] = tabell[teller-1];
			teller--;
		}
		return newTab;
	}

	// g)
	public static boolean erSortert(int[] tabell) {
		boolean stigande = true;
		for(int i = 1; i<tabell.length; i++) {
			if (tabell[i]<tabell[i-1]) {
				stigande = false;
			}
		}
		return stigande;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		int tablength = tabell1.length + tabell2.length;
		int i = 0;
		int y = 0;
		int[] newTab = new int[tablength];
		while(i<tablength) {
			if(i<tabell1.length) {
				newTab[i] = tabell1[i];
			} else {
				newTab[i] = tabell2[y];
				y++;
			}
			i++;
		}
		return newTab;
	}
}
