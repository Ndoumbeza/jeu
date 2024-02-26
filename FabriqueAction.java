import java.util.ArrayList;
import java.util.List;

public class FabriqueAction {
	public List<Action>liste;
	private String nom;
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public FabriqueAction() {
		this.liste=new ArrayList<>();
		liste.add(new AchatPaysan());
		liste.add(new Impot());
		liste.add(new FinTour());
	}
	public boolean actionCorrecte(String nom) {
		for(Action action : liste)
		if(action.getNom().equals(nom)) {
			return true;
		}
		return false;
	}
	public Action creer(String nom) {
	
		}
		
	}
	
 
}
