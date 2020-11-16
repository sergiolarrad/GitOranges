package classes;

import java.util.ArrayList;

public class Panier {
	private int nbreOrangeMax;
	private ArrayList<Orange> listeOrange;

	public Panier(ArrayList<Orange> listeOrange, int max) {
		super();
		this.listeOrange = listeOrange;
		this.nbreOrangeMax = max;
	}

	public Panier() {
		super();
		this.listeOrange = new ArrayList<Orange>();
	}

	public int getNbreOrangeMax() {
		return nbreOrangeMax;
	}

	public void setNbreOrangeMax(int nbreOrangeMax) {
		this.nbreOrangeMax = nbreOrangeMax;
	}

	public ArrayList<Orange> getListeOrange() {
		return listeOrange;
	}

	public void setListeOrange(ArrayList<Orange> listeOrange) {
		this.listeOrange = listeOrange;
	}

	public boolean estVide() {
		if (listeOrange.isEmpty())
			return true;

		return false;
	}

	public boolean estPlein() {
		if (listeOrange.size() == 50)
			return true;

		return false;
	}

	public void ajoute(Orange o) {
		this.listeOrange.add(o);
	}

	public void retire() {
		this.listeOrange.remove(listeOrange.size());
	}

	public double getPrix() {
		double prixTotal = 0;
		for (Orange o : listeOrange) {
			prixTotal += o.getPrix();
		}
		return prixTotal;
	}

	public void boycottePanier(String origine) {
		for (int i = 0; i < listeOrange.size(); i++) {
			if (this.listeOrange.get(i).getOrigine().equals(origine)) {
				this.listeOrange.remove(i);
			}
		}
	}

	@Override
	public String toString() {
		String chaine = "";
		chaine = "Liste des oranges : \n";
		for (Orange o : listeOrange) {
			chaine += o.toString();
		}
		return chaine;
	}

	public boolean equals(Panier panier) {

		boolean flag;
		for (Orange orange : this.listeOrange) {
			flag = false;
			for (Orange o : panier.getListeOrange()) {
				if (orange.equals(o)) {
					flag = true;
				}
			}
			if (!flag)
				return false;
		}

		return true;
	}

}