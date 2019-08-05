package Config;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import Test.TestNGDemo;

public class PropertiesFile {
	static Properties prop =new Properties();
	public static String ProjectPath= System.getProperty("user.dir");
	public static void main(String[] args) {
		getProperties();
		setProperties();
	}
	public static void getProperties(){
		try {
			InputStream input =new FileInputStream(ProjectPath+"/src/test/java/Config/Config.properties");
			prop.load(input);
				String browser=	prop.getProperty("browser");
			System.out.println(browser);
			TestNGDemo.browserName=browser;

		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
	}
	public static void setProperties(){
		try {
			OutputStream output= new FileOutputStream(ProjectPath+"/src/test/java/Config/Config.properties");
			prop.setProperty("result", "pass");
			prop.store(output, null);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
	}
}
