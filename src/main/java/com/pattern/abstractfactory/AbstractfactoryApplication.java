package com.pattern.abstractfactory;

import domain.Shape;
import domain.ShapeFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AbstractfactoryApplication {

	public static void main(String[] args) {

//		Shape Problem

		Shape shape1 = ShapeFactory.getShape("CIRCLE");
		shape1.draw();

		Shape shape2 = ShapeFactory.getShape("RECTANGLE");
		shape2.draw();
	}

}
