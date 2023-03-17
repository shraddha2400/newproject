package ganericPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Flib {
	
	
	public String readPropertyData(String propPath,String key) throws IOException
	{
		FileInputStream fis = new FileInputStream(propPath);
		
		Properties prop = new Properties();
		prop.load(fis);
		
		
		String data = prop.getProperty(key);
		return data;
		
		
	}

}
