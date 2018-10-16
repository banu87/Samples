package letter;

public class LetterZ extends Letter {

	public LetterZ(int height) {
		super(height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void formWithHeight() {
		// TODO Auto-generated method stub
		LetterFormer letterFormer = new LetterFormer();
		letterFormer.formUpperHorizontalLine(this.getHeight(), this.getChArr(), '*');
		letterFormer.formUpperRightDiagonal(this.getHeight(), this.getChArr(), '*');
		letterFormer.formBottomLeftDiagonal(this.getHeight(), this.getChArr(), '*');
		letterFormer.formBottomHorizontalLine(this.getHeight(), this.getChArr(), '*');

	}

	@Override
	public void printOut() {
		// TODO Auto-generated method stub
		LetterFormer letterFormer = new LetterFormer();
		letterFormer.printLines(this.getHeight(), this.getChArr());

	}

}
