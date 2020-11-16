package classes;

import java.util.ArrayList;

public class Orange {
	double prix;
	String origine;

	public Orange(double prix, String origine) throws Exception {
		super();
		if (prix < 0)
			throw new Exception("ERREUR : Prix Negatif !");
		this.prix = prix;
		this.origine = origine;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) throws Exception {
		if (prix < 0)
			throw new Exception("ERREUR : Prix Negatif !");
		this.prix = prix;
	}

	public String getOrigine() {
		return origine;
	}

	public void setOrigine(String origine) {
		this.origine = origine;
	}

	@Override
	public String toString() {
		return this.getOrigine() + " " + this.getPrix() + "\n";
	}

	public boolean equals(Orange o) {

		if (this.origine.equals(o.getOrigine()) && this.prix == o.getPrix())
			return true;

		return false;
	}

}