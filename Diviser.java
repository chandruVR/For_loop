package ForLoop;

public class Diviser {
		void diviserr () {
	   
	    // diviser of 4,6,10 .  range 10 
	    int no1 =6;  int no2 = 4; int no3 = 10; 
	    for(int i=1;i<=10;i++){
	    	if (no1%i==0 || 4%i ==0 || no3%i==0) {
	    	System.out.println(i);
	    	}
	    }
	    
	}
	
	public static void main(String[] args) {
		 Diviser obj1 = new Diviser();
		    //obj1.check1();
		    obj1.diviserr();	
 
	}

}
