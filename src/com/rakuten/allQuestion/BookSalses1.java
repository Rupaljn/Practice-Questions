package com.rakuten.allQuestion;

public class BookSalses1 {
public static void main(String[] args) {
	int book = 95;
	if(book>=30 && book<=100){
		if(book>=30 && book<=50)
			System.out.println("D");
		else if(book>=51 && book<=60)
			System.out.println("C");
		else if(book>=61 && book<=80)
			System.out.println("B");
		else
			System.out.println("A");
	}
	else
		System.out.println("inValid");
	
}
}
