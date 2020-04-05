/*
	强制转换：
		目标类型 变量 = (目标类型) (被转换的数据);
		建议：数据做运算，结果应该是什么类型，就用什么类型接收，不要随意转换类型，否则会有精度的损失。
*/

public class TypeCastDemo2{
	public static void main(String[] args){
		int a = 10;
		byte b = 100;
		
		//隐式转换
		int c = a + b;
		System.out.println(c);
		
		//强制转换
		byte c1 = (byte) (a + b);
		System.out.println(c1);
	}
	
}