package com.cdac.dao;

import static com.cdac.utils.HibernateUtils.getFactory;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.cdac.entities.Product;

public class ProductDaoImpl implements ProductDao {

    @SuppressWarnings("deprecation")
	@Override
    public String addproduct(Product transientProduct) {
        String msg = "Product addition failed!";
        Transaction tx = null;
        try (Session session = getFactory().openSession()) {
            tx = session.beginTransaction();
            session.save(transientProduct); // Persisting the product
            tx.commit();
            msg = "Product added successfully with ID: " + transientProduct.getId();
        } catch (RuntimeException e) {
            if (tx != null)
                tx.rollback();
            e.printStackTrace();
        }
        return msg;
    }

    @Override
    public Product getProductById(Long productId) {
        Product product = null;
        try (Session session = getFactory().openSession()) {
            product = session.get(Product.class, productId);
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
        return product;
    }

    // This method seems redundant with addproduct. If needed, it can be merged.
    public String product(Product transientProduct) {
        return addproduct(transientProduct);
    }
}
