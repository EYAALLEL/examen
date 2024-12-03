package examen;

public class CriterePrix  implements Critere{
	private double prixMax;

	public CriterePrix(double prixMax) {
		
		this.prixMax = prixMax;
	}
	
	public boolean correspond(Object o) {
		Voiture v= (Voiture) o;
		boolean k=false;
		if(v.getPrixLocation()<prixMax) {
			k=true;
		}
		else {
			k=false;
		}
		return k;
		
	}

}
