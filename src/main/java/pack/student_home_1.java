package pack;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pack.MysqlCon;


public class student_home_1 extends HttpServlet 
{
    protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
    {

        PrintWriter pw=res.getWriter();
        res.setContentType("text/html");
        
        System.out.println("in student home 1.java");
        
        String quiz_id=req.getParameter("quiz_id");
        int final_marks=Integer.parseInt(req.getParameter("final_marks"));
        
        String student_roll=req.getParameter("student_roll");
        
        
        try {
			MysqlCon.update_student_mark(quiz_id, final_marks, student_roll );
		} 
        catch (Exception e) 
        {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
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



