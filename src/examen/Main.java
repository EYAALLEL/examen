
	
	package examen;

public class Main {

    public static void main(String[] args) {
        Agence A1 = new Agence("Opel", 100);

        // Création des voitures
        Voiture V1 = new Voiture("FORD", "Fiesta", 2023, 11000);
        Voiture V2 = new Voiture("KIA", "RIO", 2022, 28500);
        Voiture V3 = new Voiture("KIA", "Picanto", 2019, 26000);
        Voiture V4 = new Voiture("Opel", "Astra", 2013, 45000);

        // Ajout des voitures dans l'agence
        try {
            A1.ajoutVoiture(V1);
        } catch (AjoutInterditException e) {
            System.out.println(e.alerte("Erreur d'ajout de V1"));
        }

        try {
            A1.ajoutVoiture(V2);
        } catch (AjoutInterditException e) {
            System.out.println(e.alerte("Erreur d'ajout de V2"));
        }

        try {
            A1.ajoutVoiture(V3);
        } catch (AjoutInterditException e) {
            System.out.println(e.alerte("Erreur d'ajout de V3"));
        }

        try {
            A1.ajoutVoiture(V4);
        } catch (AjoutInterditException e) {
            System.out.println(e.alerte("Erreur d'ajout de V4"));
        }

      
        Critere criterePrix = new CriterePrix(30900);

        A1.selectionne(criterePrix);
    }
}

