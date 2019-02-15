package fr.seb.exo2;

public class cartecredit extends cartepaiement {

	protected double plafond;
	
	protected double encours;
	
	public boolean autorisepaiement(double montant) {
		return encours+montant<=plafond;
	}
	
}
