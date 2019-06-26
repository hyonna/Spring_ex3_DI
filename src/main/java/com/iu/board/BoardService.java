package com.iu.board;


//@Service
////new BoardService
public class BoardService {
	
	private BoardDAO boardDAO;

	public void setBoardDAO(BoardDAO boardDAO) {
		this.boardDAO = boardDAO;
	}
	
	public void insert() throws Exception {
		
		System.out.println("Board Service");
		boardDAO.insert();
	}

}
