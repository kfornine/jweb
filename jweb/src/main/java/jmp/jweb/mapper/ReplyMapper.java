package jmp.jweb.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import jmp.jweb.vo.Criteria;
import jmp.jweb.vo.ReplyVo;



public interface ReplyMapper {
	
	public int insert(ReplyVo vo);
	public int update(ReplyVo vo);
	public int delete(int rnum);
	public ReplyVo get(int rnum);
	public List<ReplyVo> getList(@Param("bnum") int bnum,
								 @Param("cri") Criteria cri);//파람이 여러개일경우 이름을 넣어줌
	public int getTotal(int bnum);

}
