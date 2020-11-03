package org.java.Character_Analyzer;

import java.io.*;

public class Change_Log {
	public static void print(){
		try{
			BufferedWriter out = new BufferedWriter(new FileWriter("Change_Log.txt"));
			out.write("Character Analyzer" + Main.main_version); out.newLine();
			out.write("Version : " + Main.Version); out.newLine();
			out.write("Developed Date : "+ Main.Developed_Date); out.newLine();
			out.write("<<New>>"); out.newLine();
			out.write(""); out.newLine();
			//Write new parts using out form
			out.newLine();
			out.write("<<Changed>>"); out.newLine();
			//Write changed parts using out form
			out.newLine();
			out.write("<<Fixed>>"); out.newLine();
			out.write("We adjusted the scope of the mistake."); out.newLine();
			out.write("We fixed the problem that the output is wrong."); out.newLine();
			//Write fixed parts using out form
			out.close();
		}catch (IOException e){
			System.err.println(e);
			System.exit(1);
		}
	}
}
