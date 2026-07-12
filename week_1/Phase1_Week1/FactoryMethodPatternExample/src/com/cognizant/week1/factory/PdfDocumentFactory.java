package com.cognizant.week1.factory;
//Concrete class of Factory class
public class PdfDocumentFactory extends DocumentFactory{
	@Override
	public Document createDocument() {
		return new PdfDocument();
	}

}
