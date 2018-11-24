import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
public class ReadPropertiesFile {
	static Properties prop = new Properties();
	static InputStream input = null;
public static void main(String[]args) {
	try {
		input = new FileInputStream("config.properties");
		// load a properties file
		prop.load(input);
		// get the property value and print it out
		System.out.println(prop.getProperty("host"));
		System.out.println(prop.getProperty("dbuser"));
		System.out.println(prop.getProperty("dbpassword"));
	} catch (IOException ex) {
		ex.printStackTrace();
	} finally {
		if (input != null) {
			try {
				input.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	}
}
