package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
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
		
//		System.out.println("==========test seller #4 Uptade =============");
//		try {
//			Seller test = new Seller(null, "Henrique", "teste@gmail.com", sdf.parse("23/10/2000"), 2100.00, dep);
//			sellerDao.insert(test);
//			
//			dep.setId(2);
//			Seller test1 = new Seller(3, "Lucas", "teste@gmail.com",new Date(), 3210.00, dep);
//			sellerDao.update(test1);
//		} catch (ParseException e) {
//			e.printStackTrace();
//		}
		
		sellerDao.deleteById(8);
		
	}

}
