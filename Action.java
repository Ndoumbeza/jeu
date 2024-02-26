
public abstract class Action {
	private int cout;
	private String nom;
	
	public int getCout() {
		return cout;
	}
	public void setCout(int cout) {
		this.cout = cout;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Action(int cout, String nom) {
		this.cout = cout;
		this.nom = nom;
	}
	public abstract void action(Royaume r,Fabrique f);

}
