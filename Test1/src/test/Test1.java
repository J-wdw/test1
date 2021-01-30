package test;

import java.util.ArrayList;
import java.util.Scanner;

public class Test1 {
 /*
  * int c = new Scanner(System.in).nextInt();
  * 输入一个字符串,按字典序打印出该字符串中字符的所有排列。
  * 例如输入字符串abc,则按字典序打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。
  */
	
	public static void main(String[] args) {
		String c = new Scanner(System.in).next();
		String aa=method(c);
		System.out.println(aa);
	}

private static String method(String c) {
	/**
	 *System.out.println(s2.charAt(1));//b:获取下标为1,位置上的字符
		System.out.println(s2.concat("efg"));//abcdefg:在原有的字符串拼接
		System.out.println(s2.endsWith("g"));//false:字符串不可变,判断最后一位是否是g
		System.out.println(s2.endsWith(s1));//true:String类重写了equals内容
		System.out.println(s2.getBytes());//[B@15db9742:将字符串转为了brte数组
		System.out.println(s2.indexOf("c"));//2,取第一个c的下标值
		s2="abcac";
		System.out.println(s2.lastIndexOf("c"));//4:取最后一个c的下标值
		System.out.println(s2.length());//字符串的长度
        s2="a b c d e";
        System.out.println(s2.split(""));//[Ljava.lang.String;@6d06d69c,按照一定的规划进行切割,返回一个字符串数组
        System.out.println(s2.startsWith("a"));//true,判断是否a开始
        System.out.println(s2.substring(1));// b c d e,截取,从下标为1的位置开始向后截取到的字符串(左闭右开)
        System.out.println(s2.substring(3, 7));// c d,截取下标3-6,[3,7)(左闭右开)
        System.out.println(s2.toLowerCase());//a b c d e,转小写
        System.out.println(s2.toUpperCase());//ABCD,转大写 
        
        
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
