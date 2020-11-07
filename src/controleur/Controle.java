package controleur;

import modele.Value;
import vue.FrmEvolution;

public class Controle {

	/* propriétés de controle */ 
	private FrmEvolution frmEvolution;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Controle();
	}
	
	/* Demande de la vue au controlleur */
	public void demandeFrmEvolutionValeurs(int popInit,int growth,int decrease,int iterations) {
		Value population=new Value("Population",popInit,1000000,0,growth,decrease);
		for (int i=0;i<iterations;i++) {
		population.evolve();
		}
		frmEvolution.displayEndPopulation(population.getValeur());
	}
	
	/** Constructeur **/
	public Controle() {
		try {
			frmEvolution=new FrmEvolution(this);
			frmEvolution.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
