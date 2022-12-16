package Utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadFiles {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fl=new FileReader(System.getProperty("user+dir")+"\\src\\test\\resources\\configfiles\\config.properties");
		Properties prop=new Properties();
		prop.load(fl);
	}

}
