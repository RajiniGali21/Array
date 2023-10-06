package com.kn.TwodArray;

import java.util.Scanner;

public class TwodArray {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
//		TwoDArray Creation and initialization
		byte[][] arr = new byte[2][3];
		System.out.println("two d array elements are = ");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;i++)
			{
			arr[i][j]=scan.nextByte();
			}
		}
	}

}
