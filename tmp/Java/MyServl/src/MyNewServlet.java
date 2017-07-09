import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class MyNewServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");

		PrintWriter out = resp.getWriter();
		String message = "If you read this, the servlet is working";

		out.println("<HTML><head>\n" +
				"  <meta charset=\"utf-8\">\n" +
				"  <title>Bootstrap уроки</title>\n" +
				"\n" +
				"  <!---viewport - если мы откроем сайт на смартфоне, он увеличился, адаптивные контроллеры -->\n" +
				"  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n" +
				"\t <!-- Latest compiled and minified CSS -->\n" +
				"\t<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\" \n" +
				"\tintegrity=\"sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u\" crossorigin=\"anonymous\">\n" +
				"\n" +
				"\t<!-- Optional theme -->\n" +
				"\t<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css\" \n" +
				"\tintegrity=\"sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp\" crossorigin=\"anonymous\">\n" +
				"\n" +
				"\t<!-- Latest compiled and minified JavaScript -->\n" +
				"\t<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\" \n" +
				"\tintegrity=\"sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa\" crossorigin=\"anonymous\"></script>\n" +
				"</head><BODY>");
		out.println(" <div class=\"container\"><H1>" + message + "</H1> <p>How about a cup of coffee?</p></div>");
		out.println("  <div class=\"row\">\n" +
				"  \t<div class=\"col-xs-12 col-sm-9 col-md-4 col-lg-6\" style=\"background-color: #00CCFF\">First</div>\n" +
				"    <div class=\"col-xs-12 col-sm-3 col-md-8 col-lg-6\" style=\"background-color: #CC00FF\">Second</div>\n" +
				"  </div>");
		out.println("</BODY></HTML>");
		out.close();
	}
}
