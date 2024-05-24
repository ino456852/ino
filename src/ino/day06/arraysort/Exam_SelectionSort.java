package ino.day06.arraysort;

public class Exam_SelectionSort {

	public static void main(String[] args) {
		// 선택 정렬
		// 배열을 전부 검색하며 최소값을 고르고 왼쪽부터 채워나가는 정렬
		// 특징 : 데이터의 양이 적을 때 좋은 성능을 보여주는 정렬
		// 데이터 양이 많을 때 급격한 성능 저하는 보임.
		// 배열의 n번 인덱스 값은 n+1 ~ 마지막 인덱스 까지 비교함.
		// {2,5,4,1,3};
		// 첫번째 결과 : {1,5,4,2,3};
		// {1,5,4,2,3};
		// 두번째 결과 : {1,2,4,5,3};
		// {1,2,4,5,3};
		// 세번째 결과 : {1,2,3,5,4}
		// {1,2,3,5,4}
		// 네번째 결과 : {1,2,3,4,5}
		
		int [] arr = {2,5,4,1,3};
		for (int i = 0; i < 5; i++) {
			int min = i;
//			for (int j = i; j >= 0; j--)
			for (int j = i+1; j < 5; j++) {
				if(arr[min] > arr[j]) {		// arr[j] 보다 인덱스 0 이 크다면
					// 최소값이 나왔을 때 자리를 기억
					min = j;	// 최소값이 정해졌을 때의 min을 arr[min]으로 구하면 최소값
				}
			}
			int temp = arr[i];	// arr 마지막 인덱스 자리를 temp에 넣고
			arr[i] = arr[min];	// arr[i]에 큰 값을 넣고 
			arr[min] = temp;	// min 
		}
		// 정렬된 결과 출력
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}
}
//				if(arr[0] > arr[2]) {
//					// 
//				}
//				
//				if(arr[0] > arr[3]) {
//					// 
//				}
//				
//				if(arr[0] > arr[4]) {
//					// 
//				}
//				int temp = arr[0];
//				arr[0] = 최소값;
//				최소값의 자리 = temp;
//				
//			}
//		}
		
		
//	}
//
//}
