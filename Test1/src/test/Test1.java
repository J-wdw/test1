package test;

import java.util.ArrayList;
import java.util.Scanner;

public class Test1 {
 /*
  * int c = new Scanner(System.in).nextInt();
  * ����һ���ַ���,���ֵ����ӡ�����ַ������ַ����������С�
  * ���������ַ���abc,���ֵ����ӡ�����ַ�a,b,c�������г����������ַ���abc,acb,bac,bca,cab��cba��
  */
	
	public static void main(String[] args) {
		String c = new Scanner(System.in).next();
		String aa=method(c);
		System.out.println(aa);
	}

private static String method(String c) {
	/**
	 *System.out.println(s2.charAt(1));//b:��ȡ�±�Ϊ1,λ���ϵ��ַ�
		System.out.println(s2.concat("efg"));//abcdefg:��ԭ�е��ַ���ƴ��
		System.out.println(s2.endsWith("g"));//false:�ַ������ɱ�,�ж����һλ�Ƿ���g
		System.out.println(s2.endsWith(s1));//true:String����д��equals����
		System.out.println(s2.getBytes());//[B@15db9742:���ַ���תΪ��brte����
		System.out.println(s2.indexOf("c"));//2,ȡ��һ��c���±�ֵ
		s2="abcac";
		System.out.println(s2.lastIndexOf("c"));//4:ȡ���һ��c���±�ֵ
		System.out.println(s2.length());//�ַ����ĳ���
        s2="a b c d e";
        System.out.println(s2.split(""));//[Ljava.lang.String;@6d06d69c,����һ���Ĺ滮�����и�,����һ���ַ�������
        System.out.println(s2.startsWith("a"));//true,�ж��Ƿ�a��ʼ
        System.out.println(s2.substring(1));// b c d e,��ȡ,���±�Ϊ1��λ�ÿ�ʼ����ȡ�����ַ���(����ҿ�)
        System.out.println(s2.substring(3, 7));// c d,��ȡ�±�3-6,[3,7)(����ҿ�)
        System.out.println(s2.toLowerCase());//a b c d e,תСд
        System.out.println(s2.toUpperCase());//ABCD,ת��д 
        
        
	 */
	
//	for (String string : split) {
//	System.out.println(string);
//	}

	
//	ArrayList h=new ArrayList<>();
//	int length = c.length();
//	for (int i = 0; i < length; i++) {
//		char yi = c.charAt(i);
//		h.add(yi);
//	}
	String[] s = c.split("");

	String u="";
	String b="";
	String a="";
	String k="";
	boolean p=true;
	 
		for (int j = 0; j <s.length; j++) {
			u="";
			p=true;
			u=s[j];
			
			for (int i = 0; i <s.length; i++) {
				b=s[i];
				if (b==u) {
					continue;
				}
				if (p) {
					k=u+b;
					p=false;
				}else {
					k+=b;
				}
				
				//System.out.println(p);
			}
			a+=k+",";
			//System.out.println(u);
		}
	return a;
}

























}
