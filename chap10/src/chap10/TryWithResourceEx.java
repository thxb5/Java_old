package chap10;

public class TryWithResourceEx {

	public static void main(String[] args) {
		try(
			FileInputStream fis =new FileInputStream("file.txt");
			){	
		fis.read();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
