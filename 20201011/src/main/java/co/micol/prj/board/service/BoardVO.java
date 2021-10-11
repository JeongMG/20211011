package co.micol.prj.board.service;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor // 디폴트 생성자
@Setter
@Getter

public class BoardVO {
	private int bId;
	private String bWriter;
	private Date bWriteDate;
	private String bTitle;
	private String bContents;
	private int bHit;
	
//	public BoardVO() {
//		
//	}
//
//	public int getbId() {
//		return bId;
//	}
//
//	public void setbId(int bId) {
//		this.bId = bId;
//	}
//
//	public String getbWriter() {
//		return bWriter;
//	}
//
//	public void setbWriter(String bWriter) {
//		this.bWriter = bWriter;
//	}
//
//	public Date getbWriteDate() {
//		return bWriteDate;
//	}
//
//	public void setbWriteDate(Date bWriteDate) {
//		this.bWriteDate = bWriteDate;
//	}
//
//	public String getbTitle() {
//		return bTitle;
//	}
//
//	public void setbTitle(String bTitle) {
//		this.bTitle = bTitle;
//	}
//
//	public String getbContents() {
//		return bContents;
//	}
//
//	public void setbContents(String bContents) {
//		this.bContents = bContents;
//	}
//
//	public int getbHit() {
//		return bHit;
//	}
//
//	public void setbHit(int bHit) {
//		this.bHit = bHit;
//	}
}
