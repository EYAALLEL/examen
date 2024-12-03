package examen;

import java.time.LocalDate;

public class Agence {
	private Voiture[] tab;
	private String Reference;
	private int nbVoiture = 0;
	private int taille;

	public Agence(String Reference, int taille) {
		this.Reference = Reference;
		this.taille = taille;
		this.tab = new Voiture[taille];
	}

	public void ajoutVoiture(Voiture v) throws AjoutInterditException {
		int a = LocalDate.now().getYear() - v.getAnnee();
		if (a <=5) {
			tab[nbVoiture] = v;
			nbVoiture++;
		} else {
			throw new AjoutInterditException();
		}
	}

	public Voiture[] getTab() {
		return tab;
	}

	public void setTab(Voiture[] tab) {
		this.tab = tab;
	}

	public void selectionne(Critere C) {
		for (int i = 0; i < nbVoiture; i++) {
			if (C instanceof CriterePrix) {
				CriterePrix f = (CriterePrix) C;
				if (C.correspond(tab[i])) {
					System.out.println(tab[i].toString());
				}
			} else if (C instanceof CritereMarque) {
				CritereMarque k = (CritereMarque) C;
				if (C.correspond(tab[i])) {
					System.out.println(tab[i].toString());
				}

			}

		}

	}

}
