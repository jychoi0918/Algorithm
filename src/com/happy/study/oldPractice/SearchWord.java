package com.happy.study.oldPractice;

//���� �ܾ ã���� �ݺ��Ǵ� �ܾ� ã��
//�� �ߺ��Ǿ �������� ���� ���� ����.
//������ ���̴� �ִ� 2500�� ��° �ٿ� �˻��ϰ� ���� �ܾ� 
//���̴� �ִ� 50�̴�. ����� �ܾ�� ���ĺ� �ҹ��ڿ� ����.

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


