package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	/*
	 * Do no create Position constructor because piece postion is considered as null 
	 */
	public Piece(Board board) {
		this.board = board;
		position = null;
		
	}

	protected Board getBoard() {
		return board;
	}
	/*
	 * Comment because is not allow remove tha board
	 */
//	public void setBoard(Board board) {
//		this.board = board;
//	}
	
	
	
}
