package MyPackage;
public class Technicien extends Employe {
	private int upm;
	public Technicien(String nom, String prenom, int age, String dateE,int upm) {
	super(nom,prenom,age,dateE);
	this.upm=upm;
	
	}
	
	public double calculerSalaire() {
		
		return this.upm*5;
		
	
}



}
