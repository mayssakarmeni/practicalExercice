package Projet;

import java.util.List;

public class Personne {
private String FirstName;
private String LastName;
private String email;
private String mdp;
private String Username;
private int  tel;
private String Role;
private List<Personne> grp;
public String getFirstName() {
	return FirstName;
}
public void setFirstName(String firstName) {
	FirstName = firstName;
}
public String getLastName() {
	return LastName;
}
public void setLastName(String lastName) {
	LastName = lastName;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getMdp() {
	return mdp;
}
public void setMdp(String mdp) {
	this.mdp = mdp;
}
public String getUsername() {
	return Username;
}
public void setUsername(String username) {
	Username = username;
}
public int getTel() {
	return tel;
}
public void setTel(int tel) {
	this.tel = tel;
}
public String getRole() {
	return Role;
}
public void setRole(String role) {
	Role = role;
}
public Personne(String firstName, String lastName, String email, String mdp, String username, int tel, String role) {
	super();
	FirstName = firstName;
	LastName = lastName;
	this.email = email;
	this.mdp = mdp;
	Username = username;
	this.tel = tel;
	Role = role;
}
public List<Personne> List(){
       System.out.println("Personne [FirstName=" + FirstName + ", LastName=" + LastName + ", email=" + email + ", mdp=" + mdp
   			+ ", Username=" + Username + ", tel=" + tel + ", Role=" + Role +  "]");
	return grp;
}
public Personne() {
	super();
}


}
