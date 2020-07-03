package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		/*
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("===== TEST 1 - Seller findById() =====");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("\n===== TEST 2 - Seller findByDepartment() =====");
		Department dep = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(dep);
		list.forEach(System.out::println);

		System.out.println("\n===== TEST 3 - Seller findAll() =====");
		list = sellerDao.findAll();
		list.forEach(System.out::println);
		
		System.out.println("\n===== TEST 4 - Seller insert() =====");
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, dep);
		sellerDao.insert(newSeller);
		System.out.println("Inserted new ID: "+newSeller.getId());
		
		System.out.println("\n===== TEST 5 - Seller update() =====");
		seller = sellerDao.findById(1);
		seller.setName("Martha Wayne");
		sellerDao.update(seller);
		System.out.println("Update Completed: "+sellerDao.findById(1).getName());
		
		System.out.println("\n===== TEST 6 - Seller delete() =====");
		sellerDao.deleteById(8);
		System.out.println("Deleted OK");
		*/
		
		
		/*
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("===== TEST 1 - Seller findById() =====");
		Department dep = departmentDao.findById(2);
		System.out.println(dep);
		
		System.out.println("\n===== TEST 2 - Department findAll() =====");
		List<Department> deps = departmentDao.findAll();
		deps.forEach(System.out::println);
				
		System.out.println("\n===== TEST 3 - Department insert() =====");
		Department dep1 = new Department(null, "Comidas");
		departmentDao.insert(dep1);
		System.out.println("Department Id: "+dep1.getId());
		System.out.println(departmentDao.findById(dep1.getId()));

		
		System.out.println("\n===== TEST 4 - Department update() =====");
		Department dep2 = departmentDao.findById(8);
		dep2.setName("Instrumentos");
		departmentDao.update(dep2);
		System.out.println("Update OK");
		
		System.out.println("\n===== TEST 5 - Department deleteById() =====");
		departmentDao.deleteById(8);
		System.out.println("Deleted OK");
		
		

		

		
		 */
	}

}





