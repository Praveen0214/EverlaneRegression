package com.testrunner;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReports {

	public static void generateReports(String json) {
		
	File f=new File("C:\\Users\\jayaprakasam\\oxygennew\\ProjectEver\\Reports\\JvmReports");
	Configuration con=new Configuration(f, "Everlane Login");
	con.addClassifications("Platfrom name", "Windows 8");
	con.addClassifications("Browser name", "Chromes");
	con.addClassifications("Browser version", "80");
	List<String> jsonFiles=new ArrayList<String>();
	jsonFiles.add(json);
	
	ReportBuilder r=new ReportBuilder(jsonFiles, con);
	r.generateReports();
	}
	
	
}
