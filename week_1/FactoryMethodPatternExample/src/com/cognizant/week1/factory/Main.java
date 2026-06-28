package com.cognizant.week1.factory;

public class Main {
	public static void main(String[] args) {
		
		DocumentFactory WF = new WordDocumentFactory();
		Document w = WF.createDocument();
		w.open();
		
		DocumentFactory PD = new PdfDocumentFactory();
		Document p = PD.createDocument();
		p.open();
		
		DocumentFactory Ex = new ExcelDocumentFactory();
		Document E = Ex.createDocument();
		E.open();
	}

}
