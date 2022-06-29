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


public class student_enter_quizid extends HttpServlet 
{
    protected void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
    {

        PrintWriter pw=res.getWriter();
        res.setContentType("text/html");
        
        System.out.println("in student enter quizid.java");
        
        String quiz_id=req.getParameter("quiz_id");
        
        String msg="";
        
        try {
			msg= MysqlCon.check_quizid(quiz_id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        System.out.println(msg);        
        if(msg.equals("Quiz doesn't exist or Invalid Quiz ID"))
        {
        	req.setAttribute("message", true);
        	req.setAttribute("error_message", msg);

        	req.setAttribute("wel_student", false);
			req.setAttribute("disp_company_file_table", false);
	        req.setAttribute("student_company_files_form", false);
	        req.setAttribute("student_assess", true);
	        req.setAttribute("student_attend_quiz", false);
	        req.setAttribute("student_show_marks", false);
	        req.setAttribute("student_perf", false);
	        req.setAttribute("student_roll_perf", false);
	        req.setAttribute("student_profile", false);

            req.getRequestDispatcher("student.jsp").forward(req, res);
        	
        }
        else 
        {
        	String temp="" ;
	   	    	ArrayList<String> ret=new ArrayList<String>() ;
	   	    	int k=0;
	   	    	String ans=msg;
	   	    	for(int i=0;i<ans.length();i++) 
	   	    	{
	   	    		if( ans.charAt(i)=='$') 
	   	    		{
	   	    			ret.add(temp);
	   	    			
	//   	    			System.out.println(temp);
	   	    			temp="";
	   	    			
	   	    		}
	   	    		else if( ans.charAt(i)=='*') 
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
	   	    	
	   	    	System.out.println(ret.get(0)) ;
	   	    	
	   	    	
	   	    	req.setAttribute("quiz_id", ret.get(0));
	   	    	req.setAttribute("weightage", ret.get(8));
	   	    	req.setAttribute("ques_no", ret.get(1));
	   	    	req.setAttribute("question", ret.get(2));
	   	    	req.setAttribute("option_1", ret.get(3));
	   	    	req.setAttribute("option_2", ret.get(4));
	   	    	req.setAttribute("option_3", ret.get(5));
	   	    	req.setAttribute("option_4", ret.get(6));
	   	    	req.setAttribute("track_mark", 0);
	   	    	
	   	    	
        	req.setAttribute("message", false);
            req.setAttribute("wel_student", false);
			req.setAttribute("disp_company_file_table", false);
	        req.setAttribute("student_company_files_form", false);
	        req.setAttribute("student_assess", false);
	        req.setAttribute("student_attend_quiz", true);
	        req.setAttribute("student_show_marks", false);
	        req.setAttribute("student_perf", false);
	        req.setAttribute("student_roll_perf", false);
	        req.setAttribute("student_profile", false);
	        

            req.getRequestDispatcher("student.jsp").forward(req, res);
        }

        
        	
        
        pw.close();
    }
}



