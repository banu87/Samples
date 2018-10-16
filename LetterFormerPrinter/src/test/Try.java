package test;

import letter.Letter;
import letter.LetterX;
import letter.LetterY;
import letter.LetterZ;

public class Try {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Letter myX = new LetterX(3);
		myX.initializeWithHeight();
		myX.formWithHeight();
		myX.printOut();
		
		System.out.println();
		
		Letter myY = new LetterY(5);
		myY.initializeWithHeight();
		myY.formWithHeight();
		myY.printOut();
		
		System.out.println();
		
		Letter myZ = new LetterZ(11);
		myZ.initializeWithHeight();
		myZ.formWithHeight();
		myZ.printOut();
		
	}

}
