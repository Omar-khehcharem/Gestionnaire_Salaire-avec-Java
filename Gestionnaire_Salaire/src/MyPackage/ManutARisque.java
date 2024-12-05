package MyPackage;


	public class ManutARisque extends Employe implements prime{
		private int nbHeur;
		private  double  salaire=0;
		public ManutARisque(String nom, String prenom, int age, String dateE,int nbHeur) {
		super(nom,prenom,age,dateE);
		this.nbHeur=nbHeur;
		
		}
		
	
			
		

		@Override
		public void ajouterASalaire() {
			salaire=salaire+200;
			
		}
		
		
		@Override
		public double calculerSalaire() {
			salaire=this.nbHeur*65;
			ajouterASalaire();
			return salaire;
		}
		
}
		

