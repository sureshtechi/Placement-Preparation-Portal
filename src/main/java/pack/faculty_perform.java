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


public class faculty_perform extends HttpServlet
{
    protected void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
    {

        PrintWriter pw=res.getWriter();
        res.setContentType("text/html");
        
        System.out.println("in create batch.java");
        
        
        req.setAttribute("message", false);
        req.setAttribute("fac_home", false);
	        req.setAttribute("fac_create_assess", false);
	      req.setAttribute("add_question",false );
	    req.setAttribute("fac_course_table",false );
	  req.setAttribute("crud_fac_course",false );
//	        req.setAttribute("create_batch", false);
	  req.setAttribute("faculty_perform", true);
	       req.setAttribute("faculty_file", false);
	        req.setAttribute("faculty_prof",false );
        
       
        req.getRequestDispatcher("faculty.jsp").forward(req, res);
        
        pw.close();
    }
}



