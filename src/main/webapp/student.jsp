<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="java.util.ArrayList"
    %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>
            Student
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
                <a id="home"  href="student_home"><span class="glyphicon fa fa-home" aria-hidden="true"></span><span class="nav-label">Home</span></a>
                <a id="mat"  href="#"><span class="glyphicon fa fa-book" aria-hidden="true"></span><span class="nav-label">Course</span></a>
                <a id="assess" href="student_assess"><span class="glyphicon fas fa-laptop-code" aria-hidden="true" ></span><span class="nav-label">Assessment</span></a>
                <a id="comp"  href="student_company"><span class="glyphicon fas fa-building"></span><span class="nav-label">Company</span></a>
                <a id="perform"  href="student_roll_perf"><span class="glyphicon fa fa-line-chart" aria-hidden="true"></span><span class="nav-label">Performance</span></a>
                <a id="prof"  href="student_profile"><span class="glyphicon fa fa-user" aria-hidden="true"></span><span class="nav-label">Profile</span></a>
              </li>
            </ul>
          </nav>
          <div class="main-content" id="m_content">
          
          
          
          
          
          
          <% if ((Boolean)request.getAttribute("message")) { %>
          <p>
          ${error_message}
          </p>
          <%} %>
          
          
          
          
          
          
          <% if ((Boolean)request.getAttribute("wel_student")) { %>
          
          
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
          
          <% } %>
         
         
        </div>
          </div>




     <% if ((Boolean)request.getAttribute("disp_company_file_table")) { %>
     
          <div class="display_assess" id="display_assess" >
            <div class="card">
              <p class="head_card"><i class="fas fa-clipboard-list"></i>&nbsp;Assessments</p>
            <div id="table">
              <table class="table">
                <thead class="thead-dark">
                <tr>
                    <th scope="col">#</th>
                    <th scope="col">First</th>
                    <th scope="col">Last</th>
                    <th scope="col">Handle</th>
                </tr>
                </thead>
                <tbody>
                <tr>
                    <th scope="row">1</th>
                    <td>Mark</td>
                    <td>Otto</td>
                    <td>@mdo</td>
                </tr>
               
                </tbody>
            </table>
            </div>
          </div>
          </div>
          



          <div class="display_company" id="display_company">
                <div class="card">
                  <p class="head_card"><i class="fas fa-book-reader"></i>&nbsp;Interview Experience</p>
                <div id="table">
                  <table class="table">
                    <thead class="thead-dark">
                    <tr>
                        <th scope="col">#</th>
                        <th scope="col">First</th>
                        <th scope="col">Last</th>
                        <th scope="col">Handle</th>
                    </tr>
                    </thead>
                    <tbody>
                    <tr>
                        <th scope="row">1</th>
                        <td>Mark</td>
                        <td>Otto</td>
                        <td>@mdo</td>
                    </tr>
                    <tr>
                        <th scope="row">2</th>
                        <td>Jacob</td>
                        <td>Thornton</td>
                        <td>@fat</td>
                    </tr>
                    <tr>
                        <th scope="row">3</th>
                        <td>Larry</td>
                        <td>the Bird</td>
                        <td>@twitter</td>
                    </tr>
                    </tbody>
                </table>
                </div>
              </div>
           </div>
                
      <%} %>
                    
    <!--       <div class="display_graph" id="display_graph" style="display: none;">
            <div class="row">
              <div class="col-md-5">
                <div class="graph">
                  <p class="head_card_g"><i class="fas fa-chart-pie"></i>&nbsp;Pie Chart</p>
                  <div id="piechart_3d" style="width: 500px; height: 200px;"></div>
              </div>

            </div>
            <div class="col-md-2"></div>

              <div class="col-md-5">
                <div class="graph">
                  <p class="head_card_g"><i class="fas fa-chart-bar"></i>&nbsp;Bar Graph</p>
                  <div id="chart_div" style="width: 500px; height: 200px;"></div>
                </div>

              </div>

            </div> --> 
            
       
       
       
       
       		<% if ((Boolean)request.getAttribute("student_company_files_form")) { %>
       
       
            <div class="company_crud" id="company_crud" >
            <div class="card">
              <p class="head_card"><i class="fas fa-book-reader"></i>&nbsp;View Company File</p>
              <form action="student_view_company_files" method="post">
                <div class="sel_form1">
                  <input type="text" class="c_assess" placeholder="Company_Name" name="company_name" required>
                  <input type="text" class="c_assess" placeholder="Company_ID" name="company_id" required>
                
                  <br>
                  <select  class="drop1" name="company_file_type" id="company_file_type">
                        <option value="job_des">Job Description</option>
                        <option value="int_ex">Interview Experience</option>
                    </select>
                 
              
                </div>
                
                <br><br>
                <input class="sub_btn1"  type="submit" value="View">
                <div>
				</div>
              </form>
          	</div>
          </div>
          
          <% } %>
          
          
          
          <% if ((Boolean)request.getAttribute("student_assess")) { %>
          
          <div class="popup" id="popup-2">



              <div class="card">
                
                  <p id="title3" class="head_card">Assessments</p>
                  <h4>Please enter the quiz id below to start the quiz</h4>
                  <form action="student_enter_quizid" method="get">
                    <input type="text" class="c_assess" placeholder="Enter the quiz id" name="quiz_id" required>
                    <br>
                    <input class="sub_btn3" style="width:30%;margin-left: 30%;" type="submit" value="Start">
                  </form>
                  
              </div> 
              

            </div>
          
           <% } %>
           
           
           
           
           
           <% if ((Boolean)request.getAttribute("student_attend_quiz")) { %>
           
           	<div class="popup" id="popup-attend-2">
                <div class="card">
                  
                  
                    <div class="row">
                      
                      <div class="col-md-6">
                        <!-- <p id="timer">______</p>                       -->
                      </div>
                    </div>
                    <div class="row">
                    <form action="student_nxt_ques" method="post">
                    <input style="display:none;" value="${track_mark}" name="current_mark">
                    <div class="row">
                    <div class="col-md-7">
                    	<h4>Quiz ID:
                    <span>
                    <input style="width:70%;" type=text name="quiz_id" readonly="readonly" value="${quiz_id}">
                    </span></h4>
                    </div>
                    <div style="text-align:center;" class="col-md-5">
                    	<h4>Weightage: <span><input style="width:20%;text-align:center;" type=text name="weightage" readonly="readonly" value="${weightage}">
                    </span></h4>
                    
                    </div>
                    
                    
                    </div>
                    <div class="row">
                    	<div class="col-md-1">
                    	<input style="width:45px;font-size:12px;border-radius:50%;background:#53cf83;text-align:center;" type=text name="ques_no" readonly="readonly" value="${ques_no}">
                    	</div>
                    	<div style="padding-top:10px;" class="col-md-11">
                    		<h4 id="quest" >${question}</h4>
                    	</div>
                    </div>
                    
                     
                    <div class="check">
                    <input style="padding:none;margin-left: -350px;" type="radio" id="opt1" name="ans" value="${option_1}">
                    <label style="margin-left: -400px;" for="opt1">${option_1}</label><br>
                    </div>
                    <div class="check">                    
                    <input style="margin-left: -350px;" type="radio" id="opt2" name="ans" value="${option_2}">
                    <label style="margin-left: -400px;" for="opt2">${option_2}</label><br> 
                    </div> 
                    <div class="check">                    
                    <input style="margin-left: -350px;" type="radio" id="opt3" name="ans" value="${option_3}">
                    <label style="margin-left: -400px;" for="opt3">${option_3}</label><br>
                    </div>
                    <div class="check">
                    <input style="margin-left: -350px;" type="radio" id="opt4" name="ans" value="${option_4}">
                    <label style="margin-left: -400px;" for="opt3">${option_4}</label><br>
                    </div>
                    <input class="sub_btn3" style="width:30%;margin-left: 30%;" type="submit" value="Next">
                    
                    </form> 
                      
                  </div>                 
                </div> 
              </div>
           
           <% } %>
           
           
            
            
           <% if ((Boolean)request.getAttribute("student_show_marks")) { %>
           
            <div class="popup" id="popup-mark-1">
                <div class="card">
                <form action="student_home_1" method="post">
                  <p class="head_card">Result</p>
                  <div class="row">
                  	<div class="col-md-6">
                  		<h4>Quiz ID: <span><input style="width:85%;text-align:center;" type=text name="quiz_id" readonly="readonly" value="${quiz_id}"></span></h4>
                  	</div>
                  	<div class="col-md-6">
                  		<h4>Marks obtained : <span><input style="width:48%;text-align:center;" type=text name="final_marks" readonly="readonly" value="${final_marks}"></span></h4>
                  	</div>
                  </div>                
                  <input type="text" style="width:30%;margin-left: 30%;"class="c_assess" placeholder="Enter your Roll No." name="student_roll" required>
                  <br>
                  <input class="sub_btn3" style="width:20%;margin-left: 35%;" type="submit" value="Go Back">
                 </form> 
                </div> 
              </div>
           <% } %>
           
           
           
           
           
           <% if ((Boolean)request.getAttribute("student_perf")) { %>

           <div class="">
            <div class="display_comp_det" id="display_comp_det" >
              <div class="card">
                <p class="head_card"><i class="fas fa-building"></i>&nbsp;MARKS</p>
              <div id="table">
                <table class="table">
                  <thead class="thead-dark">
                  <tr>
                      <th scope="col">#</th>
                      <th scope="col">QUIZ ID</th>
                      <th scope="col">MARKS</th>
                    
                      
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
         
         
         
         
         
         <% if ((Boolean)request.getAttribute("student_roll_perf")) { %>
          
          <div class="popup" id="popup-2">



              <div class="card">
                
                  <p id="title3" class="head_card">VIEW MARKS</p>
                 
                  <form action="student_performance" method="get">
                    <input type="text" class="c_assess" placeholder="Enter your Roll Number" name="roll_no" required>
                    <br>
                    <input class="sub_btn3" style="width:30%;margin-left: 30%;" type="submit" value="Submit">
                  </form>
                  
              </div> 
              

            </div>
          
           <% } %>
        
            
            
            
           <% if ((Boolean)request.getAttribute("student_profile")) { %>
            <div class="popup" id="popup-5">
            
            <div class="card">
                  <div class="row">
                    <div class="col-md-5" id="photo-1" >
                      <img src="./IMG/mypic.jpg" alt="John" style="width:90%;">

                    </div>
                    <div class="col-md-1">
                    </div>
                    <div class="col-md-6">
                      <h1 class="head_card">Ashwith N</h1>
                      <p class="pro_title">4th year, B-Tech CSE</p>
                      <p>Amrita University, Coimbatore</p>
                      <div style="margin: 24px 0;">
                        <a style="padding-right: 20px;"class="social_icon" href="#"><i class="fa fa-dribbble"></i></a> 
                        <a style="padding-right: 20px;" class="social_icon" href="#"><i class="fa fa-twitter"></i></a>  
                        <a style="padding-right: 20px;" class="social_icon" href="#"><i class="fa fa-linkedin"></i></a>  
                        <a class="social_icon" href="#"><i class="fa fa-facebook"></i></a> 
                      </div>
                      <p><button class="pro_button">CB.EN.U4CSE18110</button></p>
                    </div>
                  </div>
                 </div>
                  
                
              </div> 
            </div>     
            
            <%} %>
            
                                    
        
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          </div>
          </div>
                            
        </div>
    
        
    </body>

</html>