package com.kn.Array;

import java.util.Scanner;

public class EvenElementsPresentInOddIndex {

	public static void main(String[] args)
	{
		int[] a = new int[4];
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
			System.out.println("elements are = ");
			a[i]=scan.nextInt();
		}
		printEvenElementInOddIndex(a);
		scan.close();
	}

	public static void printEvenElementInOddIndex(int[] a)
	{
		for(int i=0;i<a.length;i++)
			if(i%2!=0 && a[i]%2==0)
			{
				System.out.println("even elements in odd index array is = "+a[i]);
			}
	}

}
