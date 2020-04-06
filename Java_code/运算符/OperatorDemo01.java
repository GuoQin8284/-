package com.OperatorDemo;

public class OperatorDemo01 {
	//算数运算符
//	public static void main(String[] args) {
//		int a = 3;
//		int b = 5;
//		System.out.println(a + b);
//		System.out.println(a - b);
//		System.out.println(a * b);
//		System.out.println(a / b); //整数相除只能得到整数
//		System.out.println(a % b);
//	}
	
	//字符串和整数做运算
//	public static void main(String[] args) {
//		int a = 10;
//		int b = 20;
//		System.out.println("a:"+a);//字符串相加
//	}
	// ++和--运算
//	public static void main(String[] args) {
//		int a = 10, b=100;
//		a++;
//		b--;
//		System.out.println("a:"+a);//++运算
//		System.out.println("b:"+b);//--运算
//
//		a = ++b;
//		System.out.println("a:"+a);//++在前面时，先做++运算，再赋值
//		System.out.println("b:"+b);
//		
//		a = b++;
//		System.out.println("a:"+a);//++在后面时，先赋值，再做++运算
//		System.out.println("b:"+b);
//	}
	
	//赋值运算
//	public static void main(String[] args) {
//		int a = 10;
//		int b = 20;
//		short c = 30;
//		b += a;
//		System.out.println("b:"+b);//先拿左边和右边的数据先做加法运算，然后将运算结果赋值给左边的变量
//		
//		c += 1;
//		System.out.println("c:"+c);//扩展的赋值运算符，隐含了强制类型转换，相当于 c = (c的数据类型) (c+1)
//	}
	
	//关系运算符，其结果是boolean类型
//	public static void main(String[] args) {
//		int a = 10;
//		int b = 20;
//		System.out.println(a<b);
//		System.out.println(a>b);
//		System.out.println(a=b);
//		
//		int a1 = 10;
//		int b1 = 20;
//		System.out.println(a1<=b1);
//		System.out.println(a1==b1);
//		System.out.println(a1>=b1);
//	}
	
	/*
	 * &,|,^,!
	 * &&  和&单个结果一样，只是当前面的式子结果为false时，后面的式子不会执行，会短路
	 * ||  和|单个结果一样，只是当前面的式子结果为true时，后面的式子不会执行，会短路
	 * */
//	public static void main(String[] args) {
//		int a = 10;
//		int b = 20;
//		int c = 30;
//		System.out.println((a>b) & (b<c)); //false & true = false
//		System.out.println((a<b) & (b<c)); //true & true = true
//		System.out.println((a<b) & (b>c)); //true & false = false
//		System.out.println((a>b) & (b>c)); //false & false = false
//		System.out.println("------------------------");
//		
//		System.out.println((a>b) | (b<c)); //false | true = true
//		System.out.println((a<b) | (b<c)); //true | true = true
//		System.out.println((a<b) | (b>c)); //true | false = true
//		System.out.println((a>b) | (b>c)); //false | false = false
//		System.out.println("------------------------");
//		
//		//^表示相同为false，不同为true
//		System.out.println((a>b) ^ (b<c)); //false ^ true = true
//		System.out.println((a<b) ^ (b<c)); //true ^ true = false
//		System.out.println((a<b) ^ (b>c)); //true ^ false = true
//		System.out.println((a>b) ^ (b>c)); //false ^ false = false
//		System.out.println("------------------------");
//		
//		// !表示非，取反的意思
//		System.out.println((a>b)); //false
//		System.out.println(!(a<b)); //false
//		System.out.println(!!(a<b)); //true
//		System.out.println("------------------------");
//		
//		System.out.println((a>b) && (b++ > a)); //当前面的关系式为false时，就会产生短路，后面的表达式不会执行
//		System.out.println("b:"+b); //b = 20; 上个式子中的b++没有执行
//		System.out.println("------------------------");
//	}
	
		//三元运算符 ，当关系是为true时，取表达式1，反之，取表达式2
		//形式：(关系式) ? 表达式1:表达式2;
//	public static void main(String[] args) {
//		int a = 10;
//		int b = 20;
//		int c = (a>b)?100:200;
//		System.out.println("c:"+c);
//		System.out.println("------------------------");
//		
//		//使用三元运算符，比较3个数的大小
//		int a1 = 10;
//		int b1 = 20;
//		int c1 = 20;
//		int temp = (a1>b1)?a1:b1;
//		int max = (temp>c1)?temp:c1;
//		System.out.println("Max:"+max);
//	}
		
}
