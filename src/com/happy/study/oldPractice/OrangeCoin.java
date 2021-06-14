package com.happy.study.oldPractice;

import java.util.Arrays;


//////////////////////////////////////////////
//�� ���� ���� 1�� ����
//�Ǹ� ������ ���� , ������ �ȵ�� ��ȫ������ �ִ� ��
//
//���� �� ����
//1. �� ���� �ִ��� ������ �������� ��� ����
//2. �ִ밪�� ������ ��� �ȱ�
//3. �� ���� ���� ������ �迭���� �ִ��� ���� �� ���� ����
//
////////////////////////////////////////////////




public class OrangeCoin {
   int min = 0;	   //�� 
   int wallet = 0; //����
   int coin=0;     //���� �� ��
   int benefit = 0;//�̵� 
	public void BuyorSell(int min , int [] price) {
		this.min = min;

//		int [] price = new int [min];
		//��ȫ ���� �ְ� ����
//		for (int i = 0; i < min; i++) {
//			price[i]=((int)(Math.random()*1000+1));
//		}
		
		
		//
		System.out.println(min);
		for(int j : price) {
			System.out.print(j+" ");
		}
		System.out.println();
		System.out.println(getMax(price));
		
		//�迭�� �ִ��� ã�� �� ���� ��ȫ���� ���� ���.
		//2�̻��� �迭�� �� 
		while(price.length>1){
		int maxIndex = getMax(price);
	
		//�ִ� ������ ���� �ϳ��� �����
		for (int i = 0; i < maxIndex; i++) {
			coin++;
			wallet-=price[i];
		}
		//�ִ밪�϶� ��� �����ȱ�
		wallet = wallet+coin*price[maxIndex];
		price =Arrays.copyOfRange(price,maxIndex+1,price.length); 
		benefit+=wallet;
		//�ʱ�ȭ
		wallet = 0;
		coin = 0;
		}
		System.out.println(benefit);
		}
		
//		�ִ� ã��
public int getMax(int [] arr) {
	int maxIndex = 0;
	
	int max = arr[0];
	for (int i = 0; i < arr.length; i++) {
		if(arr[i]>max) {
		 max=arr[i];
		 maxIndex=i;
		}
	}
	return maxIndex;
	
}
	
	public static void main(String[] args) {
		OrangeCoin oc = new OrangeCoin();
		int []price = {1,2,3,2,3,9,5,6};
		oc.BuyorSell(8,price);
	}
	
	
	
	

}
