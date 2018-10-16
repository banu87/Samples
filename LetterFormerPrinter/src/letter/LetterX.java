package letter;

public class LetterX extends Letter {

	public LetterX(int height) {
		super(height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void formWithHeight() {
		// TODO Auto-generated method stub
		LetterFormer letterForm = new LetterFormer();
		letterForm.formUpperLeftDiagonal(this.getHeight(), this.getChArr(), '*');
		letterForm.formUpperRightDiagonal(this.getHeight(), this.getChArr(), '*');
		letterForm.formBottomLeftDiagonal(this.getHeight(), this.getChArr(), '*');
		letterForm.formBottomRightDiagonal(this.getHeight(), this.getChArr(), '*');
	}

	@Override
	public void printOut() {
		// TODO Auto-generated method stub
		LetterFormer letterFormer = new LetterFormer();
		letterFormer.printLines(this.getHeight(), this.getChArr());
		
	}

}
