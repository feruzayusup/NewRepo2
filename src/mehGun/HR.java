package mehGun;

import java.util.ArrayList;
import java.util.List;

public class HR {

	public static void main(String[] args) {

		List <Employee> lst = new ArrayList<> ();
		
		lst.add(new FullTime ("Emily" , 1247, 3000));
		lst.add(new FullTime ("John" , 47, 3500));
		lst.add(new PartTime ("Sally" , 12, 20, 20));
		lst.add(new PartTime ("David" , 3, 15, 30));
		lst.add(new FullTime ("Gibson" , 7, 4000));
		lst.add(new PartTime ("Alice" , 1, 43, 18));

		for(Employee each : lst) {
			if(each instanceof PartTime) {
				PartTime pt = (PartTime)each;     //because each is an Eployee we have to DownCasting
				pt.getPaid();  //calling parttime getPaid() method
				pt.annualWage();
				pt.employeePolicy();
				PartTime.employeeHandbook();
				System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
//			System.out.println(each);	   //automatically calls toString method
			
			}else if(each instanceof FullTime) {
				FullTime ft = (FullTime) each;
			//	ft.getPaid();
				each.getPaid();
			}
		}
		
	}

}
