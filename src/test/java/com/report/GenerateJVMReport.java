package com.report;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import net.masterthought.cucumber.Reportable;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class GenerateJVMReport {

	public static void report() {
		File file = new File("target");
		List<String>list= new ArrayList<String>();
		list.add("src/test/resources/report/cucumber.json");
		
		String Project ="Adactin Project";
		String build ="1";
		
		Configuration configuration = new Configuration(file, Project);
		
		configuration.addClassifications("Platform", "Windows");
		configuration.addClassifications("Browser", "Chrome");
		configuration.addClassifications("Branch", "release/1.0");
	
		ReportBuilder builder = new ReportBuilder(list, configuration);
		
		Reportable generateReports = builder.generateReports();
		
	}
}
