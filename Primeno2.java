package ForLoop;

public class Primeno2 {
	
	void check() { 
		 boolean a = true;
			int i = 2; int j = 2; int no = 10;
			for(i =2;i<no;i++){    
				for(j=2;true;j++){ 
					if (i*j == no){
							a = false;
							System.out.println(" not a prime");
							break; 
					  		}	
					if(i*j>no) {
						break;
					   }
					}
					if (a == false){
					    break;	
					 }
				} 
			    if(a==true){ 
				System.out.println("prime");
			}
		}

	public static void main(String[] args) {	
    Primeno2 obj = new Primeno2();  
    obj.check();
		}

}
