package com.foly;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.util.Action;
import com.util.ActionForward;

/**
 *  컨트롤러의 동작수행 : model(java)-view(jsp) 연결
 *  
 *  실행 : http://localhost:8088/JspMVC6/member
 *  실행 : http://localhost:8088/JspMVC6/*.me
 *  실행 : http://localhost:8088/JspMVC6/ITWILL.me
 *  실행 : http://localhost:8088/JspMVC6/안녕.me
 *  
 */
public class FrontController extends HttpServlet{
	
	
	protected void doProcess(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		System.out.println(" C : MemberFrontController-doProcess() 호출");
		System.out.println(" C : GET/POST 방식 상관없이 모든주소 처리 ");
		
		/*********************1. 가상주소 계산***************************/
		System.out.println("\n C : 1. 가상주소 계산 - 시작");
		//  가상주소  http://localhost:8088/JspMVC6/ITWILL.me
		// 주소정보(URI)
		String requestURI = request.getRequestURI();		
		System.out.println(" requestURI : "+requestURI);
		// 프로젝트명
		String CTXPath = request.getContextPath();
		System.out.println(" CTXPath : "+CTXPath);
		// 계산된 가상주소 ( URI - 프로젝트명 )
		String command = requestURI.substring(CTXPath.length());
		System.out.println(" command : "+command);	                   
		System.out.println(" C : 1. 가상주소 계산 - 끝");		
		/*********************1. 가상주소 계산***************************/
				
		/*********************2. 가상주소 매핑***************************/
		System.out.println("\n C : 2. 가상주소 매핑 - 시작");
		Action action = null;
		ActionForward forward = null;
		// 회원가입 - 패턴1 => DB안쓰고 화면이동
		if(command.equals("/Service.re")) {
			System.out.println(" C : /Service.re 매핑");
			System.out.println(" C : 패턴1 - DB사용X, 화면 이동 ");
			
			forward = new ActionForward();
			forward.setPath("./service/Service.jsp");
			forward.setRedirect(false);			// MVC 이동방식
		}	
		else if(command.equals("/cartService.re")) {
			
			System.out.println(" C : /cartService.re 호출 ");
			System.out.println(" C : 패턴1 - 디비사용X, 화면이동 ");
			
			forward = new ActionForward();
			forward.setPath("./service/cartService.jsp");   
			forward.setRedirect(false); 
			
		}
		else if(command.equals("/goReservation.re")) {
		
			System.out.println(" C : /goReservation.re 호출 ");
			System.out.println(" C : 패턴1 - 디비사용X, 화면이동 ");
			
			forward = new ActionForward();
			forward.setPath("./service/goReservation.jsp");   
			forward.setRedirect(false); 
			
		}
		else if(command.equals("/goRestaurant.re")) {
			
			System.out.println(" C : /goRestaurant.re 호출 ");
			System.out.println(" C : 패턴1 - 디비사용X, 화면이동 ");
			
			forward = new ActionForward();
			forward.setPath("./service/goRestaurant.jsp");   
			forward.setRedirect(false); 
			
		}
		
		
		else if(command.equals("/pickUp.re")) {
			// 로그인 처리
			System.out.println(" C : /pickUp.re 호출 ");
			System.out.println(" C : 패턴1 - 디비사용X, 화면이동 ");
			
			forward = new ActionForward();
			forward.setPath("./service/pickUp.jsp");   
			forward.setRedirect(false); 
			
		}
		
		else if(command.equals("/goPay.re")) {
			// 로그인 처리
			System.out.println(" C : /goPay.re 호출 ");
			System.out.println(" C : 패턴1 - 디비사용X, 화면이동 ");
			
			forward = new ActionForward();
			forward.setPath("./service/goPay.jsp");   
			forward.setRedirect(false); 
			
		}
		
		
		System.out.println(" C : 2. 가상주소 매핑 - 끝");
		/*********************2. 가상주소 매핑***************************/
		
		
		
		
		
		
		/*********************3. 가상주소 이동***************************/
		System.out.println("\n C : 3. 가상주소 이동 - 시작");
		
		if(forward != null) {
			if(forward.isRedirect()) {
				System.out.println(" C : "+forward.getPath()
				                    +"주소로 방식:"+forward.isRedirect());
				
				response.sendRedirect(forward.getPath());
			}else {
				System.out.println(" C : "+forward.getPath()
								+"주소로 방식:"+forward.isRedirect());
				
				RequestDispatcher dis = 
						request.getRequestDispatcher(forward.getPath());
				dis.forward(request, response);				
			}		
			
		}	
		
		System.out.println(" C : 3. 가상주소 이동 - 끝");
		/*********************3. 가상주소 이동***************************/
		System.out.println("\n\n ------------컨트롤러 끝--------------");
	}// doProcess	

	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		System.out.println("\n\n ------------컨트롤러 시작--------------");
		System.out.println(" C : MemberFrontController-doGet() 호출");
		doProcess(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		System.out.println("\n\n ------------컨트롤러 시작--------------");
		System.out.println(" C : MemberFrontController-doPost() 호출");
		doProcess(request, response);		
	}

}