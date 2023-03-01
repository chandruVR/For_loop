package ForLoop;

public class Not_divide {
	
	void notdivided () {
		   
	    // not 4 ,5 diviser  upto 10
		 int no1 =4; int no2 =5;
	    for(int i=1;i<=10;i++){
	    	if (no1%i==1 || no1%i ==no1 || no2%i ==1 || no2%i ==no2) {
	    	System.out.println(i);
	    	}
	    }
	    
	}
    
	void notdivide2() { 
		// not a diviser of 10 for given range 10 t0 20 
		int no1 =10;
		for(int i = 10 ;i<=20;i++) {
			if(no1%i ==1 || no1%i==no1) { 
				System.out.println(i);	
			  }
			}
		
		}	
	
	public static void main(String[] args) {
		 Not_divide obj1 = new Not_divide();
		   // obj1.notdivided();	
           obj1.notdivide2();
	}


}
