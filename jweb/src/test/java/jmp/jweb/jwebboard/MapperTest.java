package jmp.jweb.jwebboard;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import jmp.jweb.mapper.BoardMapper;
import jmp.jweb.service.BoardService;
import jmp.jweb.vo.BoardVo;
import lombok.extern.log4j.Log4j;

@Log4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class MapperTest {
	
	@Autowired
	BoardMapper mapper;
	
	@Autowired
	BoardService service;
	
	@Test
	public void listt() {
		//log.info(mapper.getList());
		log.info(service.getList());
	}
	
	@Test
	public void insertt() {
		BoardVo vo = new BoardVo();
		vo.setContent("1111111");
		vo.setTitle("1234");
		vo.setMemberid("가나다");
		
		int res = service.insert(vo);
		log.info(res);
	}
	
	@Test
	public void gett() {
		log.info(service.get(3));
	}
	
	@Test
	public void updatet() {
		BoardVo vo = new BoardVo();
		vo.setContent("ㅋㅋㅋ");
		vo.setTitle("가나다");
		vo.setMemberid("이름이여");
		log.info(service.update(vo));
	}
	
	@Test
	public void deletet() {
		service.delete(3);
	}

}
