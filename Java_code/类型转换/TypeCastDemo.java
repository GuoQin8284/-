/*
	+:����һ����������������ӷ��������
	���������ʱ��һ��Ҫ�������������ݵ����ͱ���һ�¡�

	����ת����
		��ʽת��
		ǿ��ת��
		
	��ʽת����
		byte,short,char -- int -- long -- float -- double (�д�����ʱת���ɴ����ͣ��޴�����ʱת����С����)
		byte,short,char(��3��������������ʱ��ת���������������)

*/

public class TypeCastDemo{
	public static void main(String[] args){
		//����2������
		int a = 2;
		int b = 4;
		int c = a + b;
		System.out.println(c);
		
		//����һ��byte���͵ı�����һ��int���͵ı���
		byte bb = 2;
		int cc = 5;
		System.out.println(bb + cc);//ֱ������������ǿ��Եģ�˵������ҲӦ�ÿ��Խ����������
		
		/*
		byte dd = bb + cc; //ʹ��byte����ʱ�����뱨�����ܻ���ʧ����
		System.out.println(dd);
		*/
		
		int ee = bb + cc;
		System.out.println(ee);
	}
	
}