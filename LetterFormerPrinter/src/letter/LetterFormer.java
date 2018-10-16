package letter;

public class LetterFormer {

	public void formUpperLeftDiagonal(int height, char[][] chArr, char fillCharacter) {

		for (int i = 0; i * 2 < height; i++) {
			chArr[i][i] = fillCharacter;
		}

	}

	public void formUpperRightDiagonal(int height, char[][] chArr, char fillCharacter) {

		for (int i = 0; i * 2 < height; i++) {
			chArr[i][height - i - 1] = fillCharacter;
		}

	}

	public void formBottomLeftDiagonal(int height, char[][] chArr, char fillCharacter) {

		for (int i = height / 2; i < height; i++) {
			chArr[i][height - i - 1] = fillCharacter;
		}
	}

	public void formBottomRightDiagonal(int height, char[][] chArr, char fillCharacter) {

		for (int i = height / 2; i < height; i++) {
			chArr[i][i] = fillCharacter;
		}

	}

	public void formBottomMiddleVerticalLine(int height, char[][] chArr, char fillCharacter) {

		for (int i = height / 2; i < height; i++) {
			chArr[i][height / 2] = fillCharacter;
		}
	}

	public void formUpperMiddleVerticalLine(int height, char[][] chArr, char fillCharacter) {

		for (int i = 0; i < height / 2; i++) {
			chArr[i][(height / 2)] = fillCharacter;
		}
	}

	public void formUpperHorizontalLine(int height, char[][] chArr, char fillCharacter) {

		for (int i = 0; i < height; i++) {
			chArr[0][i] = fillCharacter;
		}
	}

	public void formBottomHorizontalLine(int height, char[][] chArr, char fillCharacter) {

		for (int i = 0; i < height; i++) {
			chArr[height - 1][i] = fillCharacter;
		}
	}

	public void printLines(int height, char[][] chArr) {
		String line = "";
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < height; j++) {
				line = line + chArr[i][j];
			}
			System.out.println(line);
			line = "";
		}
		
		char[] myChars = new char[5];
		for(char c : myChars) {
			
		}
		
		
	}

}
