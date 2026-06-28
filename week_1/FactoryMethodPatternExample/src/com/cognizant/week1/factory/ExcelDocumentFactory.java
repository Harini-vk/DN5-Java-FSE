package com.cognizant.week1.factory;
//Concrete class of Factory
public class ExcelDocumentFactory extends DocumentFactory{
	@Override
	public Document createDocument() {
		return new ExcelDocument();
	}

}
