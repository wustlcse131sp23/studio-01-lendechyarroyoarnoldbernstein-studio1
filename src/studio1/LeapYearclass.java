package studio1;

import java.util.Scanner;

public class LeapYearclass {

public static void main(String[] args){
	
	Scanner in = new Scanner(System.in);
	System.out.println("Value for n1?");
	int n1 = in.nextInt();
	boolean isOrdered = ((n1%4==0)&&(n1%100!=0) || (n1%400 == 0));
	System.out.println(n1+ " is a leap year: " +isOrdered);
	
}}