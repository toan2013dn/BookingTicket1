<%-- 
    Document   : editprofile
    Created on : Nov 12, 2021, 12:41:22 AM
    Author     : Hi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
  <!-- basic -->
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <!-- mobile metas -->
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <meta name="viewport" content="initial-scale=1, maximum-scale=1">
  <!-- site metas -->
  <title>MTB</title>
  <meta name="keywords" content="">
  <meta name="description" content="">
  <meta name="author" content="">
  <!-- fevicon -->
  <link rel="icon" href="images/fevicon.png" type="image/gif" />
  <!-- bootstrap css -->
  <link rel="stylesheet" href="css/bootstrap.min.css">
  <!-- style css -->
  <link rel="stylesheet" href="css/style.css">
  <!-- Responsive-->
  <link rel="stylesheet" href="css/responsive.css">  
  <!-- Scrollbar Custom CSS -->
  <link rel="stylesheet" href="css/jquery.mCustomScrollbar.min.css">
  <!-- Tweaks for older IEs-->
  <link rel="stylesheet" href="https://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/fancybox/2.1.5/jquery.fancybox.min.css" media="screen">
<!--[if lt IE 9]>
<script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
<script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script><![endif]-->
</head>
<!-- body -->

<body class="main-layout contineer_page">
  <!-- loader  -->
  <div class="loader_bg">
    <div class="loader"><img src="images/loading.gif" alt="#" /></div>
  </div>
  <!-- end loader -->
  <!-- header -->
  <header>
    <!-- header inner -->

      <div class="header">
        <div class="container">
          <div class="row">
            <div class="col-xl-2 col-lg-2 col-md-2 col-sm-3 col logo_section">
              <div class="full">
                <div class="center-desk">
                  <div class="logo">
                    <a href="index.jsp"><img src="images/logo.png" alt="#" /></a>
                  </div>
                </div>
              </div>
            </div>
            <div class="col-xl-10 col-lg-10 col-md-10 col-sm-9">
              
               <div class="menu-area">
                <div class="limit-box">
                  <nav class="main-menu ">
                    <ul class="menu-area-main">
                      <li> <a href="index.jsp">Home</a> </li>
                  
                      <li> <a href="about.jsp">About</a> </li>
                      <li> <a href="./concert">Concerts </a> </li>
                      <li> <a href="gallery.jsp">Gallery</a> </li>
                      <li> <a href="contact.jsp">Contact</a> </li>
                      <li class="search-toggle">
                        <div class="search-container">
                          <div id="search-group" class="search-group close-search">
                            <div class="toggle-target-container">
                              <div class="toggle-target"><input   type="text" class="search-text" placeholder="Search"></div>
                            </div>
                            <div class="search-button-container">
                              <span class="input-group-addon search-button"><i class="fa fa-search" id="search-icon"></i></span>
                            </div>
                          </div>
                        </div>
                      </li>
                      <c:if test="${sessionScope.acc !=null}">
                      
                       <c:if test="${sessionScope.acc !=null}">
                      <li class="action-profile">
                        <div class="profile" onclick="menuToggle();">
                          <img src="images/up.jpg">
                        </div>
                        <div class="menu-profile">
                            <h3>${sessionScope.acc.firstname}<br><span>${sessionScope.acc.lastname}</span></h3>
                          <ul>
                            <li><img src="images/user.png"><a href="profile.jsp">My profile</a></li>
                            <li><img src="images/edit.png"><a href="./editprofile">Edit profile</a></li>
                            <li><img src="images/question.png"><a href="about.jsp">Help</a></li>
                            <li><img src="images/log-out.png"><a href="./logout">Log out</a></li>
                          </ul>
                        </div>
                      </li>
                       </c:if>
                      </c:if>
                     </ul>
                   </nav>
                
               </div> 
             </div>
           </div>
         </div>
       </div>
     </div>

     <!-- end header inner -->

     <!-- end header -->
   
</header>



