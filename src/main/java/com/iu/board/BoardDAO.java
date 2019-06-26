package com.iu.board;


import com.iu.util.DBConnector;

//@Repository
//저장소
//new BoardDAO
public class BoardDAO {
	
	private DBConnector dbConnector;
	
	public BoardDAO(DBConnector dbConnector) {
		
		this.dbConnector = dbConnector;
		
	}
	
	public void insert() throws Exception{
		
		System.out.println("DAO Insert");
		System.out.println(dbConnector.getConnect());
	}

}
