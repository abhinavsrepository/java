package com.cdac.tester;

import static com.cdac.utils.HibernateUtils.getFactory;

import java.util.Scanner;

import org.hibernate.SessionFactory;

import com.cdac.dao.FoodItemDao;
import com.cdac.dao.FoodItemDaoImpl;
import com.cdac.dao.RestaurantDao;
import com.cdac.dao.RestaurantDaoImpl;

public class RemoveRestaurantDetails {

	public static void main(String[] args) {
		try (SessionFactory sf = getFactory();
				Scanner sc=new Scanner(System.in)) {
			RestaurantDao dao=new RestaurantDaoImpl();
			System.out.println("Enter restaurant id to delete restaurant details");			
			System.out.println(dao.
					deleteRestaurant(sc.nextLong()));
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}