package com.gtm.proxibanque.metiers;

import com.gtm.proxibanque.presentation.Constantes;

public class Credit {

	private float emprunt;
	private int nbMois;
	private double mensualites;
	private float tauxconso;
	private float tauximmo;

	public Credit(float emprunt, int nbMois) {
		super();
		this.emprunt = emprunt;
		this.nbMois = nbMois;
		this.tauxconso = Constantes.TAUX_CREDIT_CONSO;
		this.tauximmo = Constantes.TAUX_CREDIT_IMMO;
	}

	public float getEmprunt() {
		return emprunt;
	}

	public void setEmprunt(float emprunt) {
		this.emprunt = emprunt;
	}

	public int getNbMois() {
		return nbMois;
	}

	public void setNbMois(int nbMois) {
		this.nbMois = nbMois;
	}
	
	
	

	@Override
	public String toString() {
		return "Credit [emprunt=" + emprunt + ", nbMois=" + nbMois + ", tauxconso=" + tauxconso + ", tauximmo="
				+ tauximmo + "]";
	}

	/**
	 * M�thode calcul credit conso
	 * 
	 * @emprunt somme empruntee
	 * @taux_credit_conso taux d'interet sur l'emprunt
	 * 
	 */
	public void CreditConso(float emprunt, int nbmois) {
		if (emprunt > 5000) {
			System.out.println("Vous ne pouvez pas pr�tentre � un cr�dit consommation, montant trop �l�v� !");
		} else 
			
		mensualites = ((emprunt + (emprunt * tauxconso)) / nbMois);
		System.out.println("Vos mensualites seront de : " +mensualites + " � par mois pour un taux de: " + tauxconso + "%");
		
	}

	/**
	 * M�thode calcul credit Immo
	 * 
	 * @emprunt somme empruntee
	 * @taux_credit_immo taux d'interet sur l'emprunt
	 * 
	 */
	public void CreditImmo(double emprunt1, int nbmois) {
		if (emprunt < 50000) {
			System.out.println("Vous ne pouvez pas pr�tentre � un cr�dit Immobilier, montant trop bas !");
		} else 
		
		mensualites = ((emprunt + (emprunt * tauximmo)) / nbMois);
		System.out.println("Vos mensualites seront de : " +mensualites + " � par mois pour un taux de: " + tauximmo + "%");
	}
}
