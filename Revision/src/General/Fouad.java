package General;

public class Fouad {
private String nom;
private int salaire;
private int prime;
public Fouad() {
	
}
public Fouad(String nom, int salaire, int prime) {
	this.nom = nom;
	this.salaire = salaire;
	this.prime = prime;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public int getSalaire() {
	return salaire;
}
public void setSalaire(int salaire) {
	this.salaire = salaire;
}
public int getPrime() {
	return prime;
}
public void setPrime(int prime) {
	this.prime = prime;
}
public int CalculeSalaire(int a,int b){
	int salaireBrute=a+b;  
	return salaireBrute;
}
 
}
