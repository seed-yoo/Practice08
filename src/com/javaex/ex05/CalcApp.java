package com.javaex.ex05;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String numLine;
		do {
			numLine = sc.nextLine();

			if ( numLine.equals("/q")) {
				break;
			}
			String[] sArray = numLine.split(" ");
			int n = Integer.parseInt(sArray[0]);
			int n2 = Integer.parseInt(sArray[2]);

			Add a = new Add();
			Sub s = new Sub();
			Mul m = new Mul();
			Div d = new Div();
			
			if (sArray[1].equals("+")) {
				a.setValue(n, n2);
				System.out.println(a.calculate());
			} else if (sArray[1].equals("-")) {
				s.setValue(n, n2);
				System.out.println(s.calculate());
			} else if (sArray[1].equals("*")) {
				m.setValue(n, n2);
				System.out.println(m.calculate());
			} else if (sArray[1].equals("/")) {
				d.setValue(n, n2);
				System.out.println(d.calculate());
			} else {
				System.out.println("알수없는 연산자 입니다.");
			}
			
		} while (true);

		System.out.println("종료합니다.");
		sc.close();
	}
}
