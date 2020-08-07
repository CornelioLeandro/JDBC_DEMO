package aplication;


import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

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
		
		System.out.println("\n TESTE 4 INSERT");
		Seller newSeller = new Seller(null, "Cornelio", "cornelio23@gmail.com", new Date(),400.00, department);
		sellerDao.insert(newSeller);
		System.out.println("Insert! new id: " + newSeller.getId());
		
		System.out.println("\n TESTE 5 INSERT");
		sellers = sellerDao.findById(1);
		sellers.setName("Martha Wine");
		sellerDao.update(sellers);
		System.out.println("Update UP");
		
		System.out.println("\n TESTE 6 DELETE");
		System.out.println("Enter id for delete test:");
		int n = sc.nextInt();
		sellerDao.deleteById(n);
		System.out.println("Delete complety");
		
		sc.close();
	}

}
