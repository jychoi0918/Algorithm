package com.happy.study.oldPractice;



public class QuickEx1 {
	private static void quickSort(int []arr) {
	quickSort(arr, 0 , arr.length -1); 								// ������ġ�� ������ ��ġ ����Լ� ȣ��
	}
	
	private static void quickSort(int[] arr, int start, int end) { //���۰� �� 
		int part2 = partition(arr,start,end); 					   // ������ ��Ƽ���� ù��° ��
		if(start < part2-1) {									   //������ ��Ƽ���� �������� 1�� �̻� ���̳��� �� �ٽ� ���� ����
			quickSort(arr,start,part2-1);   					   //���� ��Ƽ�� ����
		}
		if(part2<end) {             							   //������ ��Ƽ�� �������� ������ ���� ���
			quickSort(arr,part2,end);							   //�ٽ� ������ ��Ƽ�� ���� ���� (������ ��Ƽ�� ������,
		}
	}
	
	private static int partition(int[] arr, int start, int end) {
		int pivot =arr[(start + end)/2];						//�迭���� �߰��� �ִ� ����
		while (start<=end) {									// �������� �������� �۰ų� ���� ����
			while(arr[start]<pivot)start++; 					// �迭���� start���� pivot(���غ��� ������) start�� ��ĭ�� �����ϸ� �ٲ� �� ã��
			while(arr[end]>pivot)end--;  						// �迭���� end ����  pivot(���غ��� ũ��) end ������ ��ĭ�� �����ϸ� �ٲܰ� ã��
			if(start<=end) { //�����ƴ��� �ٽ�Ȯ��!
				swap(arr,start,end);
				start++; //������ ������ ��� ������
				end--;	 //�ڷ� ������ ��� �ڷ�
			}
		}
		return start; // ���� ������ ������ ���� ���� ��
	}
	private static void swap(int[] arr, int start, int end) {
		int tmp = arr[start];
		arr[start]=arr[end];
		arr[end] = tmp;
		
	}
	private static void printArray(int[]arr) { 	//���
		for(int data : arr) {
			System.out.print(data + ", ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] arr = {9,6,8,5,7};
		printArray(arr);
		quickSort(arr);
		printArray(arr);
		
	}
}
