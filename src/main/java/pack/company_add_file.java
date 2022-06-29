

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


public class company_add_file extends HttpServlet
{
    protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
    {

        PrintWriter pw=res.getWriter();
        res.setContentType("text/html");
        
        System.out.println("in company_add_file.java");
        
        
        String file_path=req.getParameter("file_path").trim();
        String company_id=req.getParameter("company_id");
        String company_file_type=req.getParameter("company_file_type");
        
        System.out.println(file_path);
        System.out.println(company_id);
        System.out.println(company_file_type);
        
        
        
        try 
        {
			String exists = MysqlCon.company_add_file(file_path, company_id, company_file_type);
			
			System.out.println(exists);
			
			req.setAttribute("message", true);
			req.setAttribute("error_message", exists);
 			req.setAttribute("wel_block", true);
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
        
        pw.close();
    }
}



