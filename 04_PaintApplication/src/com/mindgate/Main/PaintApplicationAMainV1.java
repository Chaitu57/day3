package com.mindgate.Main;

import java.util.Scanner;

import com.mindgate.factory.shapeFactory;
import com.mindgate.pojo.Shapes;

public class PaintApplicationAMainV1 {

	public static void main(String[] args) {

		
		int choice;

		System.out.println("select shapes");
		System.out.println("1.circle");
		System.out.println("2.triangle");
		System.out.println("3.square");

		System.out.println("Enter your choices");

		Scanner scanner = new Scanner(System.in);
		choice = scanner.nextInt();

		Shapes shapes=shapeFactory.getshape(choice);
		if(shapes!=null)
		shapes.draw();
		else
			System.out.println("invalid shape choice");
	}

}
