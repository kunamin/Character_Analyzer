package org.java.Character_Analyzer;

import java.util.Scanner;
import java.io.*;

public class Analyzer {
	
	public static int onlyCon = 0;
	public static int[] Con1 = new int[19];
	public static int[] Col = new int[21];
	public static int[] Con2 = new int[27];

	public static void analyzer(){
		try{
			File file = new File("test.txt");
			Scanner sc = new Scanner(file);
			while(sc.hasNextLine()){
				String word = sc.nextLine().replaceAll("\\d{4}\\. \\d{1,2}\\. \\d{1,2}\\. (오후|오전) \\d{1,2}:\\d{1,2}\\, (?:[ㄱ-ㅎㅏ-ㅣ가-힣a-zA-Z]+)?(?:\\(.*\\))? : ", "");
				word = word.replaceAll("(이모티콘|사진)", "");
				char[] c = word.toCharArray();
				for(int w = 0; w<c.length; w++){
					if(checkHangulJamo(c[w])){
						if((int)c[w]<= 0x314E)
							onlyCon += 1;
						continue;
					}
					int n  = (int)c[w];
					for(int i = 0; i <=0x12; i++){
						if(n==0x3131+i){
							Con1[i]+=1;
							break;
						}
						else if(n>=0xAC00+0x24C*i && n<=0xAE4B+0x24C*i){
							Con1[i]+=1;
							break;
						}
					}
					for(int x = 0; x<=0x14; x++){
						if(n==0x314f+x){
							Col[x]+=1;
							break;
						}
						for(int j = 0; j <= 0x12; j++){
							if(n>=(0xAC00+0x24C*j+0x1C*x) && n<=(0xAC1B+0x24C*j+0x1C*x)){
								Col[x]+=1;
								break;
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
	public static boolean checkHangulJamo(char c) {
		boolean check = true;
		switch (c) {
			case 'ㄱ':
				Con1[0] +=1;
				break;
			case 'ㄲ': 
				Con1[1] +=1;
				break;
			case 'ㄴ': 
				Con1[2] +=1;
				break;
			case 'ㄷ': 
				Con1[3] +=1;
				break;
			case 'ㄸ': 
				Con1[4] +=1;
				break;
			case 'ㄹ':
				Con1[5] +=1;
				break;
			case 'ㅁ': 
				Con1[6] +=1;
				break;
			case 'ㅂ': 
				Con1[7] +=1;
				break;
			case 'ㅃ': 
				Con1[8] +=1;
				break;
			case 'ㅅ': 
				Con1[9] +=1;
				break;
			case 'ㅆ': 
				Con1[10] +=1;
				break;
			case 'ㅇ':
				Con1[11] +=1;
				break;
			case 'ㅈ': 
				Con1[12] +=1;
				break;
			case 'ㅉ': 
				Con1[13] +=1;
				break;
			case 'ㅊ': 
				Con1[14] +=1;
				break;
			case 'ㅋ': 
				Con1[15] +=1;
				break;
			case 'ㅌ': 
				Con1[16] +=1;
				break;
			case 'ㅍ': 
				Con1[17] +=1;
				break;
			case 'ㅎ':
				Con1[18] +=1;
				break;
			case 'ㅏ': 
				Col[0] +=1;
				break;
			case 'ㅐ': 
				Col[1] +=1;
				break;
			case 'ㅑ': 
				Col[2] +=1;
				break;
			case 'ㅒ': 
				Col[3] +=1;
				break;
			case 'ㅓ': 
				Col[4] +=1;
				break;
			case 'ㅔ':
				Col[5] +=1;
				break;
			case 'ㅕ': 
				Col[6] +=1;
				break;
			case 'ㅖ': 
				Col[7] +=1;
				break; 
			case 'ㅗ': 
				Col[8] +=1;
				break;
			case 'ㅘ': 
				Col[9] +=1;
				break;
			case 'ㅙ': 
				Col[10] +=1;
				break;
			case 'ㅚ':
				Col[11] +=1;
				break;
			case 'ㅛ': 
				Col[12] +=1;
				break;
			case 'ㅜ': 
				Col[13] +=1;
				break;
			case 'ㅝ': 
				Col[14] +=1;
				break;
			case 'ㅞ': 
				Col[15] +=1;
				break;
			case 'ㅟ': 
				Col[16] +=1;
				break;
			case 'ㅠ':
				Col[17] +=1;
				break;
			case 'ㅡ': 
				Col[18] +=1;
				break;
			case 'ㅢ': 
				Col[19] +=1;
				break;
			case 'ㅣ':
				Col[20] +=1;
				break;
			default :
				check = false;
		}
		return check;
	}
	
}
