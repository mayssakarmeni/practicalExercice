package Projet;



public class Ligne_de_Commande {
private double Quantite;
private Produit p;
public Ligne_de_Commande(Produit p, double quantite) {
	super();
	Quantite = quantite;
	this.p = p;
	
}
public double getQuantite() {
	return Quantite;
}
public void setQuantite(double quantite) {
	Quantite = quantite;
}
public Produit getP() {
	return p;
}
public void setP(Produit p) {
	this.p = p;
}
public double claculTotal(double quantite2, Produit p2) {
	double s ;
	s=quantite2*p2.getPrixUnitaire();
	return s;
}






}


