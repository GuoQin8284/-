package com.scanner;

import java.util.Scanner; //��һ�����ȵ���

public class ScannerDemo01 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);//�ڶ��������������������
//		System.out.println("������һ��������");
//		int i = sc.nextInt();//���������������������
//		System.out.println("i:"+i);
//	}
	
	//��������2����,������2�����ĺ�;
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("�������һ����:");
//		int i1 = sc.nextInt();
//		System.out.println("i1:"+i1);
//		System.out.println("������ڶ�����:");
//		int i2 = sc.nextInt();
//		System.out.println("i21:"+i2);
//		System.out.println("-------------------------");
//		System.out.println("����֮��Ϊ:"+(i1+i2));
//	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ����:");
		int i1 = sc.nextInt();
		System.out.println("i1:"+i1);
		System.out.println("������ڶ�����:");
		int i2 = sc.nextInt();
		System.out.println("i2:"+i2);
		System.out.println("�������������:");
		int i3 = sc.nextInt();
		System.out.println("i3:"+i3);
		System.out.println("-------------------------");
		int temp = (i1 > i2) ? i1 : i2;
		int max = (temp > i3) ? temp : i3;
		System.out.println("max:"+max);
	}
}
