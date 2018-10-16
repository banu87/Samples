package letter;

public abstract class Letter {

	private int height;
	private char[][] chArr;

	public Letter(int height) {
		super();
		this.height = height;
	}

	public char[][] getChArr() {
		return chArr;
	}

	public void setChArr(char[][] chArr) {
		this.chArr = chArr;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void initializeWithHeight() {
		chArr = new char[height][height];
		for (int i = 0; i < height; i++) {
			for (int j = 0; i < height; i++) {
				chArr[i][j] = ' ';
			}
		}
	}

	public abstract void formWithHeight();
	public abstract void printOut();

}
