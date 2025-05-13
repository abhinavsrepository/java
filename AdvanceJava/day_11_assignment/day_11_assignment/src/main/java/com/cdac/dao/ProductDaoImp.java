package com.cdac.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import static com.cdac.utils.HibernateUtils.getFactory;

import com.cdac.entities.Category;
import com.cdac.entities.Product;

public class ProductDaoImp implements ProductDao {


	@Override
	public String addProduct(Product newproduct, String categoryName) {
		// TODO Auto-generated method stub
		
		
		// Step 1: Get current session and begin transaction
		Session session = getFactory().getCurrentSession();
		Transaction tx = session.beginTransaction();
		String message = "Failed to add product!!!";
		String jpql = "select c from Category c where c.name = :catName";
		
		try {
			// Step 2: Fetch category object from DB by name
			Category category = session.createQuery(jpql,Category.class)
					.setParameter("catName", categoryName)
					.getSingleResult();// getting category with name
			
			/*
			 * // Step 3: Set bi-directional association
			// Set category in product (owning side)
			newproduct.setCategory(category);// you forgot this first time you have to add category 
			// hibernate is not gonna add it for you but internally hibernate is adding the FK 
			// that is category_id will contain the id of category
			
			
			 Important: establish the owning side of the relationship.
             You must explicitly set the category in the product object,
             as Hibernate does not automatically set the foreign key (category_id).
             Internally, Hibernate will use this reference to populate the category_id column.
            
			
			category.getProductList().add(newproduct);//adding product to categoryList
			
			
			 // Step 4: Persist the product entity (will be inserted on tx.commit)
			session.persist(newproduct);//still product was in heap persist added it in L1 cache
			//marked it for insertion
			*/
			
			category.addProduct(newproduct);
			
			// Step 5: Commit transaction - this flushes the session and executes the insert
			tx.commit();//session is flushed and insert query is fired or commit is made
			
			 message = "Product added successfully with ID: " + newproduct.getId();

		}
		catch(RuntimeException e) {
			// Step 6: Rollback transaction if anything goes wrong
			if(tx!=null)
				tx.rollback();
			e.getStackTrace();
		}
		
		
		return message;
	}

	@Override
	public String deleteProduct(String productName,String categoryName) {
		// TODO Auto-generated method stub
		Session session = getFactory().getCurrentSession();
		Transaction tx = session.beginTransaction();
		String messg = "Product deletion failed!!!";
		String jpql = "select c from Category c where c.name = :nm";
		String jpql2 = "select p from Product p where p.name = :nm";
		
		try {
			Category category = session.createQuery(jpql, Category.class)
					.setParameter("nm",categoryName)
					.getSingleResult();
			
			Product product = session.createQuery(jpql2, Product.class)
					.setParameter("nm",productName)
					.getSingleResult();
			
			if(category.getProductList().contains(product)) {
				category.removeProduct(product);
				messg = "category deleted successfully!!!";
			}
			tx.commit();
			
		}
		catch(RuntimeException e) {
			if(tx!=null)
				tx.rollback();
			e.printStackTrace();
		}
		
		return messg;
	}

}
