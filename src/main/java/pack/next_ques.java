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


public class next_ques extends HttpServlet
{
    protected void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
    {

        PrintWriter pw=res.getWriter();
        res.setContentType("text/html");
        
        System.out.println("in next_ques.java");
        System.out.println(req.getParameter("fac_roll"));
        System.out.println(req.getParameter("question"));
        
        String quiz_title=req.getParameter("quiz_title");
        String f_id=req.getParameter("fac_roll");
        String quiz_id=req.getParameter("unique_id");
        int question_no=Integer.valueOf(req.getParameter("question_no"));
        String question=req.getParameter("question");
        String opt_1=req.getParameter("opt_1");
        String opt_2=req.getParameter("opt_2");
        String opt_3=req.getParameter("opt_3");
        String opt_4=req.getParameter("opt_4");
        String answer=req.getParameter("answer");
        int weightage=Integer.valueOf(req.getParameter("weightage"));
        
        
      
        
        try {
			MysqlCon.add_question(quiz_id, question_no, question, opt_1, opt_2, opt_3, opt_4, answer, f_id, weightage );
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        req.setAttribute("quiztitle",quiz_title );
        req.setAttribute("fac_roll",f_id );
        req.setAttribute("quizid",quiz_id );
        req.setAttribute("question_no", (question_no+1) );
        
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



