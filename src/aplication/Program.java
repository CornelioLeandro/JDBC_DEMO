package aplication;


import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println(" TESTE 1 FIND BY ID");
		Seller sellers = sellerDao.findById(2);
		System.out.println(sellers);
		
		System.out.println("\n TESTE 2 FIND BY DEPARTMENT");
		//a chamada para o findByDepartment espera um department por isso foi criado um Department antes do findByDepartment
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for(Seller seller : list ) {
			System.out.println(seller);
		}
		
		System.out.println("\n TESTE 3 FIND All");
		list = sellerDao.findAll();
		for(Seller obj : list) {
			System.out.println(obj);
		}
		
	}

}
