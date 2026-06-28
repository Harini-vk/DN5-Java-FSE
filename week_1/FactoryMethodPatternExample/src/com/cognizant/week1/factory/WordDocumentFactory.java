package com.cognizant.week1.factory;
//concrete Factory class
public class WordDocumentFactory extends DocumentFactory{
	
	@Override
	
	public Document createDocument() {
		return new WordDocument();
	}

}
