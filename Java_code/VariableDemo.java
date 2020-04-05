/*
	变量的定义格式：
		数据类型 变量 = 初始化值；
		
	数据类型：
		byte,short,int,long float,double,char,boolean
	
	注意：
		定义long类型变量的时候，最好直接加L
		定义float类型变量的时候，最后直接加F
*/


public class VariableDemo{
	public static void main(String[] args){
		//定义byte类型的变量
		byte b = 10;
		System.out.println(b);
		
		//定义short类型的变量
		short s = 100;
		System.out.println(s);
		
		//定义int类型的变量
		int i = 10;
		System.out.println(i);
		
		//定义long类型的变量
		long l = 1000000000000000000L;
		System.out.println(l);
		
		//定义float类型的变量
		float f = 12.45F;
		System.out.println(f);
		
		//定义double类型的变量
		double d = 12.3434524;
		System.out.println(d);
		
		//定义char类型变量
		char c = 'c';
		System.out.println(c);
		
		//定义boolean类型的变量
		Boolean bb = true;
		System.out.println(bb);
	}
	
}