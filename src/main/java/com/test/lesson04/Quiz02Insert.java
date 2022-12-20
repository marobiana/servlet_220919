package com.test.lesson04;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.common.MysqlService;

@WebServlet("/lesson04/quiz02_insert")
public class Quiz02Insert extends HttpServlet {

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String name = request.getParameter("name");
		String url = request.getParameter("url");
		
		MysqlService ms = MysqlService.getInstance();
		ms.connect();
		
		String insertQuery = "insert into `favorite`(`name`, `url`, `createdAt`, `updatedAt`)"
				+ "values ('" + name + "', '" + url + "', now(), now());";
		try {
			ms.update(insertQuery);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		ms.disconnect();
		
		// 목록 화면으로 이동
		response.sendRedirect("/lesson04/quiz02/quiz02.jsp");
	}
}






