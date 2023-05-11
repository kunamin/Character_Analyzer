package org.java.Character_Analyzer;

import java.io.*;
import org.java.Character_Analyzer.Main;

public class PrintCSV {
	
	static int sum;
	static String triedString;
	static int trying;
	
	public static int[] Con = new int[30];
	
	public static void makeiteasier(){
		Con[0] = Analyzer.Con1[0] + Analyzer.Con2[0];
		Con[1] = Analyzer.Con1[1] + Analyzer.Con2[1];
		Con[2] = 0 + Analyzer.Con2[2];
		Con[3] = Analyzer.Con1[2] + Analyzer.Con2[3];
		Con[4] = Analyzer.Con2[4];
		Con[5] = Analyzer.Con2[5];
		Con[6] = Analyzer.Con1[3] + Analyzer.Con2[6];
		Con[7] = Analyzer.Con1[4];
		Con[8] = Analyzer.Con1[5] + Analyzer.Con2[7];
		Con[9] = Analyzer.Con2[8];
		Con[10] = Analyzer.Con2[9];
		Con[11] = Analyzer.Con2[10];
		Con[12] = Analyzer.Con2[11];
		Con[13] = Analyzer.Con2[12];
		Con[14] = Analyzer.Con2[13];
		Con[15] = Analyzer.Con2[14];
		Con[16] = Analyzer.Con1[6] + Analyzer.Con2[15];
		Con[17] = Analyzer.Con1[7] + Analyzer.Con2[16];
		Con[18] = Analyzer.Con1[8];
		Con[19] = Analyzer.Con2[17];
		Con[20] = Analyzer.Con1[9] + Analyzer.Con2[18];
		Con[21] = Analyzer.Con1[10] + Analyzer.Con2[19];
		Con[22] = Analyzer.Con1[11] + Analyzer.Con2[20];
		Con[23] = Analyzer.Con1[12] + Analyzer.Con2[21];
		Con[24] = Analyzer.Con1[13];
		Con[25] = Analyzer.Con1[14] + Analyzer.Con2[22];
		Con[26] = Analyzer.Con1[15] + Analyzer.Con2[23];
		Con[27] = Analyzer.Con1[16] + Analyzer.Con2[24];
		Con[28] = Analyzer.Con1[17] + Analyzer.Con2[25];
		Con[29] = Analyzer.Con1[18] + Analyzer.Con2[26];
	}
	
	public static void printCSV(String trying){
		sum += Analyzer.onlyCon;
		for (int p = 0; p<=20; p++){
			sum = sum + Analyzer.Col[p];
		}
		try{
			BufferedWriter out = new BufferedWriter(new FileWriter("Result.csv"));
			out.write("Character Analyzer" + Main.main_version); out.newLine();
			out.write("Version" + Main.Version); out.newLine();
			out.write("Developed Date, " + Main.Developed_Date); out.newLine();
			out.write("Time Collected, " + Main.str2); out.newLine();
			out.write("Date Collected, " + Main.str1); out.newLine();
			out.write("Time taken, " + Main.time); out.newLine();
			out.newLine();
			out.write("자음, 합계, , ,모음, 합계"); out.newLine();
			for(int t = 0; t<=29; t++){
				char Conx = (char)(0x3131+t);
				char Colx = (char)(0x314F+t);
				if(t<=20){
					out.write(Conx + ", " + Con[t] + ", , , "+ Colx + ", " + Analyzer.Col[t]); out.newLine();
				}
				else{
					out.write(Conx + ", " + Con[t]); out.newLine();
				}
			}
			out.newLine();
			out.write("글자수, , " + sum);
			out.close();
		}catch (IOException e){
			System.err.println(e);
			System.exit(1);
		}
		
		
	}

}
