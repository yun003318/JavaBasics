package ch05;

import java.util.Scanner;

// �ϳ����� ž
public class Hanoi {
	//no���� ������ x�� ��տ��� y�� ������� �ű�
	static void move(int no, int x, int y) {
		if(no>1)
			move(no-1, x, 6-x-y);
		
		System.out.println("����["+no+"]�� "+x+"��տ��� "+y+"������� �ű�");
		
		if(no>1)
			move(no-1, 6-x-y, y);
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�ϳ����� ž");
		System.out.print("���� ����: ");
		int n = sc.nextInt();
		
		move(n, 1, 3);		// 1�� ����� n���� ������ 3�� ������� �ű�.
	}
}
