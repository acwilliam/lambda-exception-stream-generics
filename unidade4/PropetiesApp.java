package unidade4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InvalidPropertiesFormatException;
import java.util.Properties;

public class PropetiesApp {

	public static void main(String[] args) throws InvalidPropertiesFormatException, FileNotFoundException, IOException {
		Properties sites = new Properties();
		sites.loadFromXML(new FileInputStream("C:/TEMP/diciplinas/src/unidade4/sites.xml"));
		System.out.println(sites.getProperty("3"));

	}

}
