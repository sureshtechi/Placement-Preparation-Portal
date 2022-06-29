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

public class crud_company extends HttpServlet
{
    protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
    {
        PrintWriter pw=res.getWriter();
        res.setContentType("text/html");
        
        System.out.println("in create company.java");
        
        
        String company_name=req.getParameter("company_name");
        String company_id=req.getParameter("company_id");
        String op = req.getParameter("company_op");
        String errmsg="No records available to show";
        
        System.out.println(company_name);
        System.out.println(company_id);
        System.out.println(op);

            
            try 
            {
                
                String ans= MysqlCon.crud_company(company_name, company_id, op) ;
                System.out.println(ans);
                
                
                boolean message = false;
	   	    	 char space = ' ';
	   	    	String delete1="delete" ;
		    	String create="create" ;
   	    	 
	   	    	 
	   	    	if( op.equals(delete1) || op.equals(create)  ) 
	   	    	{
	   	    		message = true ;
	   	    		req.setAttribute("message", message);
		   	    	req.setAttribute("wel_block", true);
		   	    	req.setAttribute("error_message", ans);
		   	    	req.setAttribute("crud_company", false);
		   	        req.setAttribute("company_table", false);
		   	        req.setAttribute("company_file", false);
			        req.getRequestDispatcher("admin.jsp").forward(req, res);
	   	    	}
	   	    	else 
	   	    	{
	   	    		if( ans.equals(errmsg) ) 
	   	    		{
	   	    			message = true ;
		   	    		req.setAttribute("message", message);
			   	    	req.setAttribute("wel_block", true);
			   	    	req.setAttribute("error_message", ans);
			   	    	req.setAttribute("crud_company", false);
			   	        req.setAttribute("company_table", false);
			   	        req.setAttribute("company_file", false);
				        req.getRequestDispatcher("admin.jsp").forward(req, res);
	   			       
	   			
	   			      
	   	    		}
	   	    		else 
	   	    		{
		   	    			message = false ;
		   	    			String temp="" ;
		   		   	    	ArrayList<String> ret=new ArrayList<String>() ;
		   		   	    	int k=0;
		   		   	    	
		   		   	    	for(int i=0;i<ans.length();i++) 
		   		   	    	{
		   		   	    		if( ans.charAt(i)=='-') 
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
		   		   	    	
		   		   	    	req.setAttribute("message", message);
		   		   	    	req.setAttribute("wel_block", false);
		   		   	    	req.setAttribute("crud_company", false);
		   		   	    	req.setAttribute("company_table", true);
		   		   	    	req.setAttribute("company_file", false);
		   		   	    	req.setAttribute("ret", ret);
			   	        
				
				        req.getRequestDispatcher("admin.jsp").forward(req, res);
	   	    			
	   	    		}
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