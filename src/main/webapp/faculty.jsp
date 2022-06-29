<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="java.util.ArrayList"
    %>
    
    <%@ page import="java.util.UUID" %>

    <!DOCTYPE html>
<html lang="en">
    <head>
        <title>
            Faculty
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
        
        <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
        <script src="./JS/graph1.js"></script>

        <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
        <script type="text/javascript" src="./JS/graph2.js"></script>

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
                        <li><a class="navbar-brand" href="#" id="c_name" style="font-weight: bolder;">PlaceX</a></li>
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
                <a id="home" href="faculty_home"><span class="glyphicon fa fa-home" aria-hidden="true"></span><span class="nav-label">Home</span></a>
                <a id="assess" href="create_assess" id="contact" class="button big"><span class="glyphicon fa fa-check" aria-hidden="true"></span><span class="nav-label">Create Assessment</span></a>
                <a id="batch" href="create_batch"><span class="glyphicon  fa fa-users" aria-hidden="true"></span><span class="nav-label">Class/Batch</span></a>
                <a id="perform" href="faculty_perform"><span class="glyphicon  fa fa-line-chart" aria-hidden="true"></span><span class="nav-label">Performance</span></a>
                <a id="addfile" href="faculty_file"><span class="glyphicon  fa fa-user" aria-hidden="true"></span><span class="nav-label">Add files</span></a>
                <a id="prof" href="faculty_prof"><span class="glyphicon  fa fa-user" aria-hidden="true"></span><span class="nav-label">Profile</span></a>
              </li>
            </ul>
          </nav>
          <div class="main-content" id="m_content">
          
          <% if ((Boolean)request.getAttribute("message")) { %>
          <p>
          ${error_message}
          </p>
          <%} %>
          
          <% if ((Boolean)request.getAttribute("fac_home")) { %>
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
          
          
          
          
          
          <% if ((Boolean)request.getAttribute("fac_create_assess")) { %>
          
              <% String uniqueID = UUID.randomUUID().toString(); %>
              
              <div  id="popup-2">
              <div class="card">
                <p class="head_card">Create Assessments</p>
                <form action="add_question" method="get">
                
                <h4 id="quizid">Quiz ID: <span><input style="width:48%;text-align:center;" type="text" class="c_assess" placeholder="Title" name="unique_id" id="unique_id" value="<%=uniqueID%>" readonly="readonly"></span></h4>
                <p><b>Note : </b>Please remember above quiz ID</p>
                 <div class="sel_form1">
                 <input type="text" class="c_assess" placeholder="Title" name="quiz_title" id="quiz_title" required>
                 <input type="text" class="c_assess" placeholder="Enter your ID" name="fac_roll" id="fac_roll" required>
                  
                  </div>
                  <br><br>
                  <input class="sub_btn3"  style="width:30%;" onclick="render_assess()" type="submit" value="Proceed">
                </form>
            </div> 
            </div>
          <% } %>
      
      
      
          
          <% if ((Boolean)request.getAttribute("add_question")) { %>
          
	         
           
           	<div id="popup-quiz-2">
              <div class="card">
              <form action="next_ques">
              <div class="row">
              	<div class="col-md-9">
              		<input type="text" class="head_card" style="background-color:#fcfcfd;color:#222;" placeholder="Title" name="quiz_title" id="quiz_title" value="${quiztitle}"  readonly="readonly">
              	</div>
              	<div style="border-left:2px solid #222;" class="col-md-3">
              		<input type="text" class="head_card" style="background-color:#fcfcfd;color:#222;" placeholder="Title" name="fac_roll" id="fac_roll" value="${fac_roll}"  readonly="readonly">
              	</div>
              </div>
               
                
                <h4 id="quizid">Quiz ID: <span><input style="width:48%;text-align:center;" type="text" class="c_assess" placeholder="Title" name="unique_id" id="unique_id" value="${quizid}"  readonly="readonly"></span></h4>
                
                
                
                <input type="text" style="width:45px;font-size:12px;border-radius:50%;background:#53cf83;text-align:center;" placeholder="Title" name="question_no" id="question_no" value="${question_no}"  readonly="readonly">
                
                
                  <div class="sel_form1">
                    <textarea style="height:100%;width:90%;padding-bottom:100px;"class="c_assess" name="question" id="question" placeholder="Enter the Question" required></textarea>
                    <input type="text" style="width: 45%;" class="c_assess" name="opt_1" id="opt_1" placeholder="Enter the option 1" required><br>
                    <input type="text" style="width: 45%;" class="c_assess" name="opt_2" id="opt_2" placeholder="Enter the option 2" required><br>
                    <input type="text" style="width: 45%;" class="c_assess" name="opt_3" id="opt_3" placeholder="Enter the option 3" required><br>
                    <input type="text" style="width: 45%;" class="c_assess" name="opt_4" id="opt_4" placeholder="Enter the option 4" required><br>
                    <input type="text" style="width: 45%;" class="c_assess" name="answer" id="answer" placeholder="Enter the Answer" required><br>
                    <input type="text" style="width: 30%;" class="c_assess" name="weightage" id="weightage" placeholder="Enter the weightage" required>
                                  
                  </div>
                  <br><br>
                  <input class="sub_btn3" style="width:30%;margin-left: 30%;" type="submit" value="Next">
                </form>
                
                 <a href="faculty_home"><input class="sub_btn3" style="width:30%;margin-left: 30%;" type="button" value="Create Quiz"></a>
                
            </div> 
              
            </div>
          
       		<% } %>
           
           
           
           
           
           
           
           <% if ((Boolean)request.getAttribute("fac_course_table")) { %>

           <div class="">
            <div class="display_comp_det" id="display_comp_det" >
              <div class="card">
                <p class="head_card"><i class="fas fa-building"></i>&nbsp;Company</p>
              <div id="table">
                <table class="table">
                  <thead class="thead-dark">
                  <tr>
                      <th scope="col">#</th>
                      <th scope="col">COURSE ID</th>
                      <th scope="col">COURSE NAME</th>
                      <th scope="col">SEMESTER</th>
                      <th scope="col">SECTION</th>
                  </tr>
                  </thead>
                  <tbody>
                  
                  <% ArrayList<String> list = (ArrayList<String>)request.getAttribute("ret") ; %>
                  
                  	<%  for(int i=0;i<list.size();i=i+4) 
				           {
				   			%>
				            <tr>
				            <th scope="row"> <%= (i+4)/4 %> </th>
				            <td><%= list.get(i) %></td>
				             <td><%= list.get(i+1) %></td>
				             <td><%= list.get(i+2) %></td>
				             <td><%= list.get(i+3) %></td>
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
         
         
         


		<% if ((Boolean)request.getAttribute("crud_fac_course")) { %>

			
          <div class="company_crud" id="company_crud" >
            <div class="card">
              <p class="head_card"><i class="fas fa-book-reader"></i>&nbsp;CRUD Company</p>
              <form action="fac_crud_course" method="post">
                <div class="sel_form1">
                  <input type="text" class="c_assess" placeholder="Course Name" name="fac_course_name" >
                  <input type="text" class="c_assess" placeholder="Course ID" name="fac_course_id" >
                  <input type="text" class="c_assess" placeholder="Semester" name="fac_sem" >
                  <input type="text" class="c_assess" placeholder="Section" name="fac_section" >
                  <input type="text" class="c_assess" placeholder="Your ID" name="fac_id" required>
                  <br>
                  
                  <br>
                 	<select class="drop1" name="fac_course_op" id="fac_course_op">
                        <option value="create">CREATE COURSE</option>
                        <option value="delete">DELETE COURSE</option>
                        <option value="view">VIEW COURSES</option>
                    </select>
              
                </div>
                
                <br><br>
                <input class="sub_btn1"  type="submit" value="Proceed">
                <div>
				</div>
              </form>
          	</div>
          </div>
          
          <% } %>
           
           
           
           
           
           
       		
       		
          
          <% if ((Boolean)request.getAttribute("faculty_perform")) { %>
           
           <div> IN faculty_perform </div>
       		<% } %>
          
          <% if ((Boolean)request.getAttribute("faculty_file")) { %>
           
           <div> IN faculty_file </div>
       		<% } %>
       		
       	<% if ((Boolean)request.getAttribute("faculty_prof")) { %>
           
           <div> IN faculty_prof </div>
       		<% } %>
          
          
          
          
          
          
          
          
          
          
          
          
          </div>
          </div>
                            
        </div>
    </body>

</html>