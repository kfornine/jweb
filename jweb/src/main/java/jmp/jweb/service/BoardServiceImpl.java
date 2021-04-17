package jmp.jweb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jmp.jweb.mapper.BoardMapper;
import jmp.jweb.vo.BoardVo;

@Service
public class BoardServiceImpl implements BoardService{

	@Autowired
	BoardMapper mapper;
	
	@Override
	public List<BoardVo> getList() {
		// TODO Auto-generated method stub
		return mapper.getList();
	}

	@Override
	public int insert(BoardVo vo) {
		// TODO Auto-generated method stub
		return mapper.insert(vo);
	}

	@Override
	public BoardVo get(int bnum) {
		// TODO Auto-generated method stub
		return mapper.get(bnum);
	}

	@Override
	public int update(BoardVo vo) {
		// TODO Auto-generated method stub
		return mapper.update(vo);
	}

	@Override
	public int delete(int bnum) {
		// TODO Auto-generated method stub
		return mapper.delete(bnum);
	}

}
