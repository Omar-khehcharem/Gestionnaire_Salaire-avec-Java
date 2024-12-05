package MyPackage;

public abstract class Employe {

	private String nom;
	private String prenom;
	private int age;
	private String  dateE; 
	private  int id; 
	
	public static int Matriclue=0;
	
	public abstract  double calculerSalaire() ; 

	public Employe(String nom,String prenom,int age, String dateE) {
		this.nom=nom;
		this.prenom=prenom;
		this.age=age;
		this.dateE=dateE;
		Matriclue++;
		id=Matriclue;
		
		
	}
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom+" "+prenom;
	}

	public void setNom(String nom,String prenom) {
		this.nom = nom;
		this.prenom = prenom;

	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDateE() {
		return dateE;
	}
	public void setDateE(String dateE) {
		this.dateE = dateE;
	}

	public void ajouterEmploye(Employe Empl) {
		
	}

	
	

	

}
