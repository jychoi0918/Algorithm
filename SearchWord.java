package ggomi.com.algorithm;

import java.util.Arrays;

//영어 단어를 찾을때 반복되는 단어 찾기
//단 중복되어서 여러개를 구할 수가 없다.
//문서의 길이는 최대 2500개 둘째 줄에 검색하고 싶은 단어 
//길이는 최대 50이다. 문사와 단어는 알파벳 소문자와 공백.

public class SearchWord {

	static String str = "anyway you want it that is the way you need it any way you want it";
	static String word = "any";
	int count = 0 ;
	
	public void countWord() {
		
		String [] strArr = str.split("");
		String [] wordArr = word.split("");
	
		for (int i = 0; i < strArr.length-wordArr.length+1; i++) {
			if(str.substring(i,i+wordArr.length).equals(word)) {
			count ++;
			i+=wordArr.length-1;
			}
		}
		
		
		
	
		System.out.println(count);
		}		
	
	
	
	public static void main(String[] args) {
		SearchWord sw = new SearchWord();
		System.out.println(sw.str);
		System.out.println(sw.word);
		sw.countWord();
 }
}


