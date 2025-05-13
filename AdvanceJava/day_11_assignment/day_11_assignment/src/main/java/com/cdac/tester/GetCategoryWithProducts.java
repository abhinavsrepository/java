package com.cdac.tester;
import static com.cdac.utils.HibernateUtils.getFactory;

import java.util.Scanner;

import org.hibernate.SessionFactory;

import com.cdac.dao.CategoryDao;
import com.cdac.dao.CategoryDaoImp;
import com.cdac.entities.Category;
public class GetCategoryWithProducts {

	public static void main(String[] args) {
		try (Scanner sc=new Scanner(System.in);
				SessionFactory sf=getFactory()) {
			//create dao
			CategoryDao dao=new CategoryDaoImp();
			System.out.println("Enter category details - name");
			Category category =  dao.getCategoryWithProducts(sc.next());
			System.out.println(category);
			System.out.println("products - ");
			category.getProductList().forEach(System.out::println);
		}
	}

}
