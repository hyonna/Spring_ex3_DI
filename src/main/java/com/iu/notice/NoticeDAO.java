package com.iu.notice;

import javax.inject.Inject;

import org.springframework.stereotype.Repository;

import com.iu.util.DBConnector;

@Repository
public class NoticeDAO {
	
	@Inject
	//만들어진 클래스의 객체를 여기다가 넣는 다는 뜻
	private DBConnector dbConnector;
	
	public void insert() throws Exception {
		
		System.out.println(dbConnector);
		System.out.println("Notice DAO");
	}

}
