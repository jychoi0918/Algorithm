package ggomi.com.soriting;



public class QuickEx1 {
	private static void quickSort(int []arr) {
	quickSort(arr, 0 , arr.length -1); 								// 시작위치와 끝나는 위치 재귀함수 호출
	}
	
	private static void quickSort(int[] arr, int start, int end) { //시작과 끝 
		int part2 = partition(arr,start,end); 					   // 오른쪽 파티션의 첫번째 방
		if(start < part2-1) {									   //오른쪽 파티션의 시작점이 1개 이상 차이날때 또 다시 정렬 시작
			quickSort(arr,start,part2-1);   					   //왼쪽 파티션 정렬
		}
		if(part2<end) {             							   //오른쪽 파티션 시작점이 끝보다 작을 경우
			quickSort(arr,part2,end);							   //다시 오른쪽 파티션 정렬 시작 (오른쪽 파티션 시작점,
		}
	}
	
	private static int partition(int[] arr, int start, int end) {
		int pivot =arr[(start + end)/2];						//배열방의 중간에 있는 숫자
		while (start<=end) {									// 시작점이 끝점보다 작거나 같을 때만
			while(arr[start]<pivot)start++; 					// 배열방의 start값이 pivot(기준보다 작으면) start는 한칸씩 증가하며 바꿀 값 찾기
			while(arr[end]>pivot)end--;  						// 배열방의 end 값이  pivot(기준보다 크면) end 값은는 한칸씩 감소하며 바꿀값 찾기
			if(start<=end) { //지나쳤는지 다시확인!
				swap(arr,start,end);
				start++; //앞으로 가던건 계속 앞으로
				end--;	 //뒤로 가던건 계속 뒤로
			}
		}
		return start; // 새로 나누는 오른쪽 방의 시작 점
	}
	private static void swap(int[] arr, int start, int end) {
		int tmp = arr[start];
		arr[start]=arr[end];
		arr[end] = tmp;
		
	}
	private static void printArray(int[]arr) { 	//출력
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
