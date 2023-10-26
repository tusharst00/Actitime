import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadDataFromPropertyFile {
	public static void main(String[] args) throws Throwable {
		FileInputStream fis = new FileInputStream("./Testdata/Tushar.property.txt");
		Properties p=new Properties();
		p.load(fis);
		String value= p.getProperty("password");
		String UN = p.getProperty("username");
		String URL = p.getProperty("url");
		System.out.println(value);
		System.out.println(value);
		System.out.println(UN);
        System.out.println(URL);
}
}