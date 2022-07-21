import java.util.*;

public class practiceproject5 {

	public static void main(String[] args) {
		
		System.out.println("ArrayList");
		ArrayList<String> city=new ArrayList<String>();   
	      city.add("hyderabad");//
	      city.add("chennai");    	   
	      System.out.println(city);  
		
		
	      System.out.println("\n");
	      System.out.println("Vector");
	      Vector<Integer> vec = new Vector();
	      vec.addElement(16); 
	      vec.addElement(31); 
	      System.out.println(vec);
		
	      System.out.println("\n");
	      System.out.println("LinkedList");
	      LinkedList<String> names=new LinkedList<String>();  
	      names.add("Alex");  
	      names.add("John");  	      
	      Iterator<String> itr=names.iterator();  
	      while(itr.hasNext()){  
	       System.out.println(itr.next());  
	       
	       
	       System.out.println("\n");
	       System.out.println("HashSet");
	       HashSet<Integer> set=new HashSet<Integer>();  
	       set.add(103);  
	       set.add(104);  
	       set.add(101);
	       set.add(103);
	       System.out.println(set);
	       
	       
	       System.out.println("\n");
	       System.out.println("LinkedHashSet");
	       LinkedHashSet<Integer> set2=new LinkedHashSet<Integer>();  
	       set2.add(12);  
	       set2.add(14);  
	       set2.add(11);
	       set2.add(15);	       
	       System.out.println(set2);
	      	} 
	      }  
	}

