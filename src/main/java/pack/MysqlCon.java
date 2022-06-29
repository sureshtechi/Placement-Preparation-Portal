package pack;


import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.*; 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MysqlCon {
	
	
	public static String check_logincred(String user,String password,String role) throws Exception
	{
		String url = "jdbc:mysql://localhost:3306/PPP";
        String uname="root";
        String pass="password";
        try 
        {
        	Class.forName("com.mysql.cj.jdbc.Driver"); 
        }
        catch(Exception e) 
        {
        	System.out.println(e);
        }
        
        Connection con=DriverManager.getConnection(url, uname, pass);   
        Statement st=con.createStatement();  
        ResultSet rs=st.executeQuery("select * from login where id='" +user+"' and password='"+password+"' and role='"+role+"';");
        
        if(rs.next())
        {
        	st.close();
            con.close();
        	if(role.equals("admin"))
        	{
        		return "admin";
        	}
        	else if(role.equals("student"))
        	{
        		return "student";
        	}
        	else
        	{
        		return "faculty";
        	}
        } 
        else
        {
        	if(role.equals("admin"))
        	{
        		return "No Admin records with this credentials";
        	}
        	else if(role.equals("student"))
        	{
        		return "No Student records with this credentials";
        	}
        	else
        	{
        		return "No Faculty records with this credentials";
        	}
        }
        
	}
	
	
	
	
	
	
	public static String student_acc_create(String user,String student_id, int sem, String degree, String branch, String section, String email, String password, String re_password) throws Exception
	{
		String url = "jdbc:mysql://localhost:3306/PPP";
        String uname="root";
        String pass="password";
//        String query="select PASSWORD from ADMIN where ADMIN_ID='AD1'";
        System.out.println("hellooooooooooooooooooooooooooooooooooo");
        try 
        {
        	Class.forName("com.mysql.cj.jdbc.Driver"); 
        }
        catch(Exception e) 
        {
        	System.out.println(e);
        }
        
//        DriverManager.registerDriver(new com.mysql.jdbc.Driver ());
        Connection con=DriverManager.getConnection(url, uname, pass);   
        Statement st=con.createStatement();  
        
        ResultSet rs=st.executeQuery("SELECT * FROM STUDENT WHERE email='"+email+"';") ;
        
        if(rs.next()) 
        {
        	st.close();
            con.close();
        	return "Student Record already Exists" ;
        }
        else 
        {
        	
            st.executeUpdate("insert into student values ('"+student_id+"','"+user+"',"+sem+",'"+degree+"','"+branch+"','"+section+"','"+email+"');"); 
            st.executeUpdate("insert into login values ('"+student_id+"','"+password+"','student');"); 

            st.close();
            con.close();
            
            return "Student record successfully created" ;
        	
        }
	}
	
	

	public static String faculty_acc_create(String faculty_id,String  faculty_name,String  faculty_email,String  faculty_pos,String  password,String  re_password) throws Exception
	{
		String url = "jdbc:mysql://localhost:3306/PPP";
        String uname="root";
        String pass="password";
//        String query="select PASSWORD from ADMIN where ADMIN_ID='AD1'";
        System.out.println("hellooooooooooooooooooooooooooooooooooo");
        try 
        {
        	Class.forName("com.mysql.cj.jdbc.Driver"); 
        }
        catch(Exception e) 
        {
        	System.out.println(e);
        }
        
//        DriverManager.registerDriver(new com.mysql.jdbc.Driver ());
        Connection con=DriverManager.getConnection(url, uname, pass);   
        Statement st=con.createStatement();  
        
        ResultSet rs=st.executeQuery("SELECT * FROM faculty WHERE email='"+faculty_email+"';") ;
        
        if(rs.next()) 
        {
        	st.close();
            con.close();
        	return "Faculty Record already Exists" ;
        }
        else 
        {
        	
            st.executeUpdate("insert into faculty values ('"+faculty_id+"','"+faculty_name+"','"+faculty_email+"','"+faculty_pos+"');"); 
            st.executeUpdate("insert into login values ('"+faculty_id+"','"+password+"','faculty');"); 

            st.close();
            con.close();
            
            return "Faculty record successfully created" ;
        	
        } 
	}
	

	
	
	public static String crud_company(String c_name,String c_id, String op) throws Exception
	{
		String url = "jdbc:mysql://localhost:3306/PPP";
        String uname="root";
        String pass="password";
//        
       System.out.println("Inside database");
        try 
        {
        	Class.forName("com.mysql.cj.jdbc.Driver"); 
        }
        catch(Exception e) 
        {
        	System.out.println(e);
        }
        
        Connection con=DriverManager.getConnection(url, uname, pass);   
        Statement st=con.createStatement();
        
        if(op.equals("create"))
        {
        	ResultSet rs=st.executeQuery("SELECT * FROM COMPANY WHERE C_ID = '"+c_id+"';") ;
            if( rs.next() ) 
            {
            	st.close();
    	        con.close();
            	return "Company record already exists" ;
            	
            }
            else 
            {
    	        st.executeUpdate("insert into company values ('"+c_id+"','"+c_name+"') ;"); 
    	        
    	        st.close();
    	        con.close();
    	        return "Successfully inserted" ; 
            }
        }
        else if(op.equals("delete"))
        {
        	System.out.println("inside delte") ;
        	ResultSet rs=st.executeQuery("SELECT * FROM COMPANY WHERE C_ID = '"+c_id+"';") ;
            if( rs.next() ) 
            {
            	st.executeUpdate("delete from company where c_id='"+c_id+"' and c_name='"+c_name+"';");
            	st.close();
    	        con.close();
            	return "Company record successfully deleted" ;
            	
            }
            else 
            {
    	        st.close();
    	        con.close();
    	        return "No such record exists to delete" ; 
            }
        }
        else
        {
        	ResultSet rs=st.executeQuery("SELECT * FROM COMPANY") ;
        	boolean flag = false;
        	String result = "";
        	while(rs.next())
        	{
        		result = result + rs.getString(1) + "-" + rs.getString(2) + " ";
        		flag = true;
        	}
        	if(flag == false)
        	{
        		return "No records available to show";
        	}
        	else
        	{
        		return result;
        	}
        }

	 }
	
	
	
	
	public static String company_add_file(String file_path, String company_id,String company_file_type) throws Exception
	{
		String url = "jdbc:mysql://localhost:3306/PPP";
        String user = "root";
        String password = "password";
            Connection conn = DriverManager.getConnection(url, user, password);
            
            
            if( company_file_type.equals("job_des") )
            {
            	   
                Statement st=conn.createStatement();
            	ResultSet rs=st.executeQuery("SELECT * from job_description where file_ID='"+file_path+"';") ;
            	if(rs.next()) 
            	{
            		System.out.println("inside file exists");
            		st.close();
            		conn.close();
            		return "Job description File Already exists" ;
            	}
            	else 
            	{
            		System.out.println("inside file doesnt exists");
            		String sql = "INSERT INTO job_description (C_ID, file_ID, jd_file) values (?, ?, ?)";
                	PreparedStatement statement = conn.prepareStatement(sql);
                     statement.setString(1, company_id);
                     statement.setString(2, file_path);
                     InputStream inputStream = new FileInputStream(new File(file_path));
                     statement.setBlob(3, inputStream);
                     int row = statement.executeUpdate();
                     if (row > 0) 
                     {
                    	 conn.close();
                    	 statement.close();
                        
                     }
                     return "Job description file inserted" ;
                     
            	}		
            	 
            }
            else 
            {
            	Statement st=conn.createStatement();
            	ResultSet rs=st.executeQuery("SELECT * from interview_experience where file_ID='"+file_path+"';") ;
            	if(rs.next()) 
            	{
            		System.out.println("inside file exists");
            		st.close();
            		conn.close();
            		return "Interview Experience File Already exists" ;
            	}
            	else 
            	{
            		System.out.println("inside file doesnt exists");
            		String sql = "INSERT INTO interview_experience (C_ID, file_ID, inex_file) values (?, ?, ?)";
                	PreparedStatement statement = conn.prepareStatement(sql);
                     statement.setString(1, company_id);
                     statement.setString(2, file_path);
                     InputStream inputStream = new FileInputStream(new File(file_path));
                     statement.setBlob(3, inputStream);
                     int row = statement.executeUpdate();
                     if (row > 0) 
                     {
                    	 conn.close();
                    	 statement.close();
                       
                     }
                    
                     return "Interview Experience file inserted" ;
                   
            	}	
            } 
         
       
	}
	
	
	public static void add_question(String quiz_id,int question_no,String question,String opt_1,String opt_2,String opt_3,String opt_4,String answer,String f_id,int weightage) throws Exception
	{
		String url = "jdbc:mysql://localhost:3306/PPP";
        String uname="root";
        String pass="password";
//        String query="select PASSWORD from ADMIN where ADMIN_ID='AD1'";
        System.out.println("in add question");
        try 
        {
        	Class.forName("com.mysql.cj.jdbc.Driver"); 
        }
        catch(Exception e) 
        {
        	System.out.println(e);
        }
        
//        DriverManager.registerDriver(new com.mysql.jdbc.Driver ());
        Connection con=DriverManager.getConnection(url, uname, pass);   
        Statement st=con.createStatement();  
       
        st.executeUpdate("insert into question values ('"+quiz_id+"',"+question_no+",'"+question+"','"+opt_1+"','"+opt_2+"','"+opt_3+"','"+opt_4+"','"+answer+"','"+f_id+"',"+weightage+");"); 

            st.close();
            con.close(); 
	}
	
	
	public static String fac_crud_course(String c_name,String c_id, int sem, String section, String fac_id, String fac_op) throws Exception
	{
		String url = "jdbc:mysql://localhost:3306/PPP";
        String uname="root";
        String pass="password";
//        
       System.out.println("Inside database");
        try 
        {
        	Class.forName("com.mysql.cj.jdbc.Driver"); 
        }
        catch(Exception e) 
        {
        	System.out.println(e);
        }
        
        Connection con=DriverManager.getConnection(url, uname, pass);   
        Statement st=con.createStatement();
        
        if(fac_op.equals("create"))
        {
        	ResultSet rs=st.executeQuery("SELECT * FROM course WHERE course_id = '"+c_id+"' and sem="+sem+" and sec='"+section+"' ;") ;
            if( rs.next() ) 
            {
            	st.close();
    	        con.close();
            	return "Course record already exists" ;
            	
            }
            else 
            {
    	        st.executeUpdate("insert into course values ('"+c_id+"','"+c_name+"',"+sem+",'"+section+"','"+fac_id+"') ;"); 
    	        
    	        st.close();
    	        con.close();
    	        return "Course Successfully inserted" ; 
            }
        }
        else if(fac_op.equals("delete"))
        {
        	System.out.println("inside delte") ;
        	ResultSet rs=st.executeQuery("SELECT * FROM course WHERE course_id = '"+c_id+"' and sem="+sem+" and sec='"+section+"' ;") ;
            if( rs.next() ) 
            {
            	st.executeUpdate("delete FROM course WHERE course_id = '"+c_id+"' and sem="+sem+" and sec='"+section+"' ;");
            	st.close();
    	        con.close();
            	return "Course record successfully deleted" ;
            	
            }
            else 
            {
    	        st.close();
    	        con.close();
    	        return "No such record exists to delete" ; 
            }
        }
        else
        {
        	ResultSet rs=st.executeQuery("SELECT course_id, course_name, sem, sec FROM course where f_id='"+fac_id+"';" );
        	boolean flag = false;
        	String result = "";
        	while(rs.next())
        	{
        		result = result + rs.getString(1) + "-" + rs.getString(2) + "-" + rs.getString(3) + "-" + rs.getString(4) +  " ";
        		flag = true;
        	}
        	if(flag == false)
        	{
        		return "No records available to show";
        	}
        	else
        	{
        		return result;
        	}
        }

	 }
	
	
	public static String check_quizid(String quiz_id) throws Exception
	{
		String url = "jdbc:mysql://localhost:3306/PPP";
        String uname="root";
        String pass="password";
        try 
        {
        	Class.forName("com.mysql.cj.jdbc.Driver"); 
        }
        catch(Exception e) 
        {
        	System.out.println(e);
        }
        
        Connection con=DriverManager.getConnection(url, uname, pass);   
        Statement st=con.createStatement();  
        ResultSet rs=st.executeQuery("select quiz_id,q_no,question,opt_1,opt_2,opt_3,opt_4,ans,weightage from question where quiz_id='"+quiz_id+"' and q_no=1;");
        
        if(rs.next())
        {
        	String resss = rs.getString(1) + "$" + rs.getString(2) + "$" + rs.getString(3) + "$" + rs.getString(4) + "$" + rs.getString(5) + "$" + rs.getString(6) + "$" + rs.getString(7) + "$" + rs.getString(8) + "$" + rs.getString(9) + "*";

        	st.close();
            con.close();
            return resss;
        } 
        else
        {
        	st.close();
            con.close();
        	return "Quiz doesn't exist or Invalid Quiz ID";
        }
        
	}
	
	
	
	public static boolean check_current_ans(String quiz_id, int q_no, String user_ans) throws Exception
	{
		String url = "jdbc:mysql://localhost:3306/PPP";
        String uname="root";
        String pass="password";
        try 
        {
        	Class.forName("com.mysql.cj.jdbc.Driver"); 
        }
        catch(Exception e) 
        {
        	System.out.println(e);
        }
        
        Connection con=DriverManager.getConnection(url, uname, pass);   
        Statement st=con.createStatement();  
        ResultSet rs=st.executeQuery("select ans from question where quiz_id='"+quiz_id+"' and q_no="+q_no+";");
        
        if(rs.next())
        {
        	String resss = rs.getString(1);
        	if(resss.equals(user_ans))
        	{
        		st.close();
                con.close();
        		return true;
        	}
        	else
        	{
        		st.close();
                con.close();
        		return false;
        	}
        	
        }
        else
        {
        	return false;
        }
        
        
	}
	
	
	
	public static String fetch_ques(String quiz_id, int q_no) throws Exception
	{
		String url = "jdbc:mysql://localhost:3306/PPP";
        String uname="root";
        String pass="password";
        try 
        {
        	Class.forName("com.mysql.cj.jdbc.Driver"); 
        }
        catch(Exception e) 
        {
        	System.out.println(e);
        }
        
        Connection con=DriverManager.getConnection(url, uname, pass);   
        Statement st=con.createStatement();  
        ResultSet rs=st.executeQuery("select quiz_id,q_no,question,opt_1,opt_2,opt_3,opt_4,ans,weightage from question where quiz_id='"+quiz_id+"' and q_no="+q_no+";");
        
        if(rs.next())
        {
        	String resss = rs.getString(1) + "$" + rs.getString(2) + "$" + rs.getString(3) + "$" + rs.getString(4) + "$" + rs.getString(5) + "$" + rs.getString(6) + "$" + rs.getString(7) + "$" + rs.getString(8) + "$" + rs.getString(9) + "*";

        	st.close();
            con.close();
            return resss;
        } 
        else
        {
        	st.close();
            con.close();
        	return "Quiz Over";
        }
        
	}
	
	
	public static void update_student_mark(String quiz_id,int final_marks,String student_roll) throws Exception
	{
		String url = "jdbc:mysql://localhost:3306/PPP";
        String uname="root";
        String pass="password";
        try 
        {
        	Class.forName("com.mysql.cj.jdbc.Driver"); 
        }
        catch(Exception e) 
        {
        	System.out.println(e);
        }
        
        Connection con=DriverManager.getConnection(url, uname, pass);   
        Statement st=con.createStatement();  
        st.executeUpdate("insert into student_marks values ('"+quiz_id+"',"+final_marks+",'"+student_roll+"');"); 
     
	}
	
	
	
	
	public static String student_view_mark(String roll_no) throws Exception
	{
		String url = "jdbc:mysql://localhost:3306/PPP";
        String uname="root";
        String pass="password";
        try 
        {
        	Class.forName("com.mysql.cj.jdbc.Driver"); 
        }
        catch(Exception e) 
        {
        	System.out.println(e);
        }
        
        Connection con=DriverManager.getConnection(url, uname, pass);   
        Statement st=con.createStatement();  
        ResultSet rs=st.executeQuery("select quiz_id, final_marks from student_marks where s_id='"+roll_no+"';");
        
        String resss="";
        while(rs.next())
        {
        	resss = resss+ rs.getString(1) + "$" + rs.getString(2) + " ";

        	
        } 
        st.close();
        con.close();
        return resss;
       
        	
        
        
	}
	
	
	
    public static void main(String args[]) throws Exception 
    {  
    
        
    } 
    
    
    
}
