

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


public class login extends HttpServlet
{
    protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
    {

        PrintWriter pw=res.getWriter();
        res.setContentType("text/html");
        
        System.out.println("in login.java");
        
        
        String user=req.getParameter("username");
        String pass=req.getParameter("password");
        String role=req.getParameter("role");
        
        System.out.println(user);
        System.out.println(pass);
        System.out.println(role);
        
        try 
        {
			String exists = MysqlCon.check_logincred(user, pass, role);
//			System.out.println("Return Result : "+exists);
        	if ( (exists.equals("admin"))||(exists.equals("student"))||(exists.equals("faculty")) ) 
        	{
         		if(exists.equals("admin"))
        		{
         			req.setAttribute("their_id", user);
         			req.setAttribute("message", false);
         			req.setAttribute("wel_block", true);
         	        req.setAttribute("crud_company", false);
         	        req.setAttribute("company_table", false);
         	        req.setAttribute("company_file", false);
    		        req.getRequestDispatcher("admin.jsp").forward(req, res);
        		}
         		else if(exists.equals("student"))
         		{
         			req.setAttribute("their_id", user);
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
         		}
         		else
         		{
         			req.setAttribute("their_id", user);
         			
         			req.setAttribute("message", false);
         			 req.setAttribute("fac_home", true);
         		        req.setAttribute("fac_create_assess", false);
         		      req.setAttribute("add_question",false );
         		    req.setAttribute("fac_course_table",false );
         		  req.setAttribute("crud_fac_course",false );
//         		        req.setAttribute("create_batch", false);
         		       req.setAttribute("faculty_perform", false);
         		       req.setAttribute("faculty_file", false);
         		        req.setAttribute("faculty_prof",false );
         	       
         	     
         	        req.getRequestDispatcher("faculty.jsp").forward(req, res);
         		}
        		
        	}
        	else
            {
                pw.println(exists);  
            }
        	
		} 
        catch (Exception e) 
        {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        pw.close();
    }
}



