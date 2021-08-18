package org.iit.hc.projConfig;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ProjectConfiguration {
	
	public Properties Loadproperties() throws IOException {
		Properties pro = new Properties();
		String fpath = "C:\\Users\\swapn\\git\\Eliterepository\\mmpElite\\Config";
		File f  = new File(fpath);
		System.out.println("File exists? :"+ f.exists());
		System.out.println(f);
		InputStream fis = new FileInputStream(fpath);
		
	
		pro.load(fis);
		return pro;
	}

}

