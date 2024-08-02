package com.pattern.abstractfactory;

import domain.*;
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

		System.out.println();

//		Document Creator

		DocumentCreator documentCreator = new WordDocumentCreator();
		Document doc = documentCreator.createDocument();
		doc.open();

		DocumentCreator documentCreator1 = new PDFDocumentCreator();
		Document doc1 = documentCreator1.createDocument();
		doc1.open();

	}

}
