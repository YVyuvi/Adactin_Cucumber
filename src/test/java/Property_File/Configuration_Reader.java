package Property_File;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configuration_Reader {
	public static Properties p;

	public Configuration_Reader() throws IOException {
		File f = new File(
				"C:\\Users\\Hp\\eclipse-workspace\\Adactin_Cucumber\\src\\test\\java\\Property_File\\adactin.properties");
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis);
	}

	public String get_Browser() {
		String browser = p.getProperty("browser");
		return browser;
	}

	public String get_Url() {
		String url = p.getProperty("url");
		return url;
	}
}
