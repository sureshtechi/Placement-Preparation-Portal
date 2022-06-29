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


public class add_question extends HttpServlet
{
    protected void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
    {

        PrintWriter pw=res.getWriter();
        res.setContentType("text/html");
        
        System.out.println("in create batch.java");
        
        String quiz_id=req.getParameter("unique_id");
        String quiz_title=req.getParameter("quiz_title");
        String fac_roll=req.getParameter("fac_roll");
        
        System.out.println(quiz_id);

        System.out.println(quiz_title);
        
        System.out.println(fac_roll);
        
        req.setAttribute("quizid", quiz_id);
        req.setAttribute("quiztitle", quiz_title);
        req.setAttribute("question_no", 1);
        req.setAttribute("fac_roll", fac_roll);
        
        req.setAttribute("message", false);
        req.setAttribute("fac_home", false);
	        req.setAttribute("fac_create_assess", false);
	      req.setAttribute("add_question",true );
	    req.setAttribute("fac_course_table",false );
	  req.setAttribute("crud_fac_course",false );
//	        req.setAttribute("create_batch", false);
	       req.setAttribute("faculty_perform", false);
	       req.setAttribute("faculty_file", false);
	        req.setAttribute("faculty_prof",false );
	        
        
        req.getRequestDispatcher("faculty.jsp").forward(req, res);
        
        pw.close();
    }
}



