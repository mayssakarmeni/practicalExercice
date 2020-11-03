package Projet;

import java.util.ArrayList;
import java.util.List;

public class Client  extends Personne {
private int num;
List<Client> Clients = new ArrayList<Client>();



public Client(String firstName, String lastName, String email, String mdp, String username, int tel, String role) {
	super(firstName, lastName, email, mdp, username, tel, role);
this.num=num;
}



public int getNum() {
	return num;
}

public void setNum(int num) {
	this.num = num;
}

@Override
public String toString() {
	return "Client [num=" + num + ", getNum()=" + getNum() + ", getFirstName()=" + getFirstName() + ", getLastName()="
			+ getLastName() + ", getEmail()=" + getEmail() + ", getMdp()=" + getMdp() + ", getUsername()="
			+ getUsername() + ", getTel()=" + getTel() + ", getRole()=" + getRole() + ", List()=" + List()
			+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}


public void ajouterCommande(Commande[] commandes,Commande p,int nbCommande )
{
if (nbCommande<commandes.length)
{commandes[nbCommande]=p;
nbCommande+=1;
}
}

public void ListeAll (){
for(Client Clients :Clients){
    System.out.println(Clients.getFirstName());
    System.out.println(Clients.getLastName());
    System.out.println(Clients.getNum());
}

}
}