package com.javaex.ex03;

import java.util.ArrayList;
import java.util.Scanner;


public class GoodsApp {

    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	ArrayList<Goods> aList = new ArrayList<Goods>();
    	int total = 0;
    	
    	
    	System.out.println("상품을 입력해주세요(종료 q)");
    	
    	while(true) {
    		
    		String str = sc.nextLine();
    		
    		if(str.equals("q")) {
    			System.out.println("[입력완료]");
    			System.out.println("==============================");
    			break;}
    		
    		String[] arr = str.split(",");
    		
    		Goods goods = new Goods(arr[0],Integer.parseInt(arr[1]),Integer.parseInt(arr[2]));
    		aList.add(goods);
    		total = total+Integer.parseInt(arr[2]);
    		 		
    	}
    	
    	for(Goods g : aList) {
    		g.showInfo();
    	}
    	
    	
    	System.out.println("모든 상품의 갯수는 "+total+"개 입니다.");
    	
    	sc.close();

       
    }

}
