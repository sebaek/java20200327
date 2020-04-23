package chap10.lecture.tryWithResources;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryResource {
	void method2() {
		try (
				FileReader fr = new FileReader("src/myjava/Hello.java");
				FileReader fr2 = new FileReader("src/myjava/Hello2.java");
				) {
			// 읽는 작업을 함.....
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	void method1() {
		FileReader fr = null;
		try {
			fr = new FileReader("src/myjava/Hello.java");
			// 읽는 작업을 함.....
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fr != null) {
					fr.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}









