package TestUtil;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	private Properties prop;

	public Properties init_prop() {
		
		
		prop =new Properties();
		try {
		FileInputStream ip = new FileInputStream("C:\\Users\\Mayuri\\eclipse-workspace\\CucumberPOMDemoProject\\src\\test\\resources\\Config\\Config.properties");
		prop.load(ip);
	} catch (FileNotFoundException e) {
		
		e.printStackTrace();
	} catch (IOException e) {
		
		e.printStackTrace();
	}
		return prop;
	}

}
