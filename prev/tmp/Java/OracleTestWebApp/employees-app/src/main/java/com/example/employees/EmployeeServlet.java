package com.example.employees;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * The @WebServlet annotation is used to declare a servlet instead of using XML in the web deployment descriptor (web.xml) .
 * The annotation is processed by the container at deployment time.
 */
@WebServlet(
		name = "EmployeeServlet",
		urlPatterns = {"/employee"}
)
public class EmployeeServlet extends HttpServlet {

	EmployeeService employeeService = new EmployeeService();

	/**
	 *
	 * The doGet is used to process the HTTP GET request.
	 * In this case is implemented to process three kinds of searches:
	 * by Id, by Name and by default the complete list of employees.
	 ***********************************************************************
	 * The searchAction parameter is used to determine what kind of search it will be executed.
	 *
	 ***********************************************************************
	 * The forwardListEmployees method is a helper method to dispatch the employee list to list-employees.jsp.
	 * It is in a separate method because the code is re-used in other operations.
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String action = req.getParameter("searchAction");
		if (action!=null){
			switch (action) {
				case "searchById":
					searchEmployeeById(req, resp);
					break;
				case "searchByName":
					searchEmployeeByName(req, resp);
					break;
			}
		}else{
			List<Employee> result = employeeService.getAllEmployees();
			forwardListEmployees(req, resp, result);
		}
	}

	private void searchEmployeeById(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		long idEmployee = Integer.valueOf(req.getParameter("idEmployee"));
		Employee employee = null;
		try {
			employee = employeeService.getEmployee(idEmployee);
		} catch (Exception ex) {
			Logger.getLogger(EmployeeServlet.class.getName()).log(Level.SEVERE, null, ex);
		}
		req.setAttribute("employee", employee);
		req.setAttribute("action", "edit");
		String nextJSP = "/jsp/new-employee.jsp";
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
		dispatcher.forward(req, resp);
	}

	private void searchEmployeeByName(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String employeeName = req.getParameter("employeeName");
		List<Employee> result = employeeService.searchEmployeesByName(employeeName);
		forwardListEmployees(req, resp, result);
	}

	private void forwardListEmployees(HttpServletRequest req, HttpServletResponse resp, List employeeList)
			throws ServletException, IOException {
		String nextJSP = "/jsp/list-employees.jsp";
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
		req.setAttribute("employeeList", employeeList);
		dispatcher.forward(req, resp);
	}


}