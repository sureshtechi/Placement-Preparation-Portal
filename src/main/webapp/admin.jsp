<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="java.util.ArrayList"
    %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>
            Admin
        </title>

        <link rel="shortcut icon" href="./IMG/logo_1.png"/>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
        <link rel="stylesheet" href="./CSS/login.css">
        <link href="http://fonts.cdnfonts.com/css/space-grotesk" rel="stylesheet">
        <link href="https://use.fontawesome.com/releases/v5.13.0/css/all.css" rel="stylesheet">
        <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
        <link rel="stylesheet" href="./CSS/user_page.css">
        <link rel="stylesheet" href="./CSS/popup_ass.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="./CSS/profile.css">
    </head>
    <body>
        <div class="container">
          <div class="row">
            <nav class="navbar navbar-inverse navbar-global navbar-fixed-top">
                <div class="container-fluid">
                  <div class="navbar-header">
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                      <span class="sr-only">Toggle navigation</span>
                      <span class="icon-bar"></span>
                      <span class="icon-bar"></span>
                      <span class="icon-bar"></span>
                    </button>
                    <div class="collapse navbar-collapse">
                      <ul class="nav navbar-nav navbar-user navbar-right">
                        <li><img id="logo" src="./IMG/logo_1.png"></li>
                        <li><a class="navbar-brand" href="#" id="c_name" style="font-weight: bolder;" >PlaceX</a></li>
                      </ul>
                    </div>
                    
                    
                                        
                  </div>
                  <div id="navbar" class="collapse navbar-collapse">
                    <ul class="nav navbar-nav navbar-user navbar-right">
                      <li><input class="form-control me-2" id="pos" type="search" placeholder="Search" aria-label="Search"></li>
                      <li id="search"><a href="Login.html" class="btn btn-outline-success" type="submit">Logout</a></li>
                    </ul>
                  </div><!--/.nav-collapse -->
                </div>
              </nav>
          <nav class="navbar-primary" id="navi">
            <a href="#" class="btn-expand-collapse"><span class="glyphicon glyphicon-menu-left"></span></a>
            <ul class="navbar-primary-menu">
              <li>
                <a id="home"  href="home"><span class="glyphicon fa fa-home" aria-hidden="true"></span><span class="nav-label">Home</span></a>
                <a id="mat" href="#"><span class="glyphicon fa fa-book" aria-hidden="true"></span><span class="nav-label">Student</span></a>
                <a id="assess"  href="#"><span class="glyphicon fas fa-laptop-code" aria-hidden="true" ></span><span class="nav-label">Faculty</span></a>
                <a id="comp"  href="company"><span class="glyphicon fas fa-building"></span><span class="nav-label">Company </span></a>
                <a id="perform"  href="company_details"><span class="glyphicon fas fa-building" aria-hidden="true"></span><span class="nav-label">Company Details</span></a>
                <a href="student_signup.html" id="student_Sign_Up" type="submit" value="student Sign Up"><span class="glyphicon glyphicon-education" aria-hidden="true"></span><span class="nav-label">Student Sign Up</span></a>
                <a href="faculty_signup.html" id="faculty_Sign_Up" type="submit" value="faculty Sign Up"><span class="glyphicon glyphicon-user" aria-hidden="true"></span><span class="nav-label">Faculty Sign Up</span></a>  
         
               
              </li>
            </ul>
          </nav>
          
          
          
          <div class="main-content" id="m_content">
          
          <% if ((Boolean)request.getAttribute("message")) { %>
          <p>
          ${error_message}
          </p>
          <%} %>
          
          <% if ((Boolean)request.getAttribute("wel_block")) { %>
          
           <div id="wel" >
           
              <div id="wel1" class=" welcome">
              <h1 id="head"> Welcome To PlaceX </h1>
              <p id="content">Place where dreams are made off.</p>
              </div>
              
              <!-- <div class="col-md-1"></div> -->
              <div class="welcome calen">
                <p class="head_card" style="color: black;"><i class="fas fa-calendar-alt"></i>&nbsp;Calendar</p>
                <table style="border:1px;">
      
                  <tr>
                  <th><</th> 
                  <th colspan="6">August 2021</th>
                  <th>></th>
                  </tr>
                  
                  <tr>
                  <th>Su</th>
                  <th>Mo</th>
                  <th>Tu</th>
                  <th>We</th>
                  <th>Th</th>
                  <th>Fr</th>
                  <th>Sa</th>
                  </tr>
                  
                  <tr>
                  <td>1</td>
                  <td>2</td>
                  <td>3</td>
                  <td>4</td>
                  <td>5</td>
                  <td>6</td>
                  <td>7</td>
                  </tr>
                  
                  <tr>
                  <td>8</td>
                  <td>9</td>
                  <td>10</td>
                  <td>11</td>
                  <td>12</td>
                  <td>13</td>
                  <td>14</td>
                  </tr>
                  
                  <tr>
                  <td>15</td>
                  <td>16</td>
                  <td>17</td>
                  <td>18</td>
                  <td>19</td>
                  <td>20</td>
                  <td>21</td>
                  </tr>
                  
                  <tr>
                  <td>22</td>
                  <td>23</td>
                  <td>24</td>
                  <td>25</td>
                  <td>26</td>
                  <td>27</td>
                  <td>28</td>
                  </tr>
                  
                  <tr>
                  <td>29</td>
                  <td>30</td>
                  <td>31</td>
                  </tr>
                  
                  </table>
              </div>
           </div>
           <%  } %>
           
           
			<% if ((Boolean)request.getAttribute("company_table")) { %>

           <div class="">
            <div class="display_comp_det" id="display_comp_det" >
              <div class="card">
                <p class="head_card"><i class="fas fa-building"></i>&nbsp;Company</p>
              <div id="table">
                <table class="table">
                  <thead class="thead-dark">
                  <tr>
                      <th scope="col">#</th>
                      <th scope="col">COMPANY ID</th>
                      <th scope="col">COMPANY NAME</th>
                  </tr>
                  </thead>
                  <tbody>
                  
                  <% ArrayList<String> list = (ArrayList<String>)request.getAttribute("ret") ; %>
                  
                  	<%  for(int i=0;i<list.size();i=i+2) 
				           {
				   			%>
				            <tr>
				            <th scope="row"> <%= (i+2)/2 %> </th>
				            <td><%= list.get(i) %></td>
				             <td><%= list.get(i+1) %></td>
				          </tr>
				            
				            <% 
				           }
   							%>
   		
                  </tbody>
              </table>
              </div>
            </div>
            </div> 
        </div> 
         <%  } %>
         
         
         


		<% if ((Boolean)request.getAttribute("crud_company")) { %>

          <div class="company_crud" id="company_crud" >
            <div class="card">
              <p class="head_card"><i class="fas fa-book-reader"></i>&nbsp;CRUD Company</p>
              <form action="crud_company" method="post">
                <div class="sel_form1">
                  <input type="text" class="c_assess" placeholder="Company_Name" name="company_name" required>
                  <input type="text" class="c_assess" placeholder="Company_ID" name="company_id" required>
                  <br>
                  
                  <br>
                 	<select class="drop1" name="company_op" id="company_op">
                        <option value="create">CREATE AN ENTRY</option>
                        <option value="delete">DELETE</option>
                        <option value="view">VIEW ALL ENTRY</option>
                    </select>
              
                </div>
                
                <br><br>
                <input class="sub_btn1"  type="submit" value="Create">
                <div>
				</div>
              </form>
          	</div>
          </div>
          
          <% } %>
          
          
          
          <% if ((Boolean)request.getAttribute("company_file")) { %>

          <div class="company_crud" id="company_crud" >
            <div class="card">
              <p class="head_card"><i class="fas fa-book-reader"></i>&nbsp;ADD Company File</p>
              <form action="company_add_file" method="post">
                <div class="sel_form1">
                  <input type="text" class="c_assess" placeholder="File_path" name="file_path" required>
                  <input type="text" class="c_assess" placeholder="Company_ID" name="company_id" required>
                  <br>
                  
                  <br>
                 	<select class="drop1" name="company_file_type" id="company_file_type">
                        <option value="job_des">Job Description</option>
                        <option value="int_ex">Interview Experience</option>
                    </select>
              
                </div>
                
                <br><br>
                <input class="sub_btn1"  type="submit" value="Upload">
                <div>
				</div>
              </form>
          	</div>
          </div>
          
          <% } %>
 
 
 
          </div>
          </div>
                            
        </div>
        
        
    

    </body>

</html>