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


public class student_nxt_ques extends HttpServlet 
{
    protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
    {

        PrintWriter pw=res.getWriter();
        res.setContentType("text/html");
        
        System.out.println("in student next question.java");
        
        String quiz_id=req.getParameter("quiz_id");
        int q_no=Integer.parseInt(req.getParameter("ques_no"));
        int weightage=Integer.parseInt(req.getParameter("weightage"));
        String user_ans=req.getParameter("ans");
        int current_mark=Integer.parseInt(req.getParameter("current_mark"));
        
        boolean msg=false;
        
        try {
			msg= MysqlCon.check_current_ans(quiz_id, q_no, user_ans);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        if(msg == true)
        {
        	current_mark = current_mark + weightage;
        }
        	q_no++;
        	String fetch = "";
        	try {
    			fetch = MysqlCon.fetch_ques(quiz_id, q_no);
    		} catch (Exception e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
        	
        	if(fetch.equals("Quiz Over"))
        	{
        		req.setAttribute("message", false);
            	req.setAttribute("wel_student", false);
    			req.setAttribute("disp_company_file_table", false);
    	        req.setAttribute("student_company_files_form", false);
    	        req.setAttribute("student_assess", false);
    	        req.setAttribute("student_attend_quiz", false);
    	        req.setAttribute("student_show_marks", true);
    	        req.setAttribute("student_perf", false);
    	        req.setAttribute("student_roll_perf", false);
    	        req.setAttribute("student_profile", false);
    	        
    	        
    	        req.setAttribute("quiz_id", quiz_id);
    	        req.setAttribute("final_marks", current_mark);
    	        

                req.getRequestDispatcher("student.jsp").forward(req, res);
        	}
        	else
        	{
        		System.out.println(fetch);
            	String temp="" ;
	   	    	ArrayList<String> ret=new ArrayList<String>() ;
	   	    	int k=0;
	   	    	String ans=fetch;
	   	    	for(int i=0;i<ans.length();i++) 
	   	    	{
	   	    		if( ans.charAt(i)=='$') 
	   	    		{
	   	    			ret.add(temp);
	   	    			

	   	    			temp="";
	   	    			
	   	    		}
	   	    		else if( ans.charAt(i)=='*') 
	   	    		{
	   	    			ret.add(temp);

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
	   	    	req.setAttribute("track_mark", current_mark);
	   	    	
	   	    	
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



