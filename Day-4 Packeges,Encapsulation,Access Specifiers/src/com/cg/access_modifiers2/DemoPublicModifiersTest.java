package com.cg.access_modifiers2;

import com.cg.access_modifiers.DemoPublicModifiers;

public class DemoPublicModifiersTest {

	public static void main(String[] args) {
		DemoPublicModifiers obj = new DemoPublicModifiers();
		obj.display(5, 70);
		
		// we cannot access private modifiers from another package
		/*DemoPublicModifiers obj = new DemoPublicModifiers();
		obj.display1(5, 70);*/

	}

}
