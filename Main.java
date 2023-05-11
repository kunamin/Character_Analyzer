package org.java.Character_Analyzer;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Main {
	
	public static String str1;
	public static String str2;
	public static double time;
	public static String main_version = "2.5";
	public static String Version = "2.5";
	public static String Developed_Date = "2023-05-11";
	
	public static void main(String[] args) {
		long a,b;
		
		Change_Log.print();
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat d_format1 = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat d_format2 = new SimpleDateFormat("aa hh:mm:ss");
		str1 = d_format1.format(cal.getTime());
		str2 = d_format2.format(cal.getTime());
		a = System.currentTimeMillis();
		System.out.println("Process Started...");
		Analyzer.analyzer();
		PrintCSV.makeiteasier();
		b = System.currentTimeMillis();
		time = (b-a)/1000;
		PrintCSV.printCSV(Version);
		System.out.println("Done");	
		System.out.println("time passed : " + time);
	}

}
