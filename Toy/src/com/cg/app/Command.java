package com.cg.app;

public class Command {

	public void value(String choice){
		int varx=0;
		int vary=0;
		String direction = null;
		Function function=new Function();
		String[] args = choice.split(" ");  //Split the string on basis of spaces
		String[] separation;
		if((args[0]).equals("PLACE")){
			separation=args[1].split(",");   //Split the string on basis of commas
			varx=Integer.parseInt(separation[0]);  //parsing the variables
			vary=Integer.parseInt(separation[1]);
			direction=separation[2];
			function.place(varx,vary,direction);
		}			
		if((args[0]).equals("MOVE")){
			function.move();
		}
		if((args[0]).equals("LEFT")){
			function.left();
		}
		if((args[0]).equals("RIGHT")){
			function.right();
		}
		if((args[0]).equals("REPORT")){
			function.report();
		}
	}
}
