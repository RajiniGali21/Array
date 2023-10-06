package com.kn.Array;

import java.util.Scanner;

public class ElementsInReverseOrder {

	public static void main(String[] args) 
	{
		int[] a = new int[4];
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
			System.out.println("elements are = ");
			a[i]=scan.nextInt();
		}
		printElementsInReverseOrder(a);
		scan.close();
		
		
	}

	public static void printElementsInReverseOrder(int[] a)
	{
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println("Reversed elements are = "+a[i]);
		}
	}
}
		


