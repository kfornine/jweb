package jmp.jweb.mapper;

import java.util.List;

import jmp.jweb.vo.BoardVo;

public interface BoardMapper {
	
	public List<BoardVo> getList();
	
	public int insert(BoardVo vo);
	
	public BoardVo get(int bnum);
	
	public int update(BoardVo vo);
	
	public int delete(int bnum);
	
}
