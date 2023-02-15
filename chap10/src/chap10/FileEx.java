package chap10;

import java.io.File;
import java.io.IOException;

public class FileEx {

	public static void main(String[] args) {
		File dir = new File("C:/Temp2/Dir");
		File file1 = new File("C:/Temp2/file1.txt");
		if(dir.exists()==false) {
			dir.mkdir();
		}
		try {
			file1.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
