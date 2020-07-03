package com.simple.dao;

import java.util.ArrayList;


import org.springframework.stereotype.Repository;

import com.simple.command.BoardVO;

@Repository("boardDao")
public class BoardDAOImpl implements BoardDAO{
	
	
	ArrayList<BoardVO> DB = new ArrayList<>();

	@Override
	public void boardRegist(BoardVO vo) {
	
		DB.add(vo);
		
	}

	@Override
	public ArrayList<BoardVO> getList() {
		
		return DB;
	}

	@Override
	public void boardDelete(int num) {
		
		DB.remove(num);
	}

}