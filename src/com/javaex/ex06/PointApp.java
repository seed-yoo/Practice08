package com.javaex.ex06;

public class PointApp {

	public static void main(String[] args) {
		
		Point p1 = new Point(2, 3);
		Point p2 = new Point(2, 3);
		Point p3 = new Point(5, 3);
		Point p4 = p1;
		
		System.out.println(p1 == p2);
		System.out.println(p2 == p3);
		System.out.println(p3 == p4);
		System.out.println(p4 == p1);		
		System.out.println(p1.equals(p2));
		System.out.println(p4.equals(p1));
		/* 
		equals() 메소드가 없는데 실행되는 이유를 말하세요.
		=
		Object 클래스의 equals() 메소드가 사용 되었다.
		기본적으로 모든 클래스는 Object 클래스를 상속 받는다.
		 */
	}

}


