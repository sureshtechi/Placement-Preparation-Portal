package pack;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pack.MysqlCon;


public class student_home extends HttpServlet
{
    protected void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
    {

        PrintWriter pw=res.getWriter();
        res.setContentType("text/html");
        
        System.out.println("in student home.java");
        
        req.setAttribute("message", false);
        req.setAttribute("wel_student", true);
			req.setAttribute("disp_company_file_table", false);
	        req.setAttribute("student_company_files_form", false);
	        req.setAttribute("student_assess", false);
	        req.setAttribute("student_attend_quiz", false);
	        req.setAttribute("student_show_marks", false);
	        req.setAttribute("student_perf", false);
	        req.setAttribute("student_roll_perf", false);
	        req.setAttribute("student_profile", false);
	        
        req.getRequestDispatcher("student.jsp").forward(req, res);
        
        pw.close();
    }
}



