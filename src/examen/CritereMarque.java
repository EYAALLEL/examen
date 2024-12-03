package examen;

public class CritereMarque implements Critere {
	private String CritereMar;

	public CritereMarque(String critereMar) {
		super();
		CritereMar = critereMar;
	}
	public boolean correspond(Object o) {
		Voiture v= (Voiture) o;
		boolean k=false;
		if(v.getMarque().equals(CritereMar)) {
			k=true;
		}
		else {
			k=false;
		}
		return k;
		
	}

}
