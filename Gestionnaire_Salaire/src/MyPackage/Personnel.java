package MyPackage;

public class Personnel  {
	public static int i=0;
	
	Employe[] employe =new Employe[10];
	
	public void ajouterEmploye(Employe e) {
		
		employe[i++]=e;
	
		
	}
	public void afficherSalaires() {	
	for (int j=0;j<i;j++) {
		System.out.println("le "+employe[j].getClass().getSimpleName()+" "+employe[j].getNom()+" gagne "+employe[j].calculerSalaire()+" dinars.");}
}
	double salaireMoyen() {
		double somme=0;
		for (int a=0;a<i;a++) {
			somme+=employe[a].calculerSalaire();
			}
		return somme/i;
	}
	
	
	
	}
	
	

     