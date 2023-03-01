package ForLoop;

public class First10no {
	 int no =3;
	
	      void check1(){ // 1 t0 10 
		  int i =1; 
		  for(i=i;i<=10;i++) {
	      System.out.print(i+" "); } } 
	 
	 void check2() { 
		//multiples of 3  
		int no1 = 3; 
		  for(int i=1;i<=10;i++){
		    	if (i%no==0) {
		    	System.out.println(i);
		    	}
		    } 
	 }
	public static void main(String[] args) {
    First10no obj1 = new First10no();
    //obj1.check1();
    obj1.check2();
      
	}

}
