//package utils;
//
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.List;
//import java.util.Set;
//
//import com.app.core.Mgr;
//
//import fruits.Fruit;
//import fruits.Mango;
//
//public class GenericUtils {
//	/*
//	 * Create a non generic class - GenericUtils Add a public static
//	 * method(printElements) - which will print all the elements from ANY type List
//	 * as well as any type of the Set
//	 * 
//	 * 
//	 */
//	public static <T> void printElements(Collection<T> collection) {
//		for(T elem : collection)
//			System.out.println(elem);
//	}
//	//replace T by ?
//	public static void printElements2(Collection<?> coll)
//	{
//		for(Object elem :coll)
//			System.out.println(elem);
//	}
//	//printTastes
//	public static void printTastes(Set<? extends Fruit> anyFruitSet)
//	//HS|LHS|TS - Fruit | Apple | Orange....
//	{
//		for(Fruit o : anyFruitSet)
//			o.taste();
////		anyFruitSet.add(new Fruit());
////		anyFruitSet.add(new Mango());
////		anyFruitSet.add(new Object());
////		anyFruitSet.add(null);
//	}
//	
//	//add a method - to add ANY type of the fruits (var args) to any List
//	public static void addFruits(List<? super Fruit> list,Fruit... fruits)
//	//List<? super Fruit> list => Can pass ANY List of type - Fruit | Object
//	{
//		/*
//		 * What all, will you be able to add to such a List ?
//		 * Only Fruit or its sub type
//		 */
//		for (Fruit f : fruits)
//			list.add(f);
//		list.add(new Mango());
////		list.add(new Object());
//		list.add(new Fruit());
//		
////		Fruit myFruit=list.get(0);
////		Mango m=list.get(0);
////		Object o =list.get(0);
//	}
//	public static void computeSum(ArrayList<Mgr> mgrs) {
//		
//		
//		
//		
//		
//		
//		
//	}
//	
//}

package utils;

import java.util.ArrayList;
import java.util.List;

import com.app.core.Emp;

public class GenericUtils{
	public static double computeSum(List<? extends Emp> List) {
		double sumSal =0;
		for(Emp e:List) {
			sumSal+=e.computeSalary();
			
		}
		return sumSal;
	}
	public static <T  extends Comparable <? super T>> T findMax(List<T> list) {
		
		//we can tell that type T must be comparable
		T max = list.get(0);
		for ( T l : list)
		{
			if ( l.compareTo(max) > 0)
				max=l;
		}
		return max;
		
		
	
		
		
	}
	
	
}






















