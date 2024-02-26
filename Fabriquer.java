
public class Fabriquer {
   public int capacite=20;
   public int pdv=40;
   
   public Paysan creerPaysan(int capacite,int pdv) {
	   return new Paysan(capacite,pdv);
   }
   public Village creerVillage() {
	   return new Village();
   }
}
