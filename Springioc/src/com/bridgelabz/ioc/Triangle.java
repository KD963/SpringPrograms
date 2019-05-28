/**
 * 
 */
package com.bridgelabz.ioc;

/**
 * @author Kalyani Deobhankar
 *
 */
public class Triangle implements Shape{

    @Override
    public void draw() {
	System.out.println("draw triangle");
	
    }

    @Override
    public void color() {
	System.out.println("color triangle");
	
    }

}
