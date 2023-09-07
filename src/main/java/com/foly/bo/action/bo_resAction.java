package com.foly.bo.action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.foly.bo.util.Action;
import com.foly.bo.util.ActionForward;


public class bo_resAction implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("M : );

				// 세션제어
				HttpSession session = request.getSession();
				String own_num = (String) session.getAttribute("own_num");
				
				ActionForward forward = new ActionForward();
				if(own_num == null ) {     
					forward.setPath("./bo/main.jsp");
					forward.setRedirect(false);
					return forward;
					
				}
				// DAO 객체 - getRestList() 
				boDAO dao = new boDAO();
				boDTO dto = dao.getRestList();
				ArrayList<boDTO> RestList = dao.getRestList();   //이 메서드는 없어서 처음에 오류 발생-> MemberDAO에 메서드 만들러가자.
																			// 메서드 만들고와서 ArrayList<MemberDTO> memberList 앞에 이거 붙여주자.
				
				// request 영역에 저장
				request.setAttribute("memberList", memberList);  
				
				// 페이지 이동      //객체 사용하여 이동해서 출력하게만들자
				forward.setPath("./member/list.jsp");
				forward.setRedirect(false);
				
				return forward;
			}	
				
				
}

	
	
	
	
	