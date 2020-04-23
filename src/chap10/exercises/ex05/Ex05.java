package chap10.exercises.ex05;

public class Ex05 {
	public void method01() {
		try  {
			method1();
		} catch (Exception e) {
			
		}
	}
	
	public void method02() throws Exception {
		method1();
	}
	
	public void method03() {
		try {
			method1();
		} catch (Exception e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void method04() {
		try {
			method1();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}
	
	
	public void method1() throws NumberFormatException, ClassNotFoundException {
		
	}
	
	
	
	
	
	
	
}
