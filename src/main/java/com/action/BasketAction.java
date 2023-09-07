package com.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.foly.db.DAO;
import com.foly.db.DTO;
import com.util.Action;
import com.util.ActionForward;

public class BasketAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println(" C : BoardWriteAction_execute() 실행 "); //컨트롤러에서 얘들을 불러줘야함 다시컨트롤러로
		
		// 한글 처리(생략)->web.xml 한글처리 필터
		// (BoardDAO,DTO복붙해오기)
		
		// 글정보 저장 => DTO 
		DTO dto = new DTO();
		
		dto.setUser_num(Integer.parseInt(request.getParameter("user_num")));
		dto.setBo_value(Integer.parseInt(request.getParameter("bo_value")));
		dto.setBo_num(Integer.parseInt(request.getParameter("bo_num")));
		dto.setBo_date(request.getParameter("bo_date"));
		dto.setBo_per(Integer.parseInt(request.getParameter("bo_per")));
		dto.setPk_num(Integer.parseInt(request.getParameter("pk_num")));
		dto.setBo_state(Integer.parseInt(request.getParameter("bo_state")));
		dto.
		
		// IP주소 저장
		dto.setIp(request.getRemoteAddr());
		
		System.out.println(" M : "+dto);
		
		// DB연결 -> DAO 객체 - 글쓰기 메서드
		DAO dao = new DAO();   //DAO 객체 생성
		dao.insertBoard(dto); 
		
		// 페이지 이동
		ActionForward forward = new ActionForward();
		forward.setPath("./BoardList.bo"); 
		forward.setRedirect(true);
		
		return forward;
	}

}
