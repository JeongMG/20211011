package co.micol.prj.board.command;

import java.util.Scanner;

//import co.micol.prj.board.service.BoardService;
//import co.micol.prj.board.serviceImpl.BoardServiceImpl;
import co.micol.prj.board.service.BoardVO;

public class BoardSelect implements Command {
	private Scanner scb = new Scanner(System.in);
	@Override
	public void execute() {
		BoardVO board = new BoardVO();
		System.out.println("======================");
		System.out.println("조회할 글 번호를 입력하세요.");
		board.setBId(scb.nextInt());
		board = dao.boardSelect(board);
//		board.setbId(2); // 1번 글 가져오기
//		board = dao.boardSelect(board);
		System.out.println("번 호 : " + board.getBId());
		System.out.println("작성자 : " + board.getBWriter());
		System.out.println("작성일 : " + board.getBWriteDate());
		System.out.println("제 목 : " + board.getBTitle());
		System.out.println("내 용 : " + board.getBContents());
		System.out.println("조회수 : " + board.getBHit());
	}

}
