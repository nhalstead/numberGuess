package com.robotics.velocity.numberGuess;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
    	
    	int totalGuess = 5;
    	int highestValue = -1;
    	int answer = -1;
    	
    	
    	p("Max Number: ");
    	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    	
    	String userInput = in.readLine();
    	highestValue = pInt(userInput);
    	
    	Random r = new Random();
    	answer = r.nextInt()%(highestValue + 1);
    	answer = Math.abs(answer);
    	//pln(answer);

    	int guess = -1;
    	while(guess != answer){
    		p("Please Enter a number: ");
    		guess = pInt(in.readLine());
    	}
    	
    	plne("You Have got It!");
    }
    
    
    
    public static void pln(String i){
    	System.out.println(i);
    }
    public static void pln(int i){
    	System.out.println(i);
    }
    
    public static void plne(String i){
    	System.out.println(i+"\n");
    }
    public static void plne(int i){
    	System.out.println(i+"\n");
    }
    
    public static void p(String i){
    	System.out.print(i);
    }
    public static void p(int i){
    	System.out.print(i);
    }
    
    public static int pInt(String i){
    	try {
    		return Integer.parseInt(i);
    	} 
    	catch (Exception e){
    		return 0;
    	}
    }
    
}
