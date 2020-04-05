/*
	+:这是一个运算符，用于做加法运算符。
	在做运算的时候，一般要求参与运算的数据的类型必须一致。

	类型转换：
		隐式转换
		强制转换
		
	隐式转换：
		byte,short,char -- int -- long -- float -- double (有大类型时转换成大类型，无大类型时转换成小类型)
		byte,short,char(这3种类型在做运算时会转换成其它最大类型)

*/

public class TypeCastDemo{
	public static void main(String[] args){
		//定义2个变量
		int a = 2;
		int b = 4;
		int c = a + b;
		System.out.println(c);
		
		//定义一个byte类型的变量，一个int类型的变量
		byte bb = 2;
		int cc = 5;
		System.out.println(bb + cc);//直接输出这个结果是可以的，说明我们也应该可以接受这个数据
		
		/*
		byte dd = bb + cc; //使用byte接受时，编译报错，可能会损失精度
		System.out.println(dd);
		*/
		
		int ee = bb + cc;
		System.out.println(ee);
	}
	
}