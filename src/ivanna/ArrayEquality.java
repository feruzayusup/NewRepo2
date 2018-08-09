package ivanna;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayEquality {

		public static void main(String[] args) {
	        int [] array1= {1,2,3,4,5};
	        int [] array2 ={1,2,3,4,5};
	        
	        boolean isEqual=true;
	        if( array1.length==array2.length) {
	            for (int i = 0; i < array2.length; i++) {
	                if(array1[i]!=array2[i]) {
	                    isEqual=false;
	                }
	                
	            }
	            
	        }else {
	            isEqual=false;
	        }
	        
	        if(isEqual) {
	            System.out.println("Arrays are equal");  //here checking arrays manually
	        }else {
	            System.out.println("Arrays are  not  equal");
	        }
	        //  .equal-->checking hash code and content 
	        System.out.print("Itnrege/int");
	        System.out.print("\t-->.equals-->"+array1.equals(array2));
	        System.out.println(" \t-->Arrays.equals-->"+Arrays.equals(array1, array2));
	        
	        String [] array3= {"One","Two","Three"};
	        String [] array4= {"One","Two","Three"};
	        
	        System.out.print("String");
	        System.out.print("   \t-->.equals-->"+array3.equals(array4));   //false ==checks the hashcode
	        System.out.println("  \t-->Arrays.equals-->"+Arrays.equals(array3, array4)); //true==checks content
	        
	        Object [] array5= {1,2,new int [] {3,4,5}};
	        Object [] array6= {1,2,new int [] {3,4,5}};
	        
	        System.out.print("Object");
	        System.out.print("   \t-->.equals-->"+array5.equals(array6)); //false==checks hashcode
	        System.out.print("  \t-->Arrays.equals-->"+Arrays.equals(array5, array6));//false ==new keyword
	        System.out.println(" \t-->Arrays.deepEquals-->"+Arrays.deepEquals(array5, array6)); //true==content same
	        
	        Object [] array7= {new String("Iva"),new String("Ivanna"),new String("Ivka")};
	        Object [] array8= {new String("Iva"),new String("Ivanna"),new String("Ivka")};
	        System.out.print("Object names");
	        System.out.print("   \t-->.equals-->"+array7.equals(array8));//false checks hashcode
	        System.out.print("  \t-->Arrays.equals-->"+Arrays.equals(array7, array8));//true
	        System.out.println("   \t-->Arrays.deepEquals-->"+Arrays.deepEquals(array7, array8));
	        
	        Object[][] array9 = { { "One" }, { "Two" }, { "Three" } };
	        Object[][] array10 = { { "One" }, { "Two" }, { "Three" } };
	        
	    
	        System.out.print("MltD Oname");
	        System.out.print("   \t-->.equals-->" + array9.equals(array10));
	        System.out.print("  \t-->Arrays.equals-->" + Arrays.equals(array9, array10));
	        System.out.println("   \t-->Arrays.deepEquals-->" + Arrays.deepEquals(array9, array10));
	        
	        
	        
	        System.out.println(Arrays.equals(array9[0],array10[0]));
	        
	        
	        List<Integer> array11= new ArrayList<>();
	        array11.add(1);
	        array11.add(2);
	        array11.add(3);
	        array11.add(4);
	        //array11.add(5);
	        
	        List<Integer> array12= new ArrayList<>();
	        array12.add(1);
	        array12.add(2);
	        array12.add(3);
	        array12.add(4);
	        array12.add(5);
	        System.out.print("List");
	        System.out.print("   \t-->.equals-->" + array11.equals(array12));
	        System.out.println(array11.containsAll(array12)&&array12.containsAll(array11));
	        
	        
	    }
	}