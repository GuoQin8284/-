/*
	ǿ��ת����
		Ŀ������ ���� = (Ŀ������) (��ת��������);
		���飺���������㣬���Ӧ����ʲô���ͣ�����ʲô���ͽ��գ���Ҫ����ת�����ͣ�������о��ȵ���ʧ��
*/

public class TypeCastDemo2{
	public static void main(String[] args){
		int a = 10;
		byte b = 100;
		
		//��ʽת��
		int c = a + b;
		System.out.println(c);
		
		//ǿ��ת��
		byte c1 = (byte) (a + b);
		System.out.println(c1);
	}
	
}