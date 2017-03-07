package metier;

import java.sql.Date;
import java.sql.SQLException;
import java.util.Iterator;

public class test {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		Operation op = new Operation();
		Compte c = new Compte();
		Date aujourdhui = new Date(0);
		
		//op.add(new Compte("1","Livret A","aujourdhui",1));
		//op.add(new Compte("2","Livret B","aujourdhui",1));
		//op.add(new Compte("3","Livret C","aujourdhui",1));
		
		Iterator<Compte> cpts = op.getAll().iterator();
		
		while(cpts.hasNext()){
			Compte c1 = cpts.next();
			System.out.println(c1.toString());
		}
	}

}
