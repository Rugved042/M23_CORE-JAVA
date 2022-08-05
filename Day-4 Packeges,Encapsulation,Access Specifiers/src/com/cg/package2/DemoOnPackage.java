package com.cg.package2;

// for choose all classes from specific package we use (*) symbol
//import com.cg.package1.*;

//for choose specific class from specific package we us name of class and package
import com.cg.package1.Package;
public class DemoOnPackage {

	public static void main(String[] args) {
		Package p=new Package();
		p.display(11,"Rugved");

	}

}
