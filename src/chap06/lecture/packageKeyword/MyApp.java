package chap06.lecture.packageKeyword;

//import java.util.List;
//import java.util.Scanner;
import java.util.*;
import chap06.lecture.packageKeyword.subPackage.YourClass;

import static java.lang.Math.*;

public class MyApp {
	public static void main(String[] args) {
		chap06.lecture.packageKeyword.MyClass c1 
			= new chap06.lecture.packageKeyword.MyClass();
		MyClass c2 = new MyClass();
		
		chap06.lecture.packageKeyword.subPackage.YourClass c3 
		 = new chap06.lecture.packageKeyword.subPackage.YourClass();
		
		YourClass c4 = new YourClass();
		chap06.lecture.packageKeyword.subPackage.MyClass c5 = 
				new chap06.lecture.packageKeyword.subPackage.MyClass();

		java.util.Scanner scanner1 = new java.util.Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);
		
//		java.awt.List list;
//		java.util.List list2;
		List list3;
		
		String str = "";
		
		double d = random();
		int i = abs(10 - 11);
		
		
		
	}
}

















