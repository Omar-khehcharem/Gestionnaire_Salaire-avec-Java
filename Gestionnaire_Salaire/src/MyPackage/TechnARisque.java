package MyPackage;

public class TechnARisque extends Employe implements prime {
	private int upm;
	private  double  salaire=0;
	public TechnARisque(String nom, String prenom, int age, String dateE,int upm) {
	super(nom,prenom,age,dateE);
	this.upm=upm;
	
	}
	@Override
	public void ajouterASalaire() {
		salaire=salaire+200;
		
	}
	
	
	@Override
	public double calculerSalaire() {
		salaire=this.upm*5;
		ajouterASalaire();
		return salaire;
	}
	
	
	

}

