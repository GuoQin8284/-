package com.scanner;

import java.util.Scanner; //第一步：先导包

public class ScannerDemo01 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);//第二步：创建键盘输入对象
//		System.out.println("请输入一个整数：");
//		int i = sc.nextInt();//第三步：接受输入的数据
//		System.out.println("i:"+i);
//	}
	
	//键盘输入2个数,计算这2个数的和;
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("请输入第一个数:");
//		int i1 = sc.nextInt();
//		System.out.println("i1:"+i1);
//		System.out.println("请输入第二个数:");
//		int i2 = sc.nextInt();
//		System.out.println("i21:"+i2);
//		System.out.println("-------------------------");
//		System.out.println("二数之和为:"+(i1+i2));
//	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个数:");
		int i1 = sc.nextInt();
		System.out.println("i1:"+i1);
		System.out.println("请输入第二个数:");
		int i2 = sc.nextInt();
		System.out.println("i2:"+i2);
		System.out.println("请输入第三个数:");
		int i3 = sc.nextInt();
		System.out.println("i3:"+i3);
		System.out.println("-------------------------");
		int temp = (i1 > i2) ? i1 : i2;
		int max = (temp > i3) ? temp : i3;
		System.out.println("max:"+max);
	}
}
