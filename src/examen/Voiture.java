package examen;

public class Voiture {
	private String marque;
	private String modele;
	private int annee;
	private double prixLocation;
	public Voiture(String marque, String modele, int annee, double prixLocation) {
		super();
		this.marque = marque;
		this.modele = modele;
		this.annee = annee;
		this.prixLocation = prixLocation;
	}
	public String getMarque() {
		return marque;
	}
	
	public String getModele() {
		return modele;
	}
	
	public int getAnnee() {
		return annee;
	}
	
	public double getPrixLocation() {
		return prixLocation;
	}
	@Override
	public String toString() {
		return "Voiture [marque=" + marque + ", modele=" + modele + ", annee=" + annee + ", prixLocation="
				+ prixLocation + "]";
	}
	
	
	

}
