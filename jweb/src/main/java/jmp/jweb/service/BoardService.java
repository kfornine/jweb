package jmp.jweb.service;

import java.util.List;

import jmp.jweb.vo.BoardVo;

public interface BoardService {
	public List<BoardVo> getList();
	
	public int insert(BoardVo vo);
	
	public BoardVo get(int bnum);
	
	public int update(BoardVo vo);
	
	public int delete(int bnum);
}
