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
    	int highestValue = 100;
    	int answer = -1;
    	int lowestValue = 0;
    	
    	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    	
    	p("Max Number: ");
    	highestValue = pInt(in.readLine());
    	p("Min Number: ");
    	lowestValue = pInt(in.readLine());
    	
    	Random r = new Random();
    	answer = (r.nextInt()%((highestValue - lowestValue) + 1)) + lowestValue;

    	answer = Math.abs(answer);
    	pln(answer);

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
