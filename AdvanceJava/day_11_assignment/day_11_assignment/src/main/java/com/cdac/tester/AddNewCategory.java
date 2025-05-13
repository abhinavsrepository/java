package com.cdac.tester;
import static com.cdac.utils.HibernateUtils.getFactory;

import java.util.Scanner;

import org.hibernate.SessionFactory;

import com.cdac.dao.CategoryDao;
import com.cdac.dao.CategoryDaoImp;
import com.cdac.entities.Category;
public class AddNewCategory {

	public static void main(String[] args) {
		try (Scanner sc=new Scanner(System.in);
				SessionFactory sf=getFactory()) {
			//create dao
			CategoryDao dao=new CategoryDaoImp();
			System.out.println("Enter category details - name, description");
			Category category=new Category(sc.next(), 
					sc.next());
			System.out.println(dao.addCategory(category));
		}
	}

}
