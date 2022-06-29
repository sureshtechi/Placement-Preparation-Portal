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

public class student_create_account  extends HttpServlet
{
    protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
    {
        PrintWriter pw=res.getWriter();
        res.setContentType("text/html");
        
        System.out.println("in student create account.java");
        
        
        String user=req.getParameter("username");
        String student_id=req.getParameter("student_id");
        int sem=Integer.parseInt(req.getParameter("student_curr_sem"));
        String degree=req.getParameter("degree");
        String branch=req.getParameter("branch");
        String section=req.getParameter("section");
        String email=req.getParameter("email");
        String password=req.getParameter("student_password");
        String re_password=req.getParameter("student_re_enter_password");
        
       
        
        if( password.equals(re_password)  ) 
        {
        	
	        try 
	        {
				String err_msg=MysqlCon.student_acc_create(user, student_id, sem, degree, branch, section,email,  password, re_password) ;
	        	
	        	
	        		
	        		
	        		req.setAttribute("message", true);
         			req.setAttribute("wel_block", true);
         			req.setAttribute("error_message", err_msg);
         	        req.setAttribute("crud_company", false);
         	        req.setAttribute("company_table", false);
         	        req.setAttribute("company_file", false);
    		        req.getRequestDispatcher("admin.jsp").forward(req, res);
	        		
	        	
			} 
	        catch (Exception e) 
	        {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
        else 
        {
        	
    		req.setAttribute("message", true);
 			req.setAttribute("wel_block", true);
 			req.setAttribute("error_message", "Password Doesn't match");
 	        req.setAttribute("crud_company", false);
 	        req.setAttribute("company_table", false);
 	        req.setAttribute("company_file", false);
	        req.getRequestDispatcher("admin.jsp").forward(req, res);
        }
        
        
        
        
        
        pw.close();
    }
}






