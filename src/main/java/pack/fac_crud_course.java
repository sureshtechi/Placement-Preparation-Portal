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

public class fac_crud_course extends HttpServlet
{
    protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
    {
        PrintWriter pw=res.getWriter();
        res.setContentType("text/html");
        
        String empty="";
        int fac_sem;
        System.out.println("in faculty crud course.java");
        
        
        String fac_course_name=req.getParameter("fac_course_name");
        String fac_course_id=req.getParameter("fac_course_id");
        if(  (req.getParameter("fac_sem")).equals(empty)   ) 
        {
        	fac_sem=0;
        }
        else 
        {
            fac_sem=Integer.parseInt(req.getParameter("fac_sem"));
        }
        
        String fac_section=req.getParameter("fac_section");
        String fac_id=req.getParameter("fac_id");
        String fac_op=req.getParameter("fac_course_op");
        
        String errmsg="No records available to show";
        
        System.out.println(fac_course_name);
        System.out.println(fac_course_id);
        System.out.println(fac_sem);
        System.out.println(fac_section);
        System.out.println(fac_id);
        System.out.println(fac_op);

            
            try 
            {
                
                String ans= MysqlCon.fac_crud_course(fac_course_name, fac_course_id, fac_sem, fac_section, fac_id, fac_op) ;
                System.out.println(ans);
                
                
                boolean message = false;
	   	    	 char space = ' ';
	   	    	String delete1="delete" ;
		    	String create="create" ;
   	    	 
	   	    	 
	   	    	if( fac_op.equals(delete1) || fac_op.equals(create)  ) 
	   	    	{
	   	    		message = true ;
	   	    		req.setAttribute("message", message);
		   	        req.setAttribute("error_message", ans);
		   	    	
      			
      	        
      		
      			req.setAttribute("fac_home", true);
      		        req.setAttribute("fac_create_assess", false);
      		      req.setAttribute("add_question",false );
      		    req.setAttribute("fac_course_table",false );
      		  req.setAttribute("crud_fac_course",false );
//      		        req.setAttribute("create_batch", false);
      		       req.setAttribute("faculty_perform", false);
      		       req.setAttribute("faculty_file", false);
      		        req.setAttribute("faculty_prof",false );
      	       
      	        req.getRequestDispatcher("faculty.jsp").forward(req, res);
		   	        
			       
	   	    	}
	   	    	else 
	   	    	{
	   	    		if( ans.equals(errmsg) ) 
	   	    		{
	   	    			message = true ;
		   	    		req.setAttribute("message", message);
			   	        req.setAttribute("error_message", ans);
			   	    	
			   	  
			         req.setAttribute("fac_home", true);
			 	        req.setAttribute("fac_create_assess", false);
			 	      req.setAttribute("add_question",false );
			 	    req.setAttribute("fac_course_table",false );
			 	  req.setAttribute("crud_fac_course",false );
//			 	        req.setAttribute("create_batch", false);
			 	       req.setAttribute("faculty_perform", false);
			 	       req.setAttribute("faculty_file", false);
			 	        req.setAttribute("faculty_prof",false );
	      	        req.getRequestDispatcher("faculty.jsp").forward(req, res);
	   			       
	   			
	   			      
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
		   		   	    	
		   		   	
		   	        req.setAttribute("fac_home", false);
		   		        req.setAttribute("fac_create_assess", false);
		   		      req.setAttribute("add_question",false );
		   		   req.setAttribute("fac_course_table",true );
		   		  req.setAttribute("crud_fac_course",false );
//		   		        req.setAttribute("create_batch", false);
		   		       req.setAttribute("faculty_perform", false);
		   		       req.setAttribute("faculty_file", false);
		   		        req.setAttribute("faculty_prof",false );
		      	       
		      	      
		      	   req.setAttribute("ret",ret );
		      	        req.getRequestDispatcher("faculty.jsp").forward(req, res);
	   	    			
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