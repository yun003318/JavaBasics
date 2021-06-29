package chap06;

import java.util.Scanner;

class BubbleSort_Q1 {
	static void swap(int a[], int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	// 버블 정렬
	static void bubbleSort(int[] a, int n) {
		for(int i=0; i<n-1; i++)
			for(int j=i; j<n-1; j++)
				if(a[j] > a[j+1])
					swap(a, j, j+1);
	}

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("버블 정렬(ver1 Q1)");
		System.out.print("요솟 수 : ");
		int nx = sc.nextInt();
		int[] x = new int[nx];
		
		for(int i=0; i<nx; i++) {
			System.out.print("x["+i+"] : ");
			x[i] = sc.nextInt();
		}
		
		
		bubbleSort(x, nx); 		// 배열 x를 버블 정렬합니다.
		
		
		System.out.println("오름차순으로 정렬했습니다.");
		for(int i=0; i<nx; i++)
			System.out.println("x["+i+"]= " +x[i]);
		
		
}
}