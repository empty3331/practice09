package com.javaex.ex02;

import java.util.ArrayList;
import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);
    	ArrayList<Friend> fList = new ArrayList<Friend>();
    	
    	System.out.println("친구를 3명 등록해 주세요");
    	
    	Friend f1 = new Friend(sc.next(), sc.next(), sc.next());
    	Friend f2 = new Friend(sc.next(), sc.next(), sc.next());
    	Friend f3 = new Friend(sc.next(), sc.next(), sc.next());
    	
    	fList.add(f1);
    	fList.add(f2);
    	fList.add(f3);
    	
    	
    	
    	for(int i =0; i<fList.size(); i++) {
    		
    		fList.get(i).showInfo();
    	}
    	
    	
    	
    	sc.close();
    	
    }

}
