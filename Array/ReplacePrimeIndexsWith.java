package com.kn.Array;

import java.util.Scanner;

public class ReplacePrimeIndexsWith {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int[] a = new int[4];
		System.out.println("enter the elements = ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=scan.nextInt();
		}
	printPrimeIndexsWithMinusOne(a);
	scan.close();

}

	public static void printPrimeIndexsWithMinusOne(int[] a) 
	{
		System.out.println("Indexs are = ");
		for(int i=0;i<a.length;i++)
		{
			if(i%2!=0)
			{
				System.out.println("i = "+i+" = "+(-1)+" element are = "+a[i]+" ");
				
			}
		}
	}
}
		
	
