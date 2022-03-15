package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		SellerDao sellerDao = DaoFactory.createSellerDao();

		System.out.println("==========test seller #1 =============");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);

		System.out.println("==========test seller #2 =============");
		Department dep = new Department(1, null);
		List<Seller> list = sellerDao.findByDepartment(dep);
		for (Seller l : list) {
			System.out.println(l);
		}
		System.out.println("==========test seller #3 =============");
		List<Seller> list2 = sellerDao.findAll();
		for(Seller l : list2) {
			System.out.println(l);
		}
	}

}
