package Data;

import java.util.*;

public class Similarity {
	
	public static double CalcuJaccard(String str1, String str2, int q) {
		HashSet<String> str1Tokens = Tokenize(str1, q); 
		HashSet<String> str2Tokens = Tokenize(str2, q); 

        HashSet<String> allTokens = new HashSet<String>(); 
        allTokens.addAll(str1Tokens);
        allTokens.addAll(str2Tokens);
 
        return (double) ((str1Tokens.size() + str2Tokens.size()) - allTokens.size()) / (double) (allTokens.size()); 
	}
	
	private static HashSet<String> Tokenize(String str, int q) {
		HashSet<String> tokens = new HashSet<String>();
		if (q == 0) {
			String[] temp = str.split(" ");
			for (int i = 0; i < temp.length; i++)
				tokens.add(temp[i]);
		} else {
			for (int i = 0; i < str.length() - q + 1; i++)
				tokens.add(str.substring(i, i + q));
		}
		return tokens;
	}
	
	public static double CalcuEDSim(String str1, String str2) {
		if (str1.equals(str2))
			return 1;
		
		int ed = CalcuED(str1, str2);
		return (1 - (double) ed / Math.max(str1.length(), str2.length()));
	}

	/*
	 * Please implement the calculation of edit distance between two strings
	 * Dynamic programming should be used
	 */
	private static int CalcuED(String str1, String str2) {
		int a = str1.length();
		int b = str2.length();
		int ED[][] = new int[a + 1][b + 1];

		for (int i = 0; i <= a; i++) {

			for (int j = 0; j <= b; j++) {
				//first string empty
				if (i ==0) {
					ED[i][j] = j;
					//second string empty
				}else if (j ==0) {
					ED[i][j] = i;
					//if last characters are the same
				}else if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
					ED[i][j] = ED[i -1][j - 1];
					//minimum of all 3 rules.
				}else {
					ED[i][j] = Math.min(Math.min(ED[i][j -1] + 1, ED[i -1][j] + 1),
							ED[i -1][j -1] + 1);
				}
			}
		}
		return ED[a][b] ;
	}
	public static void main(String[] args) {
		String str1 = "University";
		String str2 = "Universty";
		int out = Similarity.CalcuED(str1,str2);
		System.out.println("Edit Distance= " + out);
		double out2 = Similarity.CalcuJaccard(str1,str2,2);
		System.out.println("Jaccard Coefficient= " + out2);
	}
}
