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


public class student_performance extends HttpServlet
{
    protected void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
    {

        PrintWriter pw=res.getWriter();
        res.setContentType("text/html");
        
        System.out.println("in student performance.java");
        
        String roll_no = req.getParameter("roll_no");
        String answer = "";
        try {
        	answer = MysqlCon.student_view_mark(roll_no);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        System.out.println(answer);
        String temp="" ;
  	    	ArrayList<String> ret=new ArrayList<String>() ;
  	    	int k=0;
  	    	String ans = answer;
  	    	for(int i=0;i<ans.length();i++) 
  	    	{
  	    		if( ans.charAt(i)=='$') 
  	    		{
  	    			ret.add(temp);
  	    			
//   	    			System.out.println(temp);
  	    			temp="";
  	    			
  	    		}
  	    		else if( ans.charAt(i)==' ') 
  	    		{
  	    			ret.add(temp);
//   	    			System.out.println(temp);
  	    			temp="";
  	    			k++;
  	    		}
  	    		else 
  	    		{
  	    			temp=temp+ans.charAt(i);
  	    		}
  	    	}
  	
        
        req.setAttribute("message", false);
        req.setAttribute("wel_student", false);
			req.setAttribute("disp_company_file_table", false);
	        req.setAttribute("student_company_files_form", false);
	        req.setAttribute("student_assess", false);
	        req.setAttribute("student_attend_quiz", false);
	        req.setAttribute("student_show_marks", false);
	        
	        req.setAttribute("student_perf", true);
	        req.setAttribute("student_roll_perf", false);
	        req.setAttribute("student_profile", false);
	        req.setAttribute("ret", ret);

	        

	        
        req.getRequestDispatcher("student.jsp").forward(req, res);
        
        pw.close();
    }
}



