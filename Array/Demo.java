package com.kn.Array;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args)
	{
//		Creation of an array
		Employee[] e = new Employee[5];
//		initialization
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<e.length;i++)
		{
			e[i] = new Employee();
		}
		for(int i=0;i<e.length;i++)
		{
			System.out.println("enter the data of element "+i+ " = ");
			e[i].name = scan.nextLine();
			e[i].age = scan.nextInt();
			scan.nextLine();
		}
		for(int i=0;i<e.length;i++)
		{
			System.out.println("Student = "+i+"  "+e[i].name+"  -  "+e[i].age);
			
		}
		scan.close();
		
	}

}
