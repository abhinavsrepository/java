package com.cdac.tester;
import static com.cdac.utils.HibernateUtils.getFactory;

import java.util.Scanner;

import org.hibernate.SessionFactory;

import com.cdac.dao.CategoryDao;
import com.cdac.dao.CategoryDaoImp;
import com.cdac.dao.ProductDao;
import com.cdac.dao.ProductDaoImp;
import com.cdac.entities.Category;
public class DeleteProduct {

	public static void main(String[] args) {
		try (Scanner sc=new Scanner(System.in);
				SessionFactory sf=getFactory()) {
			//create dao
			ProductDao dao=new ProductDaoImp();
			System.out.println("Enter Product Name and category Name-");
			System.out.println(dao.deleteProduct(sc.next(),sc.next()));
		}
	}

}
