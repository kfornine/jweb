package jmp.jweb.service;

import java.util.List;

import jmp.jweb.vo.Criteria;
import jmp.jweb.vo.ReplyVo;



public interface ReplyService {
	
	public int insert(ReplyVo vo);
	public int update(ReplyVo vo);
	public int delete(int rnum);
	public ReplyVo get(int rnum);
	public List<ReplyVo> getList(int bnum, Criteria cri);
	public int getTotal(int bnum);


}
