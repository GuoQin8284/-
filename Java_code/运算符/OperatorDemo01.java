package com.OperatorDemo;

public class OperatorDemo01 {
	//���������
//	public static void main(String[] args) {
//		int a = 3;
//		int b = 5;
//		System.out.println(a + b);
//		System.out.println(a - b);
//		System.out.println(a * b);
//		System.out.println(a / b); //�������ֻ�ܵõ�����
//		System.out.println(a % b);
//	}
	
	//�ַ���������������
//	public static void main(String[] args) {
//		int a = 10;
//		int b = 20;
//		System.out.println("a:"+a);//�ַ������
//	}
	// ++��--����
//	public static void main(String[] args) {
//		int a = 10, b=100;
//		a++;
//		b--;
//		System.out.println("a:"+a);//++����
//		System.out.println("b:"+b);//--����
//
//		a = ++b;
//		System.out.println("a:"+a);//++��ǰ��ʱ������++���㣬�ٸ�ֵ
//		System.out.println("b:"+b);
//		
//		a = b++;
//		System.out.println("a:"+a);//++�ں���ʱ���ȸ�ֵ������++����
//		System.out.println("b:"+b);
//	}
	
	//��ֵ����
//	public static void main(String[] args) {
//		int a = 10;
//		int b = 20;
//		short c = 30;
//		b += a;
//		System.out.println("b:"+b);//������ߺ��ұߵ����������ӷ����㣬Ȼ����������ֵ����ߵı���
//		
//		c += 1;
//		System.out.println("c:"+c);//��չ�ĸ�ֵ�������������ǿ������ת�����൱�� c = (c����������) (c+1)
//	}
	
	//��ϵ�������������boolean����
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
	 * &&  ��&�������һ����ֻ�ǵ�ǰ���ʽ�ӽ��Ϊfalseʱ�������ʽ�Ӳ���ִ�У����·
	 * ||  ��|�������һ����ֻ�ǵ�ǰ���ʽ�ӽ��Ϊtrueʱ�������ʽ�Ӳ���ִ�У����·
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
//		//^��ʾ��ͬΪfalse����ͬΪtrue
//		System.out.println((a>b) ^ (b<c)); //false ^ true = true
//		System.out.println((a<b) ^ (b<c)); //true ^ true = false
//		System.out.println((a<b) ^ (b>c)); //true ^ false = true
//		System.out.println((a>b) ^ (b>c)); //false ^ false = false
//		System.out.println("------------------------");
//		
//		// !��ʾ�ǣ�ȡ������˼
//		System.out.println((a>b)); //false
//		System.out.println(!(a<b)); //false
//		System.out.println(!!(a<b)); //true
//		System.out.println("------------------------");
//		
//		System.out.println((a>b) && (b++ > a)); //��ǰ��Ĺ�ϵʽΪfalseʱ���ͻ������·������ı��ʽ����ִ��
//		System.out.println("b:"+b); //b = 20; �ϸ�ʽ���е�b++û��ִ��
//		System.out.println("------------------------");
//	}
	
		//��Ԫ����� ������ϵ��Ϊtrueʱ��ȡ���ʽ1����֮��ȡ���ʽ2
		//��ʽ��(��ϵʽ) ? ���ʽ1:���ʽ2;
//	public static void main(String[] args) {
//		int a = 10;
//		int b = 20;
//		int c = (a>b)?100:200;
//		System.out.println("c:"+c);
//		System.out.println("------------------------");
//		
//		//ʹ����Ԫ��������Ƚ�3�����Ĵ�С
//		int a1 = 10;
//		int b1 = 20;
//		int c1 = 20;
//		int temp = (a1>b1)?a1:b1;
//		int max = (temp>c1)?temp:c1;
//		System.out.println("Max:"+max);
//	}
		
}
