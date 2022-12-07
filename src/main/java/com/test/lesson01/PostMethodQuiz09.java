package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/lesson01/quiz09")
public class PostMethodQuiz09 extends HttpServlet {
	
	private final Map<String, String> userMap =  new HashMap<String, String>() {
	    {
	        put("id", "marobiana");
	        put("password", "qwerty1234");
	        put("name", "신보람");
	    }
	};

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response	) throws IOException { 
		response.setContentType("text/html");
		
		// request parameter 꺼내기
		String name = request.getParameter("name");
		String introduction = request.getParameter("introduction");
		
		// 결과 뿌리기(태그)
		PrintWriter out = response.getWriter();
		out.print("<b>" + name + "</b>님의 지원이 완료 되었습니다.");
		out.print("<h2>지원 내용</h2>");
		out.print(introduction);
	}
}




