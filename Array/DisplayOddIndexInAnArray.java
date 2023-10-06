package com.kn.Array;

import java.util.Scanner;

public class DisplayOddIndexInAnArray {

	public static void main(String[] args)
	{
		int[] a = new int[4];
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
			System.out.println("elements are = ");
			a[i]=scan.nextInt();
		}
		displayOddIndexElements(a);
		scan.close();
	}

	public static void displayOddIndexElements(int[] a) 
	{
		for(int i=0;i<a.length;i++)
		if(i%2!=0)
		{
			System.out.println("Odd Index Elements are = "+a[i]);
		}
	}

}
