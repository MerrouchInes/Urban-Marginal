package controleur;

import vue.EntreeJeu; //importation de la classe -> package diff�rent
import javax.swing.JFrame; //cf. Evenements provenant de la vue

public class Controle {

	public static void main(String[] args) {
		new Controle();
	}
	
	private EntreeJeu frmEntreeJeu;
		
		public Controle(){ //Constructeur
			this.frmEntreeJeu = new EntreeJeu(this);
			frmEntreeJeu = new EntreeJeu(null); //Cree la frame
			frmEntreeJeu.setVisible(true); //Rend visible la frame
		}
		
	/* ------------ Evenements provenant de la vue ------------ */
	public void evenementVue(Object uneFrame, Object info) {
		if (uneFrame instanceof EntreeJeu) {
			evenementEntreeJeu(info);
		}
			
	}

	private void evenementEntreeJeu(Object info) {
		System.out.println((String)info);
	}
				
	
	
	/* ------------ Evenements provenant du modele ------------ */
	
	
}

//AJOUT2


