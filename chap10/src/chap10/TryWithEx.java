package chap10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryWithEx {

	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("c:/Temp2/file.txt")){//파일을 오픈
			int data;
			while((data=fis.read())!=-1) {
				System.out.println(data);
			}
		
		}  catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
