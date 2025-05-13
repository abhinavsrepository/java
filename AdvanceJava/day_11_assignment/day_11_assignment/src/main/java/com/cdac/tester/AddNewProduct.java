package com.cdac.tester;
import static com.cdac.utils.HibernateUtils.getFactory;

import java.time.LocalDate;
import java.util.Scanner;

import org.hibernate.SessionFactory;

import com.cdac.dao.ProductDao;
import com.cdac.dao.ProductDaoImp;
import com.cdac.entities.Product;
public class AddNewProduct {

	public static void main(String[] args) {
		try (Scanner sc=new Scanner(System.in);
				SessionFactory sf=getFactory()) {
			//create dao
		    ProductDao dao=new ProductDaoImp();
			System.out.println("Enter product details - name, mgfDate, discription, price, quantity");
		    Product newproduct = new Product(sc.next(), LocalDate.parse(sc.next()),sc.next(),
		    		sc.nextDouble(),sc.nextInt());
			
		    System.out.println("Enter category"); 
			System.out.println(dao.addProduct(newproduct,sc.next()));
		}
	}

}
