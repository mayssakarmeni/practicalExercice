package Projet;

import java.util.ArrayList;
import java.util.List;

public class Commande {
Ligne_de_Commande lc;
private String nom;
private String date;


List<Commande> commandes = new ArrayList<Commande>();

public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}




public Commande(Ligne_de_Commande lc, String nom, String date) {
	super();
	this.lc = lc;
	this.nom = nom;
	this.date = date;
}
public void ajouterCommande(Ligne_de_Commande[] Ligne_de_Commande,Ligne_de_Commande p,int nbCommande )
{
if (nbCommande<Ligne_de_Commande.length)
{Ligne_de_Commande[nbCommande]=p;
nbCommande+=1;
}
}
}
