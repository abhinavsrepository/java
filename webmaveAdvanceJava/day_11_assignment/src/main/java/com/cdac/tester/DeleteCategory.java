package com.cdac.tester;
import static com.cdac.utils.HibernateUtils.getFactory;

import java.util.Scanner;

import org.hibernate.SessionFactory;

import com.cdac.dao.CategoryDao;
import com.cdac.dao.CategoryDaoImp;
import com.cdac.entities.Category;
public class DeleteCategory {

	public static void main(String[] args) {
		try (Scanner sc=new Scanner(System.in);
				SessionFactory sf=getFactory()) {
			//create dao
			CategoryDao dao=new CategoryDaoImp();
			System.out.println("Enter category details - name");
			System.out.println(dao.deleteCategory(sc.next()));
		}
	}

}
