package com.kn.TwodArray;

import java.util.Scanner;

public class ThreedArrayLongType 
{
public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
	
//		threedArray creation and initialization using long type
		long[][][] arr = new long[2][3][4];
		System.out.println("three d array elements are = ");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;i++)
			{
				for(int k=0;k<arr.length;k++)
				{
			arr[i][j][k]=scan.nextLong();
			}
			}
		}
		
}
}
		
		
	


