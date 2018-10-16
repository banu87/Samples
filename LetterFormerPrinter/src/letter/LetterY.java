package letter;

public class LetterY extends Letter {

	public LetterY(int height) {
		super(height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void formWithHeight() {
		// TODO Auto-generated method stub
		LetterFormer letterFormer = new LetterFormer();
		letterFormer.formUpperLeftDiagonal(this.getHeight(), this.getChArr(), '*');
		letterFormer.formUpperRightDiagonal(this.getHeight(), this.getChArr(), '*');
		letterFormer.formBottomMiddleVerticalLine(this.getHeight(), this.getChArr(), '*');
	}

	@Override
	public void printOut() {
		// TODO Auto-generated method stub
		LetterFormer letterFormer = new LetterFormer();
		letterFormer.printLines(this.getHeight(), this.getChArr());

	}

}
