package com.javaex.ex08;

import java.util.Scanner;

public class FriendApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("친구를 3명 등록해주세요.");
		
		String friend01 = sc.nextLine();
		String[] fArray01 = friend01.split(" ");
		Friend f01 = new Friend(fArray01[0], fArray01[1], fArray01[2]);
		
		String friend02 = sc.nextLine();
		String[] fArray02 = friend02.split(" ");
		Friend f02 = new Friend(fArray02[0], fArray02[1], fArray02[2]);
		
		String friend03 = sc.nextLine();
		String[] fArray03 = friend03.split(" ");
		Friend f03 = new Friend(fArray03[0], fArray03[1], fArray03[2]);
		
		f01.showInfo();
		f02.showInfo();
		f03.showInfo();
		
		
		sc.close();
		
	}

}
