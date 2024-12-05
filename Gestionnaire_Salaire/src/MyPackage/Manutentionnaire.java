package MyPackage;

public class Manutentionnaire extends Employe{

	private int nbHeur;
	public Manutentionnaire(String nom, String prenom, int age, String dateE,int nbHeur) {
	super(nom,prenom,age,dateE);
	this.nbHeur=nbHeur;
	
	}
	
	public double calculerSalaire() {
		
		return this.nbHeur*65;
		
	
}

}
