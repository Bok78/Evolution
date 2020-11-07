package modele;

import java.util.Random;

public class Value {

	String nom;
	int valeur;
	int valmax;
	int valmin;
	int growth;
	int decrease;


	public Value(String nom, int valeur, int valmax, int valmin, int growth, int decrease) {
		this.nom = nom;
		this.valeur = valeur;
		this.valmax = valmax;
		this.valmin = valmin;
		this.growth = growth; /* % chance to growth +1 */
		this.decrease = decrease; /* % chance to decrease -1 */
	}
	
	private int Random(int max) { 
		Random rand = new java.util.Random(); 
		return rand.nextInt(max + 1);
		
	}
	
	public void evolve() {
		int valinit=this.valeur;
		//System.out.println("valinit="+valinit);
		for (int i=0;i<this.valeur;i++) {
			int test=Random (100);
			if (test<this.growth) valinit++;
			test=Random (100);
			//System.out.println("test="+test+" g="+this.growth+" d="+this.decrease);
			if (test<this.decrease) valinit--;			
		}
		if (valinit>valmax) valinit=valmax;
		if (valinit<valmin) valinit=valmin;
		setValeur(valinit);
	}

	public int getValeur() {
		return valeur;
	}

	public void setValeur(int valeur) {
		this.valeur = valeur;
	}
}
