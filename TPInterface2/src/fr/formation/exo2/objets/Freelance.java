package fr.formation.exo2.objets;

import java.util.ArrayList;
import java.util.List;

import fr.formation.exo2.Constants;

public class Freelance implements Payrole {

	private String name;
	private String siren;
	private List<Invoice> invoices;

	// constructeur freelance avec array
	public Freelance() {
		this.invoices = new ArrayList<>();

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fr.formation.exo2.objets.Payrole#calculateSalary()
	 */

	@Override // override g�n�r� automatiquement clic droit source override/implement methode.
				// Cette m�thode vient de l'interface Payrole
	public int calculateSalary() {
		// TODO Auto-generated method stub
		
		int result = 0;

		for (final Invoice invoice : this.invoices) { // boucle for en mode forc� ------- avec final --> on aura une seule initialisation par variable !!!! interet du final!!!
			
			if (!invoice.getLabel().startsWith(Constants.TRAVEL_FEES));
				 // est ce que le libell� de la facture commence par frais de d�placement --
					// d'ailleurs on voit que les frais de d�placement peuvent etre une constant -->
					// s�lectionner la chaine de caract�re avec les "" fait en auto clic droit
					// refactor
			// on utilise le ! car on veut l'inverse de ca -- op�rateur bool�en

			result += invoice.getTotal();

		}

		return result;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return "L'ind�pendant " + name; // dans le getName de base on revoie une phrase et le nom du freelance avec + name
	}

	/**
	 * @return the siren
	 */
	public String getSiren() {
		return siren;
	}

	/**
	 * @return the invoices
	 */
	public List<Invoice> getInvoices() {
		return invoices;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param siren
	 *            the siren to set
	 */
	public void setSiren(String siren) {
		this.siren = siren;
	}

	/**
	 * @param invoices
	 *            the invoices to set
	 */
	public void setInvoices(List<Invoice> invoices) {
		this.invoices = invoices;
	}

}
