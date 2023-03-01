package ForLoop;

public class Lcm {
	/*
	 * // Lcm of number means compare multiples of 2nos with leastcommoncondition
	 * void get_lcmofno() { int i = 1; int no = 3; int mul = 0; for(i =1;i<=10;i++){
	 * mul = i * no; // 1*3,2*3,6*3 System.out.println(mul); }
	 */
	void get_lcmofnos() { 
		int no1 = 16;
		int no = 24;
		for (int i = 1; i > 0; i++) {
			int smll = no1 * i;
			int gt = no * i;
			if (smll % no == gt% no) {
				System.out.println(smll);
				break;
			}

		}

	}

	public static void main(String[] args) {
		Lcm obj1 = new Lcm();
		// obj1.get_lcmofno();
	       obj1.get_lcmofnos();
	}

}