<!-- profile  -->
<div class="container rounded bg-white mt-5 mb-5">
    <div class="row">
        <div class="col-md-3 border-right">
            <div class="d-flex flex-column align-items-center text-center p-3 py-5"><img class="rounded-circle mt-5" width="150px"
                                                                                         src="images/up.jpg"><span class="font-weight-bold">${sessionScope.acc.lastname}</span><span class="text-black-50">${sessionScope.acc.email}</span><span> </span></div>
        </div>
         <form action="editprofile" method="post">
        <div class="col-md-9 border-right">
            <div class="p-3 py-5">
                <div class="d-flex justify-content-between align-items-center mb-3">
                    <h4 class="text-right">Profile Settings</h4>
                </div>
               
                <div class="row mt-2">
                    <div class="col-md-6"><label class="labels">ID</label><input type="text" class="form-control"  value="${sessionScope.acc.uID}" name="id" readonly required></div>
                    <div class="col-md-6"><label class="labels">First Name</label><input type="text" class="form-control"  value="${sessionScope.acc.firstname}" name="firstname"></div>
                    <div class="col-md-6"><label class="labels">Last Name</label><input type="text" class="form-control" value="${sessionScope.acc.lastname}"  name="lastname"></div>
                    <div class="col-md-6"><label class="labels">Password</label><input type="text" class="form-control" value="${sessionScope.acc.password}"  name="psw"></div>
                </div>
                <div class="row mt-3">
                    <div class="col-md-12"><label class="labels">Phone Number</label><input type="text" class="form-control"  value="${sessionScope.acc.phonenumber}" name="phoneno"></div>
                    
                </div>
                </div>
                <div class="mt-6 text-center">
                    <button type="submit" class="btn btn-primary profile-button" >Save Profile</button>
                </div>
            </div>
        </form>

        </div>
    </div>
</div>
</div>
</div>
<!-- end profile -->






    <!--  footer -->
    <footr>
      <div class="footer ">
        <div class="container">
          <div class="row">

            </div>
            </form>

            </div>
            <div class="col-md-12 border_top">
              <form class="news">
               <h3>E-mail</h3>
                <input class="newslatter" placeholder="ENTER YOUR MAIL" type="text" name=" ENTER YOUR MAIL">
                <button class="submit">Subscribe</button>
              </form>
            </div>
            <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 ">
              <div class="row">
                <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 ">
                  <div class="address">
                    <ul class="loca">
                      <li>
                        <a href="https://www.google.com/maps/place/19+H%E1%BB%93+T%C6%B0%C6%A1ng,+Thanh+Kh%C3%AA+%C4%90%C3%B4ng,+Thanh+Kh%C3%AA,+%C4%90%C3%A0+N%E1%BA%B5ng+550000,+Vietnam/@16.0631575,108.1810338,17z/data=!4m5!3m4!1s0x31421903c1e1af29:0xda107885bb737c88!8m2!3d16.0631575!4d108.1832278"><img src="icon/loc.png" alt="#" /></a>Locations
                   
                        <li>
                          
                            <a href="#"><img src="icon/call.png" alt="#" /></a>+840932542806 </li>
                          <li>
                            <a href="#"><img src="icon/email.png" alt="#" /></a>MTB@gmail.com </li>
                          </ul>
                         

                        </div>
                      </div>
                       <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 ">
                           <ul class="social_link">
                            <li><a href="#"><i class="fa fa-facebook" aria-hidden="true"></i></a></li>
                            <li><a href="#"><i class="fa fa-twitter" aria-hidden="true"></i></a></li>
                            <li><a href="#"><i class="fa fa-linkedin-square" aria-hidden="true"></i></a></li>
                            <li><a href="#"><i class="fa fa-instagram" aria-hidden="true"></i></a></li>
                          </ul>
                       </div>
                    </div>
                  </div>

                </div>

              </div>
               <div class="container">
              <!-- <div class="copyright">
               
                  <p>Copyright 2019 All Right Reserved By <a href="https://html.design/">Free  html Templates</a></p>
                </div> -->
              </div>
            </div>
          </footr>
          <!-- end footer -->
          <!-- Javascript files-->
          <script src="js/jquery.min.js"></script>
          <script src="js/popper.min.js"></script>
          <script src="js/bootstrap.bundle.min.js"></script>
          <script src="js/jquery-3.0.0.min.js"></script>
          <script src="js/plugin.js"></script>
          <script src="js/search.js"></script>
          <script src="js/profile-box.js"></script>


          <!-- sidebar -->
          <script src="js/jquery.mCustomScrollbar.concat.min.js"></script>
          <script src="js/custom.js"></script>
          <script src="https:cdnjs.cloudflare.com/ajax/libs/fancybox/2.1.5/jquery.fancybox.min.js"></script>




</body>

</html>