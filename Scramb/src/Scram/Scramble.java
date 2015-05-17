package Scram;

public class Scramble {
	
	public String ScrambleWord(String str1){
		String str2;										// Reszeredmeny string
		char[] char1, char2;								// A munka ezekben a tombokben fog zajlani
		String textOut = "";	
		
		for (String word: str1.split(" "))
			{  
				char2 = word.toCharArray();					// Munkaciklus erejeig karaktertombbe konvertalas
				char1 = word.toCharArray();					// Munkavaltozo egyenlo hosszusagra hozasa
				
				for(int i = 1;i<char1.length-1;i++ )		// i=1 kezdoindex miatt kimarad elso char megforditasa 
				{		
					char2[i]=char1[char1.length-i-1];		// -1 miatt kimarad az utolso char megforditasa
				}
			
				str2 = new String(char2);					// Stringbe visszakonvertalas
			
			textOut=textOut+" "+str2;						// Hozzafuzes vegeredmenyhez
		}
		
		return textOut.substring(1);						// Elso karaktert eltunteti, ez egy felesleges " " lenne
	}
}