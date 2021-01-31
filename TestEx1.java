package ggomi.com.soriting;

import java.util.Arrays;
import java.util.Scanner;

public class TestEx1 {
	///////////////////////ㅔ///////////////////////////////////
	//문제 												
	//첫째 줄에 정렬하고자 하는 수 N은 1,000,000,000 보다 작거나 같은 자연수이다   
	//첫째줄에 자리수를 내림차순으로 정렬한 수를 출력한다.				   
	//													
	//나의 생각												
	//1. 값을 입력한다 ( return  만약 0보다작거나, 1,000,000,000 초과 ) 
	//=>while 문으로 돌려면?									 
	//2. 각자의 숫자를 분리하여 배열을 만듦 							   
	//3. 내림차순 정렬을 해서 출력								 
	//////////////////////////////////////////////////////////
	
	public void getNumberArray(String  Number) {
//	System.out.println(Number);
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("0초과 1,000,000,000 미만의 수를 입력해 주시기 바랍니다.");
//		String Number = String.valueOf(scanner.nextInt());  ==> Scanner 로 읽으면 왜 안돼? 좀더 알아보기!
		
			
		try {
		if(Integer.parseInt(Number)>0 && Integer.parseInt(Number)<1000000000) {//범위
			//배열 만들기
			int [] numarr =new int [Number.length()];
			for (int i = 0; i <numarr.length; i++) {
			numarr[i]=Integer.parseInt(Number.substring(i,i+1));
		}

		int tmp = 0;
		System.out.println("Input Number: "+Number);
		//내림차순배열 
		for (int i = 0; i < numarr.length; i++) {
			for (int j = 0; j < numarr.length-1; j++) {
				if(numarr[j] < numarr[j+1]) {
					tmp = numarr[j];
					numarr[j]=numarr[j+1];
					numarr[j+1]=tmp;
				}
			}
		}
		//결과 출력
		System.out.print("Output Number: ");
		for(int data:numarr)
		 System.out.print(data);
		
		}else {
			System.out.println("잘못된 값을 넣었습니다.");
		}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("오류값입니다.");
		}
	}
	
	public static void main(String[] args) {
		TestEx1 ct = new TestEx1();
		ct.getNumberArray("1000000001");
		//문자열 말고 숫자로 넣을 방법은 없을까?
	}
}
