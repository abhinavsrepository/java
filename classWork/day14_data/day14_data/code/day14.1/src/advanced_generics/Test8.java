package advanced_generics;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import com.app.core.Emp;
import com.app.core.Mgr;
import com.app.core.SalesMgr;
import com.app.core.TempWorker;

/*
 * 3. Refer to Emp based organization hierarchy
Sort the emps as per their basic salary - must use Custom ordering
eg Test cases
AL | LinkedList | Vector of data type - Emp , Mgr , Worker or PermanentWorker , or SalesMgr .....

 */
public class Test8 {

	public static void main(String[] args) {
		ArrayList<Mgr> mgrs=new ArrayList<Mgr>(
				List.of(new Mgr(6000), new Mgr(1900), new Mgr(2000)));
	    Collections.sort(mgrs,(p1,p2)->);
	    System.out.println(mgrs);
	    Vector<TempWorker> tempWorkers=new Vector<>(
				Arrays.asList(new TempWorker(1000),
						new TempWorker(800),
						new TempWorker(500),
						new TempWorker(700)));
		    Collections.sort(tempWorkers,new Comparator<Emp>() {

				@Override
				public int compare(Emp o1, Emp o2) {
					// TODO Auto-generated method stub
					return Double.compare(o1.computeSalary(),o2.computeSalary());
				}
		    	
			});
		    System.out.println(tempWorkers);
		    LinkedList<SalesMgr> salesMgrs=new LinkedList<>(
					List.of(new SalesMgr(3800),
							new SalesMgr(4100),
							new SalesMgr(4000)));
		    Collections.sort(salesMgrs,);
		    System.out.println(salesMgrs);


	}

}
