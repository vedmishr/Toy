package com.cg.app;

public class Function {
	public static int posx;
	public static int posy;
	public static String pdirection;
	//Method to implement move
	public void move(){
		int mx=posx;
		int my=posy;
		 if("NORTH".equals(pdirection))
			my=my+1;
		 if("SOUTH".equals(pdirection))
			my=my-1;
		 if("EAST".equals(pdirection))
			mx=mx+1;
		 if("WEST".equals(pdirection))
			mx=mx-1;
		
		boolean verdict=isValid(mx,my);
		if (verdict==true)
		{
			posx=mx;
			posy=my;
		}
		
		else
			System.out.println("Invalid position");
	}
	//Method to implement place
	public void place(int x,int y,String direction ){
		boolean verdict=isValid(x,y);
		if (verdict==true){
			posx=x;
			posy=y;
			pdirection=direction;
		}
		else{
			System.out.println("Invalid position");
		}
	}
	//Method to rotate the toy leftwards
	public void left(){
		String ldirection=pdirection;
		if(("NORTH").equals(ldirection)){
			pdirection="WEST";
		}
		else if(("WEST").equals(ldirection)){
			pdirection="SOUTH";
		}
		else if(("SOUTH").equals(ldirection)){
			pdirection="EAST";
		}
		else if(("EAST").equals(ldirection)){
			pdirection="NORTH";
		}
		else
			System.out.println("Wrong direction");
	}
	//Method to rotate the toy rightwards
	public void right(){
		String rdirection=pdirection;
		if(("NORTH").equals(rdirection)){
			pdirection="EAST";
		}
		else if(("WEST").equals(rdirection)){
			pdirection="NORTH";
		}
		else if(("SOUTH").equals(rdirection)){
			pdirection="WEST";
		}
		else if(("EAST").equals(rdirection)){
			pdirection="SOUTH";
		}
		else
			System.out.println("Wrong direction");
	}
	//Method to validate the position of toy
	public boolean isValid(int x,int y){
		if(x<0 || x>4 || y<0 || y>4)
		return false;
		else
	    return true;
	}
	//Method to print the output
	public void report() {
		System.out.println(posx+","+posy+","+pdirection);
	}
}
