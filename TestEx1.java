package ggomi.com.soriting;

import java.util.Arrays;
import java.util.Scanner;

public class TestEx1 {
	///////////////////////��///////////////////////////////////
	//���� 													//
	//ù° �ٿ� �����ϰ��� �ϴ� �� N�� 1,000,000,000 ���� �۰ų� ���� �ڿ����̴�   //
	//ù°�ٿ� �ڸ����� ������������ ������ ���� ����Ѵ�.				    //
	//														//
	//���� ����													//
	//1. ���� �Է��Ѵ� ( return  ���� 0�����۰ų�, 1,000,000,000 �ʰ� ) //
	//=>while ������ ������?									    //
	//2. ������ ���ڸ� �и��Ͽ� �迭�� ���� 							    //
	//3. �������� ������ �ؼ� ���								    //
	//////////////////////////////////////////////////////////
	
	public void getNumberArray(String  Number) {
//	System.out.println(Number);
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("0�ʰ� 1,000,000,000 �̸��� ���� �Է��� �ֽñ� �ٶ��ϴ�.");
//		String Number = String.valueOf(scanner.nextInt());  ==> Scanner �� ������ �� �ȵ�? ���� �˾ƺ���!
		
			
		try {
		if(Integer.parseInt(Number)>0 && Integer.parseInt(Number)<1000000000) {//����
			//�迭 �����
			int [] numarr =new int [Number.length()];
			for (int i = 0; i <numarr.length; i++) {
			numarr[i]=Integer.parseInt(Number.substring(i,i+1));
		}

		int tmp = 0;
		System.out.println("Input Number: "+Number);
		//���������迭 
		for (int i = 0; i < numarr.length; i++) {
			for (int j = 0; j < numarr.length-1; j++) {
				if(numarr[j] < numarr[j+1]) {
					tmp = numarr[j];
					numarr[j]=numarr[j+1];
					numarr[j+1]=tmp;
				}
			}
		}
		//��� ���
		System.out.print("Output Number: ");
		for(int data:numarr)
		 System.out.print(data);
		
		}else {
			System.out.println("�߸��� ���� �־����ϴ�.");
		}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("�������Դϴ�.");
		}
	}
	
	public static void main(String[] args) {
		TestEx1 ct = new TestEx1();
		ct.getNumberArray("1000000001");
		//���ڿ� ���� ���ڷ� ���� ����� ������?
	}
}
