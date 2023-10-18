package chess;

import boardgame.BoardException;

public class ChessPromotionException extends BoardException {

	private static final long serialVersionUID = 1L;
	
	public ChessPromotionException(String msg) {
		super(msg);
	}
}
