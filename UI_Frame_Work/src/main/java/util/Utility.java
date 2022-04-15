package util;

import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

public class Utility {
	
	public  static String readProperty(String Key) throws IOException {
		
		FileReader reader=new FileReader(System.getProperty("user.dir")+"//config.properties");  
	      
	    Properties p=new Properties();  
	    p.load(reader);  
	      
	    return p.getProperty(Key);  

		
	}
public static String getcurrentDateAndTime() {
	SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
    Date date = new Date();  
    return formatter.format(date);  

	
}

}
