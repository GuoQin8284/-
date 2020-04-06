/*
	变量定于的注意事项：
		A:变量未赋值，不能直接使用
		B:变量只是在它所属的范围内有效
			变量属于它所在的那个大括号
		C:一行上可以定于多个变量，但是不建议

*/

public class VariableDemo2{
	public static void main(String[] args){
		//定义一个变量
		int a = 10;
		System.out.println(a);
		
		{
			//这是代码块
			int c = 20;
			System.out.println(c);
		}
		// System.out.println(c);
		
		//一行上可以定于多个变量，但是不建议
		int a1,b1;
		a1 = 100;
		b1 = 200;
		System.out.println(a1);
		System.out.println(b1);
	}	
}