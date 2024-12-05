package MyPackage;


public class Representant extends Employe   {
	private int ChiffreAffaire;
	public Representant(String nom , String  prenom ,int age , String dateE,int ChiffreAffaire) {
	super(nom,prenom,age,dateE);
	this.ChiffreAffaire=ChiffreAffaire;
			
	} 



	public double calculerSalaire() {
	return this.ChiffreAffaire*0.2+800;
	

}
	
}
