package model.dao;

import db.DB;
import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {
// esta classe foi criada para que a implementacao no banco não seja exposta no programa princial e resolve o problema de 
//injecao de dependencia por isso ela chama uma Interface SELLERDAO
	
	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC(DB.getConnection());
	}
}
