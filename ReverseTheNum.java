package ForLoop;

public class ReverseTheNum {
    void reversethenum() {
       int no = 102;
       int no1 = 6779;
       int i;
       while(no>10){  
    	   i = no%10;
    	   no=no/10;
    	   System.out.print(i); 
    	  }
       
                                                       
	 for(no = no;no>10;){ 
			  
			  i = no%10; 
			  no=no/10;
			  System.out.print(i); 
			  } 
		 
    	
    }
	
    	public static void main(String[] args) {
		ReverseTheNum obj = new ReverseTheNum();
        // obj.reversethenum();
		 // System.out.println(obj.getClass());  
	}

}
