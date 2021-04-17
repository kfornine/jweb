package jmp.jweb.vo;

import lombok.Data;

@Data
public class BoardVo {

	int bnum; //번호
	String title; //제목
	String content; //내용
	String regdate; //작성일
	String memberid; //작성자
	int hit;

}
