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


public class home extends HttpServlet
{
    protected void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
    {

        PrintWriter pw=res.getWriter();
        res.setContentType("text/html");
        
        System.out.println("in home.java");
        
        req.setAttribute("message", false);
		req.setAttribute("wel_block", true);
        req.setAttribute("crud_company", false);
        req.setAttribute("company_table", false);
        req.setAttribute("company_file", false);
        req.getRequestDispatcher("admin.jsp").forward(req, res);
        
        pw.close();
    }
}



