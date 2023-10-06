package com.kn.Array;

import java.util.Scanner;

public class ElementsOfAnArrayInOtherArrayInReverseOrder {

	public static void main(String[] args) 
	{
		int[] a = new int[4];
		Scanner scan = new Scanner(System.in);
		System.out.println("arr elements are = ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=scan.nextInt();
		}
		System.out.println("Elements of array = ");
		int[] c = printElementsToOtherArraYReverseOrder(a);
		for(int i=c.length-1;i>=0;i--)
		{
			System.out.println(c[i]);
		}
		scan.close();
		
	}

	public static int[] printElementsToOtherArraYReverseOrder(int[] a)
	{
		int[] b = new int[a.length];
		for(int i=0;i<a.length;i++)
		{
		b[i]=a[i];	
		}
		return b;
	}
}
