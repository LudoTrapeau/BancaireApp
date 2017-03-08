package metier;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.jdbc.PreparedStatement;

public class Operation {
	
	private ArrayList<Compte> comptes = new ArrayList<Compte>();
	
	public ArrayList<Compte> getComptes(){
		return comptes;
	}
	
	public void setComptes(ArrayList<Compte> comptes){
		this.comptes = comptes;
	}
	
	public void add(Compte c) throws SQLException{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			java.sql.Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/BancaireApp","root","root");
			PreparedStatement pr = (PreparedStatement) cn.prepareStatement("INSERT INTO compte VALUE(NULL,?,?,?)");
			pr.setString(1, c.getNom());
			pr.setString(2, c.getDateOuverture());
			pr.setInt(3, c.getIdUser());
			
			pr.execute();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		comptes.add(c);
	}
	
	public void remove(Long id) throws SQLException{
		/*for(Compte c : comptes){
			if(c.getId()==id){
				comptes.remove(c);
				break;
			}
		}
		System.out.println("id supp " + id);*/
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			java.sql.Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/BancaireApp","root","root");
			PreparedStatement pr = (PreparedStatement) cn.prepareStatement("DELETE FROM compte WHERE id = ?");
			pr.setLong(1, id);
			
			pr.execute();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public ArrayList<Compte> getAll() throws SQLException{
		ArrayList<Compte> listComptes = new ArrayList<Compte>();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			java.sql.Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/BancaireApp","root","root");
			PreparedStatement pr = (PreparedStatement) cn.prepareStatement("SELECT * FROM compte WHERE idUser = 1");
			ResultSet rs = pr.executeQuery();
			pr.execute();
			
			while(rs.next()){
				Compte c = new Compte();
				c.setId(rs.getLong("id"));
				c.setDateOuverture(rs.getString("dateOuverture"));
				c.setNom(rs.getString("nom"));
				c.setIdUser(rs.getInt("idUser"));
				listComptes.add(c);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return listComptes;
	}

}
