package chap08.examples.sec080601;

public class Example {
	public static void main(String[] args) {
		ImplemetationC impl = new ImplemetationC();
		
		System.out.println(impl instanceof ImplemetationC);
		System.out.println(impl instanceof InterfaceA);
		System.out.println(impl instanceof InterfaceB);
		System.out.println(impl instanceof InterfaceC);
		
		InterfaceA ia = impl;
		ia.methodA();
		System.out.println();
	
		InterfaceB ib = impl;
		ib.methodB();
		System.out.println();
		
		InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}
}
















