
class Jeu {
	public Royaume royaume;
	public Fabrique fabrique;
	public Joueur joueur;  
	
	public void initialize() {
		Royaume royaume=new Royaume();
		Village village = new Village();
		Paysan paysan=new Paysan(0,0);
	}
	public void jeu(int nombreTours) {
		int somme=0;
		for(int i=0;i<nombreTours;i++) {
			somme=somme+1;
		}
	}
	public void fin() {
		
	}

	public static void main(String[] args) {
		Jeu jeu=new Jeu();
		jeu.initialize();
		
	}

}
