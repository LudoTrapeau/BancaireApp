package metier;

import java.sql.Date;

public class Compte {
	
	private Long id;
	private String nom;
	private String dateOuverture;
	private int idUser;
	
	public Compte() {
		super();
	}
	public Compte(Long id, String nom, String dateOuverture, int idUser) {
		super();
		this.id = id;
		this.nom = nom;
		this.dateOuverture = dateOuverture;
		this.idUser = idUser;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getDateOuverture() {
		return dateOuverture;
	}
	public void setDateOuverture(String dateOuverture) {
		this.dateOuverture = dateOuverture;
	}
	public int getIdUser() {
		return idUser;
	}
	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}
	
	public String toString(){
		return id + " - " + nom + " - " + dateOuverture + " - " + idUser;	
	}
	
	public void show(){
		System.out.println(toString());
	}

}
