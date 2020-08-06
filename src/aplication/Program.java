package aplication;


import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		SellerDao sellerDao = DaoFactory.createSellerDao();
		Seller sellers = sellerDao.findById(2);

		System.out.println(sellers);
	}

}
