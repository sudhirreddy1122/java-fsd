public class practiceproject7 {

	 private String msg="Welcome to Java"; 
	 
	 class Inner{  
	  void hello(){System.out.println(msg+", Let us start learning Inner Classes");}  
	 }  


	public static void main(String[] args) {

		practiceproject7 obj=new practiceproject7();
		practiceproject7.Inner in=obj.new Inner();  
		in.hello();  
	}
}




	