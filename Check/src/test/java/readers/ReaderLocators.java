package readers;
import java.io.FileInputStream;
import java.util.Properties;

import Browser.Browser;
public class ReaderLocators {
	public static String getData(String Name) throws Exception
	{
		String fileLocation = System.getProperty("user.dir") + "\\target\\data.properties";
        FileInputStream fis = new FileInputStream(fileLocation);
        Properties prop = new Properties();
        prop.load(fis);
        return prop.getProperty(Name);
	}


}
