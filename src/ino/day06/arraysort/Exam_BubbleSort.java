package ino.day06.arraysort;

public class Exam_BubbleSort {

	public static void main(String[] args) {
		// 버블정렬
		// 인접한 두개의 원소를 검사하여 정렬하는 방법
		// 구현이 쉽다는 장점, 이미 정렬된 데이터를 정렬할 때 가장 빠름
		// 기본적으로 다른 정렬에 비해서 속도가 느린편이며 역순으로 정렬할 때 가장 느림
		// {2,5,4,1,3} 
		// {2,5,4,1,3} 1회
		// {2,4,5,1,3} 2회
		// {2,4,1,5,3} 3회
		// {2,4,1,3,5} 4회
		// 첫번째 결과 {2 ,4 ,1 ,3 ,5}
		// {2 ,4 ,1 ,3 ,5}
		// {2 ,4 ,1 ,3 ,5}  1
		// {2 ,1 ,4 ,3 ,5}  2
		// {2 ,1 ,3 ,4 ,5}  3
		// 두번째 결과 {2 ,1 ,3 , 4, 5}
		// {2 ,1 ,3 , 4, 5}
		// {1 ,2 ,3 , 4, 5}  1 정렬 끝
		// {2 ,1 ,3 , 4, 5}  2
		// 세번째 결과 {1 ,2 ,3 , 4, 5}
		// {1 ,2 ,3 , 4, 5}
		// {1 ,2 ,3 , 4, 5}  1 끝
		// 네번째 결과 {1 ,2 ,3 , 4, 5}
		int [] arr = {2,5,4,1,3};
		for (int i = 0; i < arr.length-1; i++) {	// 4-1 = 3
			for (int j = 0; j < (arr.length-1)-i; j++) {	// (4-1)-i
				if (arr[j] > arr[j+1]) {	// 5 > 4 라면
					int temp = arr[j+1];	// temp 에 4 넣어두고
					arr[j+1] = arr[j];		// 인덱스 2자리에 인덱스1의 5 넣기
					arr[j] = temp;			// 인덱스 1자리에 4 넣기
				}
			}
			}
		for(int num : arr) {
			System.out.print(num + " ");
			// 비교하는 코드
//			if (arr[0] > arr[1]) {
//				int temp = arr[1];
//				arr[1] = arr[0];
//				arr[0] = temp;
//			}
//			if (arr[1] > arr[2]) {
//				int temp = arr[3];
//				arr[2] = arr[1];
//				arr[1] = temp;
//			}
//			if (arr[2] > arr[3]) {
//				int temp = arr[2];
//				arr[3] = arr[2];
//				arr[2] = temp;
//			}
//			if (arr[3] > arr[4]) {
//				int temp = arr[1];
//				arr[1] = arr[0];
//				arr[0] = temp;
//			}
		}
	}

}
