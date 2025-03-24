package Tp2Java;

public class Voiture {
	
	private int idVoiture;
	private String marque;
	private String modele;
	private int annee;
	
	public Voiture() {
		
		this.marque = "Toyota";
		this.modele = "Rav4";
		this.annee = 2000;
	}
	
	public Voiture(int idVoiture, String marque, String modele, int annee) {
		super();
		this.idVoiture = idVoiture;
		this.marque = marque;
		this.modele = modele;
		this.annee = annee;
	}

	public int getIdVoiture() {
		return idVoiture;
	}

	public void setIdVoiture(int idVoiture) {
		this.idVoiture = idVoiture;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getModele() {
		return modele;
	}

	public void setModele(String modele) {
		this.modele = modele;
	}

	public int getAnnee() {
		return annee;
	}

	public void setAnnee(int annee) {
		this.annee = annee;
	}	
	
	public String toString() {
		return ("Voiture " +getIdVoiture()+ ":" +getMarque()+ " " +getModele()+ " (Annnee :" +getAnnee()+ ").");
		
	}

}

