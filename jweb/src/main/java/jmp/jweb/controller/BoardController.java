package jmp.jweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import jmp.jweb.service.BoardService;
import jmp.jweb.vo.BoardVo;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
public class BoardController {
	
	@Autowired
	BoardService service;
	
	//전체리스트
	@GetMapping("/board/list")
	public void list(Model model) {
		model.addAttribute("list", service.getList());
		
		log.info("getList();===================");
	}
	
	//등록페이지
	@GetMapping("/board/register")
	public void register() {
		
	}
	
	//등록페이지
	@PostMapping("/board/register")
	public String registerExe(BoardVo vo, RedirectAttributes rttr) {
		
		service.insert(vo);
		
		rttr.addFlashAttribute("resMsg", vo.getBnum()+"번 게시글이 작성되었습니다");
		
		return "redirect:/board/list";
	}
	
	//상세정보조회
	@GetMapping({"/board/get","/board/edit"})
	public void get(BoardVo vo, Model model) {
		
		vo = service.get(vo.getBnum());
		
		model.addAttribute("vo", vo);
	}

	//에딛
	@PostMapping("/board/edit")
	public String editExe(BoardVo vo, RedirectAttributes rttr) {
		
		int res = service.update(vo);
		String resMsg="";
		
		if(res>0) {
			resMsg = "수정됨";
		}else {
			resMsg = "수정실패됨";
		}
		rttr.addAttribute("bnum", vo.getBnum());
		rttr.addFlashAttribute("resMsg", resMsg);
		return "redirect:/board/get";
	}
	
	//삭제
	@GetMapping("/board/delete")
	public String delete(BoardVo vo, RedirectAttributes rttr) {
		int res = service.delete(vo.getBnum());
		String resMsg="";
		
		if(res>0) {
			//리스트
			resMsg = vo.getBnum()+"번 게시글이 삭제되었습니다";
			rttr.addFlashAttribute("resMsg",resMsg);
			return "redirect:/board/list";
		}else {
			//상세화면
			resMsg = "게시글이 삭제되지못했습니다";
			rttr.addAttribute("bnum", vo.getBnum());
			rttr.addFlashAttribute("resMsg",resMsg);
			return "redirect:/board/get";
		}
	}
	
}
