
public class Test {
	int a;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t  = new Test();
		t.add();
		Test.sub();
	}
	
	public void add(){
		Test01 t1 = new Test01();

		// 김은주는 이쁘다. 그러나 너무 이쁘다.
		// 강광구는 요즘 디아블로에 빠졌다.
		// 그만 해야한다..
		// 그러나 계속한다.

		/* add joyana
		   강광구는 아주 멋있다.
		   김은주는 너무 이쁘다.
		*/

		Test01.test01_sub();
	}
	
	public static void sub(){
	//add sub branch 
	// add s sub_branch
		
	}

}

class Test01 {
	public void test01_add() {
		// add master_branch
		// add s master_branch
	}

	public static void test01_sub() {
		
		new Test01().test01_add();
		
		Test01 t02 = new Test01();
		t02.test01_add();
	}
}
