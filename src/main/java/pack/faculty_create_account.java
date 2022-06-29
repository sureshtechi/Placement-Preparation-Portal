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

public class faculty_create_account  extends HttpServlet
{
    protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
    {
        PrintWriter pw=res.getWriter();
        res.setContentType("text/html");
        
        System.out.println("in student create account.java");
        
        
        String faculty_id=req.getParameter("faculty_id");
        String faculty_name=req.getParameter("faculty_name");
        String faculty_email=req.getParameter("faculty_email");
        String faculty_pos=req.getParameter("faculty_pos");
        String password=req.getParameter("faculty_password");
        String re_password=req.getParameter("faculty_re_enter_password");
        
        if( password.equals(re_password)  ) 
        {
        	
	        try 
	        {
				String err_msg= MysqlCon.faculty_acc_create(faculty_id, faculty_name, faculty_email, faculty_pos, password, re_password) ; 
	        	
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
				e.printStackTrace();
			}
        }
        else 
        {
        	req.setAttribute("message", true);
 			req.setAttribute("wel_block", true);
 			req.setAttribute("error_message", "Password doesn't match");
 	        req.setAttribute("crud_company", false);
 	        req.setAttribute("company_table", false);
 	        req.setAttribute("company_file", false);
	        req.getRequestDispatcher("admin.jsp").forward(req, res);
        }
        
        pw.close();
    }
}





