package com.barros.scanner;

import java.util.Scanner;

public class Scan {
	private static Scanner s;
	
	public void vrau() {
		s = new Scanner(System.in);
	}
	
	public static Integer vrauInt() {
		return s.nextInt();
	}
	
	public static String vrauString() {
		return s.next();
	}
	
	public static Float vrauFloat() {
		return s.nextFloat();
	}
}
