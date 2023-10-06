package com.kn.Array;

import java.util.Scanner;

public class EvenElements {

	public static void main(String[] args) 
	{
		int[] a = new int[5];
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
			System.out.println("enter the elements = ");
			a[i]=scan.nextInt();
		}
		printEvenElements(a);
		scan.close();
	}

	public static void printEvenElements(int[] a) 
	{
		for(int i=0;i<a.length;i++)
		if(a[i]%2==0)
		{
			System.out.println("even elements are = "+a[i]);
		}
	}

}
