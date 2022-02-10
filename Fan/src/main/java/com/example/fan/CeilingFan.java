package com.example.fan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CeilingFan {

	//CeilingFan properties
	
	private String fan_size = null;
	private String fan_color=null;
	private String fan_power = null;
	private int fan_current_state = 0;
	private int fan_reverse_current_state =0;
	
	//Constructor to initialize Fan object
	
	public CeilingFan() {
		fan_current_state = 0;
		fan_reverse_current_state=0;
	}
	
   public CeilingFan(String fan_size,String fan_color,String fan_power, int fan_cuurent_state,int fan_reverse_current_state) {
	   
	   this.fan_size = fan_size;
	   this.fan_color = fan_color;
	   this.fan_power = fan_power;
	   this.fan_current_state = fan_current_state;
	   this.fan_reverse_current_state = fan_reverse_current_state;
   }
	//CeilingFan functions or Methods
 
   
   //For first cord functions
   //first pull the chain to start fan at  min speed
   //second time pull the chain it running medium speed.
   //third  time pull the chain  it's running max speed and stop zero speed.
	
  
   //revolves clockwise direction
   
	   
	   

   public void pull_cord_1() {
       //pull cord first time
	   if (fan_current_state == 0) {
           fan_current_state= 1;
           System.out.println("min speed");
      //pull cord second time
	   } else if (fan_current_state == 1) {
           fan_current_state = 2;
           System.out.println("medium speed");
       //pull cord third time
	   } else if (fan_current_state == 2) {
           fan_current_state = 3;
           System.out.println("max speed");
       } else {
           fan_current_state = 0;
           System.out.println("zero  speed");
       }
   }
   
   //revolves anticlock(reverse) direction.
   public void pull_cord_2() {
	   //pull cord first time
	   if (fan_reverse_current_state == 0) {
           fan_reverse_current_state= 1;
           System.out.println("min reverse speed");
      //pull cord second time
	   } else if (fan_reverse_current_state == 1) {
           fan_reverse_current_state = 2;
           System.out.println("medium reverse speed");
       //pull cord third time
	   } else if (fan_reverse_current_state == 2) {
           fan_reverse_current_state = 3;
           System.out.println("max reverse speed");
       } else {
           fan_reverse_current_state = 0;
           System.out.println("zero reverse  speed");
       } 
   }
   

static String getLine() {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String line = null;
    try {
        line = in.readLine();
    } catch (IOException ex) {
        ex.printStackTrace();
    }
    return line;
}
   
   
   
	//For second cord functions
	public static void main(String args[]) {
		//creating Fan object
		
		Scanner fan_Obj = new Scanner(System.in);
		
		 String fan_size = null;
		 String fan_color=null;
		 String fan_power = null;
		 int fan_current_state = 0;
		 int fan_reverse_current_state =0;
		 int fan_cord_number=0;
		 System.out.println("Enter Fan_Size,Fan_Color,Fan_Power,"
		 		+ "Fan_current_state,Fan_reverse_current_state and fan_cord_number");
		 
		 fan_size = fan_Obj.nextLine();
		 fan_color= fan_Obj.nextLine();  
		 fan_power=fan_Obj.nextLine();
		 fan_current_state= fan_Obj.nextInt();
		 fan_reverse_current_state=fan_Obj.nextInt();
		 fan_cord_number=fan_Obj.nextInt();

		CeilingFan clf = new CeilingFan(fan_size,fan_color,fan_power,fan_current_state,fan_reverse_current_state);
	     
	
	            if(fan_cord_number==1) {
	            	

	            	 while (true) {
	                     System.out.print("Press ENTER means to pull the cord of Fan");
	                     getLine();
	                     clf.pull_cord_1();
	           	  }
	            	
	            
	            }
	            else if (fan_cord_number==2){

	            	 while (true) {
	                     System.out.print("Press ENTER means to pull the reverse cord of Fan");
	                     getLine();
	                     clf.pull_cord_2();
	           	  }
	            	
	            } 
	            else {
	            	System.out.println("Entered wrong number ,Enter either 1 or 2");
	    
		
	            }
	}
	
}
