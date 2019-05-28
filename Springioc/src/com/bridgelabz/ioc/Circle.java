/**
 * 
 */
package com.bridgelabz.ioc;

/**
 * @author Kalyani Deobhankar
 *
 */
public class Circle implements Shape{

    @Override
    public void draw() {
	System.out.println("Draw circle");
	
    }

    @Override
    public void color() {
	System.out.println("color circle");
    }

    
    
}
