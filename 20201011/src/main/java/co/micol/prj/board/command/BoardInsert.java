package co.micol.prj.board.command;

import java.sql.Date;
import java.util.Scanner;

import co.micol.prj.board.service.BoardVO;

public class BoardInsert implements Command {
	private Scanner scb = new Scanner(System.in);
	@Override
	public void execute() {
		// 게시글 등록
		BoardVO vo = new BoardVO();
		System.out.println("====================");
		System.out.println("작성자를 입력하세요?");
		vo.setBWriter(scb.nextLine());
		System.out.println("제목을 입력하세요?");
		vo.setBTitle(scb.nextLine());
		System.out.println("내용을 입력하세요?");
		vo.setBContents(scb.nextLine());
//		vo.setbWriter("이승리");
//		vo.setbWriteDate(Date.valueOf("2011-10-11"));
//		vo.setbTitle("중요 전달사항입니다.");
//		vo.setbContents("비가 오는 월요일입니다.");
		int n = dao.boardInsert(vo);
		
		if(n != 0) {
			System.out.println("정상적으로 등록 되었습니다.");
		} else {
			System.out.println("등록 실패.");
		}
	}

}
