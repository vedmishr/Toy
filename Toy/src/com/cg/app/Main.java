package com.cg.app;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("Welcome to Toy simulator");
		System.out.println("Enter the command as follows- PLACE X,Y,NORTH|WEST|SOUTH|EAST MOVE LEFT RIGHT REPORT EXIT");
		Command command =new Command();
		Scanner scanner=new Scanner(System.in); 
		boolean flag=true;	
		while(flag!= false)
		{
			String choice=scanner.nextLine();
			if(("EXIT").equals(choice))
				flag=false;
			else
			command.value(choice);
		}
	}
}