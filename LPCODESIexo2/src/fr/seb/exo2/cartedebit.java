package fr.seb.exo2;

public class cartedebit extends cartepaiement {

	compte compteassocie=new compte();
	
	public boolean autorisepaiement(double montant) {
		return (compteassocie.solde>=montant);
	}
}
