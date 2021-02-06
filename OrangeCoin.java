package ggomi.com.algorithm;

import java.util.Arrays;


//////////////////////////////////////////////
//분 마다 구매 1개 가능
//판매 언제든 가능 , 수수료 안드는 주홍코인의 최대 값
//
//정연 논리 정연
//1. 그 열의 최댓값이 나오기 전까지는 계속 구매
//2. 최대값이 나오면 모두 팔기
//3. 그 다음 부터 부터의 배열에서 최댓값이 나올 때 까지 구매
//
////////////////////////////////////////////////




public class OrangeCoin {
   int min = 0;	   //분 
   int wallet = 0; //지갑
   int coin=0;     //코인 수 ㅣ
   int benefit = 0;//이득 
	public void BuyorSell(int min , int [] price) {
		this.min = min;

//		int [] price = new int [min];
		//주홍 코인 주가 설정
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
		
		//배열의 최댓값을 찾고 그 전의 주홍코인 값들 사기.
		//2이상의 배열일 때 
		while(price.length>1){
		int maxIndex = getMax(price);
	
		//최댓값 이전에 코인 하나씩 사놓기
		for (int i = 0; i < maxIndex; i++) {
			coin++;
			wallet-=price[i];
		}
		//최대값일때 모든 코인팔기
		wallet = wallet+coin*price[maxIndex];
		price =Arrays.copyOfRange(price,maxIndex+1,price.length); 
		benefit+=wallet;
		//초기화
		wallet = 0;
		coin = 0;
		}
		System.out.println(benefit);
		}
		
//		최댓값 찾기
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
