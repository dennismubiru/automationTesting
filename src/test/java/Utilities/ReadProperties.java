package Utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fr=new FileReader(System.getProperty("user+dir")+"\\src\\test\\resources\\configfiles\\config.properties");
Properties pl=new Properties();
pl.load(fr);
	}

}
