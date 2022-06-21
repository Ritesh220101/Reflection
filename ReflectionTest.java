package com.aurionpro.test;
import com.aurionpro.model.*;
import java.lang.reflect.*;
public class ReflectionTest {
	public static void main(String[] args) {
		String str = args[0];
		try {
			Class className = Class.forName(str);
			Reflection obj = new Reflection();
			System.out.println("Methods");
			obj.methods(className);
			System.out.println("Fields");
			obj.fields(className);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}	
	}
}