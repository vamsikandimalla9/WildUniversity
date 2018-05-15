package com.example.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.bean.Student;
import com.example.dao.StudentDAO;

/**
 * Servlet implementation class ControllerServlet
 */
@WebServlet("/ControllerServlet")
public class ControllerServlet extends HttpServlet {

	StudentDAO dao = new StudentDAO();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// 1. Read uno, name, gender from Request parameter
		String uno = request.getParameter("uno");
		String name = request.getParameter("name");

		// 2. Create a student object
		Student student = new Student(uno, name);

		// 3. StudentDAO is called to store the student data
		List<Student> studList = dao.addStudent(student);

		// added student list in request scope
		// request.setAttribute("StudentList", studList);

		request.setAttribute("StudentList", studList);
		/*RequestDispatcher view = request.getRequestDispatcher("list.jsp");
		view.forward(request, response);
*/
		
		  ServletContext context = getServletContext();
		  context.setAttribute("StudentList", studList);
		 
		 response.sendRedirect("list.jsp");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
