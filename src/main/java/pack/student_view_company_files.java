package pack;
import java.sql.Blob;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pack.MysqlCon;


public class student_view_company_files extends HttpServlet
{
    protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
    {

        
        String company_name=req.getParameter("company_name");
        String company_id=req.getParameter("company_id");
        String company_file_type=req.getParameter("company_file_type");
        
        
        Blob image = null;
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        
        ServletOutputStream out = res.getOutputStream();
        
        try 
        {
        	
	        Class.forName("com.mysql.jdbc.Driver");
	        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/PPP","root","password");
	        stmt = con.createStatement();
	        
	        if( company_file_type.equals("job_des")  ) 
	        {
	        	rs = stmt.executeQuery("select jd_file from job_description where C_ID='"+company_id+"';");
	        }
	        else 
	        {
	        	rs = stmt.executeQuery("select inex_file from interview_experience where C_ID='"+company_id+"';");
	        }
	        if (rs.next()) 
	        {
	        	image = rs.getBlob(1);
	        } 
	        
	        else 
	        {
		        res.setContentType("text/html");
		        out.println("<html><head><title>Display Blob Example</title></head>");
		        out.println("<body><h4><font color='red'>image not found for given id</font></h4></body></html>");
		        return;
		    }
	        
	        res.setContentType("application/pdf");
	        InputStream in = image.getBinaryStream();
	        int length = (int) image.length();
	        int bufferSize = 1024;
	        byte[] buffer = new byte[bufferSize];
	        
	        
	        while ((length = in.read(buffer)) != -1) 
	        {
	        	out.write(buffer, 0, length);
	        }
	        
	        in.close();
	        out.flush();
        } 
        
        catch (Exception e) 
        {
	        res.setContentType("text/html");
	        out.println("<html><head><title>Unable To Display image</title></head>");
	        out.println("<body><h4><font color='red'>Image Display Error=" + e.getMessage() +
	         "</font></h4></body></html>");
	        return;
        } 
        
        finally 
        {
	        try 
	        {
		        rs.close();
		        stmt.close();
		        con.close();
	        } 
	        catch (SQLException e) 
	        {
	        	e.printStackTrace();
	        }
        }
        	
        	req.setAttribute("message", false);
        	req.setAttribute("wel_student", false);
			req.setAttribute("disp_company_file_table", false);
	        req.setAttribute("student_company_files_form", false);
	        req.setAttribute("student_assess", false);
	        req.setAttribute("student_attend_quiz", false);
	        req.setAttribute("student_show_marks", false);
	        req.setAttribute("student_perf", false);
	        req.setAttribute("student_roll_perf", false);
	        req.setAttribute("student_profile", false);
        
       
    }
}



