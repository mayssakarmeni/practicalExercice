package Projet;

import java.util.ArrayList;
import java.util.List;

public class Admin extends Personne{
private int num;
Client client;
List<Produit> listeProduit = new ArrayList<Produit>();

public int getNum() {
	return num;
}

public void setNum(int num) {
	this.num = num;
}

public Admin() {
	super();
	
}

public Admin(String firstName, String lastName, String email, String mdp, String username, int tel, String role) {
	super(firstName, lastName, email, mdp, username, tel, role);
	this.num=num;

	
}

@Override
public String toString() {
	return "Admin [num=" + num + ", client=" + client + ", getNum()=" + getNum() + ", getFirstName()=" + getFirstName()
			+ ", getLastName()=" + getLastName() + ", getEmail()=" + getEmail() + ", getMdp()=" + getMdp()
			+ ", getUsername()=" + getUsername() + ", getTel()=" + getTel() + ", getRole()=" + getRole() + ", List()="
			+ List() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
			+ "]";
}




public void ajouterClient(Client[] clients,Client p,int nbClient )
{
if (nbClient<clients.length)
{clients[nbClient]=p;
nbClient+=1;
}
else
System.out.println("le tableau est plein");
}
public void afficherClient (Client[] clients,int nbClient )
{
	for (int i=0;i< nbClient;i++)
	{System.out.println("le client est "+i+" son Nom est"+clients[i].getFirstName()+" son prenom est"+clients[i].getLastName());}
}
public void validerTransaction() {

}


}
