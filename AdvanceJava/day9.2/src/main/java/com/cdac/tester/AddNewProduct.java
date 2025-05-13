package com.cdac.tester;
import com.cdac.dao.*;

import static com.cdac.utils.HibernateUtils.getFactory;

import java.time.LocalDate;
import java.util.Scanner;

import org.hibernate.SessionFactory;

import com.cdac.dao.Category;
import com.cdac.dao.ProductDao;
import com.cdac.dao.ProductDaoImpl;
import com.cdac.entities.Product;
import static com.cdac.entities.Product.*
;public class AddNewProduct {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in); 
				SessionFactory sf = getFactory()) {
			// create Product DAO instance
			ProductDao productDao=new ProductDaoImpl();
			System.out.println("Enter product details - name, Category productCategory, \r\n"
					+ "			String description, LocalDate manufactureDate, double price,\r\n"
					+ "			int availableQuantity");
			Product product=new Product(sc.next(), 
					Category.valueOf(sc.next()), sc.next(), 
					LocalDate.parse(sc.next()),sc.nextDouble(),sc.nextInt());
			//invoke dao's method
			System.out.println(productDao.addproduct(product));
	
			} //sf => DBCP - closing
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}