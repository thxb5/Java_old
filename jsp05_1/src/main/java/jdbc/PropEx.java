package jdbc;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.Properties;

public class PropEx {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties prop = new Properties();
		String path = PropEx.class.getResource("db.properties").getPath();
		path = URLDecoder.decode(path, "utf-8");
		prop.load(new FileReader(path));
		String driver = prop.getProperty("driver");
		System.out.println(driver);

	}

}
