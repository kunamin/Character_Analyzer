package org.java.Character_Analyzer;

import java.util.Scanner;
import java.io.*;

public class Analyzer {
	
	public static int[] Con1 = new int[19];
	public static int[] Col = new int[21];
	public static int[] Con2 = new int[27];

	public static void analyzer(){
		try{
			File file = new File("test.txt");
			Scanner sc = new Scanner(file);
			while(sc.hasNextLine()){
				String word = sc.nextLine();
				char []c = word.toCharArray();
				for(int w = 0; w<c.length; w++){
					int n  = (int)c[w];
					for(int i = 0; i <=0x12; i++){
						if(n>=0xAC00+0x24C*i && n<=0xAE4B+0x24C*i){
							Con1[i]+=1;
							break;
						}
					}
					for(int j = 0; j<=18; j++){
						for(int x = 0; x <= 0x14; x++){
							if(n>=(0xAC00+0x24C*j+0x1C*x) && n<=(0xAC1B+0x24C*j+0x1C*x)){
								Col[x]+=1;
							}
						}
					}
					
					for(int k = 0; k<=0x18E; k++){
						for(int y = 0; y<=0x1A; y++){
							if(n==0xAC01+y+0x1C*k){
								Con2[y]+=1;
								break;
							}
						}
					}
				}
			}
			sc.close();
		}catch (IOException e){
			System.err.println(e);
			System.exit(1);
		}
		
	}
}
