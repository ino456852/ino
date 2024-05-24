package ino.day06.arraysort;

public class Exam_InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 삽입정렬
		// 정렬 알고리즘 중에 하나, 가장 간단하고 기본이 되는 알고리즘
		// 배열의 n번 인덱스 값을 n-1번에서 0번 인덱스 까지 비교
		// n은 1부터 시작
		// {2, 5, 4, 1, 3}
		// 첫번째 : 5와 2 비교 -> 교환 x
		// 결과 : {2, 5, 4, 1, 3}
		// 4와 비교 시작
		// 두번째 : 4와 5비교 -? 교환 
		// 			4와 2비교 -> 교환 x
		// 결과 : {2, 4, 5, 1, 3}
		// 세번째 : 1과 5비교 -> 교환
//					1과 4비교 -> 교환
//					1과 2비교 -> 교환
		// 결과 {1, 2, 4, 5, 3}
		// 네번째 : 3과 5비교 -> 교환
//					3과 4비교 -> 교환
//					3과 2비교 -> 교환x
//					3과 1비교 -> 교환x
		// 결과 {1, 2, 3, 4, 5}
		
		int [] arr = {2, 5, 4, 1, 3};
		int max;
		for (int i = 1; i < arr.length; i++) {
			
			for(int j = i; j >= 1; j--) {
				
												// i가 아닌 j인 이유
				if (arr[j-1] > arr[j]) {        // 교환이 일어난 후 같은 값으로 비교하기 위해
					max = arr[j];		
										
					
					arr[j] = arr[j-1];
					arr[j-1] = max;
				}
			}
		}
		for (int num : arr) {
			System.out.print(num + " ");
		}
			// 5 하고 2 비교
//			if (arr[0] > arr[i]) {
//				max = arr[1];
//				arr[1] = arr[0];
//				arr[0] = max;
			// 4하고 5 비교, 4하고 2비교, i거 2알땨
//			if (arr[0] > arr[2]) {
//				max = arr[2];
//				arr[2] = arr[0];
//				arr[0] = max;
//			}
//			// 1하고 4비교, 1하고 5비교, 1하고 2비교
//			// i가 3일때
//			if (arr[2] > arr[3]) {
//				max = arr[3];
//				arr[3] = arr[2];
//				arr[2] = max;
//			}
//			if (arr[1] > arr[3]) {
//				max = arr[3];
//				arr[3] = arr[1];
//				arr[1] = max;
//			}
//			if (arr[0] > arr[3]) {
//				max = arr[3];
//				arr[3] = arr[0];
//				arr[0] = max;
//			}
//				System.out.print(arr[i] + " ");
//			} else if (min <= arr[i]) {
//				System.out.print(arr[i] + " ");
//		}	// 정렬된 결과 출력
	}
}

//}
