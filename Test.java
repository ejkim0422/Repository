
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
		Test01.test01_sub();
	}
	
	public static void sub(){
		//2. 충돌예제 by joyana
		//충돌 해결법
		//알려주세요~~~^^
		//네네네네네?
		//이히히히히히히히히
	}

}

class Test01 {
	public void test01_add() {

	}

	public static void test01_sub() {
		
		new Test01().test01_add();
		
		Test01 t02 = new Test01();
		t02.test01_add();
	}
}
