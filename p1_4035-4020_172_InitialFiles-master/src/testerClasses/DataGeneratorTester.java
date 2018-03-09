package testerClasses;

import dataGenerator.DataGenerator;

//n = # of companies
//m = # of crimes

public class DataGeneratorTester {

	public static void main(String[] args) {
		int totalSize = 2000; 
		int n = 20, m = 10; //n = # of companies, m = # of crimes
		DataGenerator dg = new DataGenerator(n, m, totalSize);
		dg.generateData(); 
		dg.printSizes();
		dg.printSets();
	}

}
