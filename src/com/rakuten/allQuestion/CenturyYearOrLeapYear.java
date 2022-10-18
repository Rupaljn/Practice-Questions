package com.rakuten.allQuestion;

import java.util.Scanner;

public class CenturyYearOrLeapYear {
public static void main(String[] args) {
	int year = 2017;
	if((year%4==0 && year%100!=0) ||(year%100==0)){
	System.out.println("True");
	}
	else{
		System.out.println("False");
	}
}
}
