package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UrlMappingQuiz01 extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// 한글 깨짐 방지 (utf-8, plain content type)
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/plain");
		
		// 날짜 객체
		Date now = new Date();
		
		// 출력 오늘의 날짜는 2021년 5월 20일
		SimpleDateFormat sdf = new SimpleDateFormat("오늘의 날짜는 yyyy년 M월 d일");
		PrintWriter out = response.getWriter();
		out.println(sdf.format(now));
	}
}



