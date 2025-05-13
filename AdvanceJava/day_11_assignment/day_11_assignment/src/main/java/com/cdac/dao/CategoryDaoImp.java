package com.cdac.dao;

import static com.cdac.utils.HibernateUtils.getFactory;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.cdac.entities.Category;

public class CategoryDaoImp implements CategoryDao {

	@Override
	public String addCategory(Category category) {
		Session sessoin = getFactory().getCurrentSession();
		Transaction tx = sessoin.beginTransaction();
		String message = "category addition failed!!!";
		
		try {
			sessoin.persist(category);
			System.out.println("category in persist state"+category);
			tx.commit();
			message = "category added!!!";
		}
		catch(RuntimeException e) {
			if(tx!=null)
				tx.rollback();
			e.getStackTrace();
			
		}
		
		
		return message;
	}

	@Override
	public String deleteCategory(String categoryName) {
		// TODO Auto-generated method stub
		
		Session session = getFactory().getCurrentSession();
		Transaction tx = session.beginTransaction();
		String messg = "Category deletion failed!!!";
		String jpql = "select c from Category c where c.name = :nm";
		
		try {
			Category category = session.createQuery(jpql, Category.class)
					.setParameter("nm",categoryName)
					.getSingleResult();
			
			session.remove(category);
			tx.commit();
			messg = "category deleted successfully!!!";
		}
		catch(RuntimeException e) {
			if(tx!=null)
				tx.rollback();
			e.printStackTrace();
		}
		
		
		return messg;
	}

	@Override
	public Category getCategoryWithProducts(String categoryName) {
		// TODO Auto-generated method stub
		
		Session session = getFactory().getCurrentSession();
		Transaction tx = session.beginTransaction();
		String jpql = "select c from Category c left join fetch c.productList where c.name = :nm";
		Category category = null;
		
		try {
			category = session.createQuery(jpql, Category.class)
					.setParameter("nm",categoryName)
					.getSingleResult();
			
			tx.commit();
		}
		catch(RuntimeException e) {
			if(tx!=null)
				tx.rollback();
			e.printStackTrace();
		}
		
		
		return category;
	}

	@Override
	public List<Category> displayAllCategory() {
		// TODO Auto-generated method stub
		
		Session session = getFactory().getCurrentSession();
		Transaction tx = session.beginTransaction();
		List<Category> categories = null;
		String jpql = "select c from Category c";
		
		try {
			categories = session.createQuery(jpql, Category.class)
					.getResultList();
			tx.commit();
		}
		catch(RuntimeException e) {
			if(tx!=null)
				tx.rollback();
			
			e.printStackTrace();
		}
		
		return categories;
	}

}
