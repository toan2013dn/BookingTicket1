<%-- 
    Document   : index
    Created on : Nov 5, 2021, 12:08:21 AM
    Author     : Hi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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

<body class="main-layout">
  <!-- loader  -->
  <div class="loader_bg">
    <div class="loader"><img src="images/loading.gif" alt="#" /></div>
  </div>
  <!-- end loader --> 
  <!-- header -->
  <header>
    <!-- header inner -->
    <div class="header-top">
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
                      <li class="active"> <a href="index.jsp">Home</a> </li>
                  
                      <li> <a href="about.jsp">About</a> </li>
                      <li> <a href="./concert">Concerts </a> </li>
                      <li> <a href="gallery.jsp">Gallery</a> </li>
                      <li> <a href="contact.jsp">Contact</a> </li>
                      <c:if test="${sessionScope.acc==null}">
                      <li > <a href="./login">login</a> </li>
                      </c:if>
                      <c:if test="${sessionScope.acc !=null}">
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
     <section class="slider_section">
      <div id="myCarousel" class="carousel slide" data-ride="carousel">
        <ol class="carousel-indicators">
          <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
          <li data-target="#myCarousel" data-slide-to="1"></li>
          <li data-target="#myCarousel" data-slide-to="2"></li>
        </ol>
        <div class="carousel-inner">
          <div class="carousel-item active">

            <div class="container">
              <div class="carousel-caption">
                <div class="row">
                  <div class="col-md-12">
                    <div class="text-bg">
                      <span>The Best</span>
                      <h1>SINGER EVER</h1>
                      <p>Son Tung MTP is a talented singer in many different genres of music. He once achieved a score of 25.5 at the Ho Chi Minh City Conservatory, the valedictorian score at that time.</p>
                      <a href="#">Music & Entertainment</a>
                      <a href="#" id="button" class="button"> Buy Tickets </a>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
          <div class="carousel-item">

            <div class="container ">
              <div class="carousel-caption">

                <div class="row">
                  <div class="col-md-12">
                    <div class="text-bg">
                        <span>The Best</span>
                      <h1>LIVE SHOW EVER</h1>
                      <p>Son Tung's most impressive saying clearly shows his personality: "If you want to sit in a position that no one can sit, you must bear the feeling that no one can stand." </p>
                      <a href="https://mtpentertainment.com/gallery/">Music & Entertainment</a><a href="#" id="button">Buy Tickets </a>
                    </div>
                  </div>

                </div>
              </div>
            </div>

          </div>


        </div>
     
      <a class="carousel-control-prev" href="#myCarousel" role="button" data-slide="prev">
    <i class="fa fa-long-arrow-left" aria-hidden="true"></i>
     
    </a>
    <a class="carousel-control-next" href="#myCarousel" role="button" data-slide="next">
        <i class="fa fa-long-arrow-right" aria-hidden="true"></i>
      
    </a>
   </div>
    
  

</section>
</div>
</header>
<!-- pop -->
<div class="bg-modal">
    <div class="modal-content">
      <div class="close">
        +
      </div>
      <img src="images/logo.png" alt="">
      <form action="">
        <input class="pop" type="text" placeholder="Ticket">
        <input class="pop" type="text" placeholder="E-mail">
        <a href="cart.jsp" id="button" class="buttonBuy">Buy</a>
      </form>
    </div>

</div>

<!-- pop -->


<!-- about  -->
<div id="about" class="about">
  <div class="container">
    <div class="row display_boxflex">
      <div class="col-xl-6 col-lg-6 col-md-6 col-sm-12">
        <div class="about-box">
          <h2>About Us</h2>
          <p>We are passionate people who always accompany you, we are here to make it easy for you to interact with your idols. Contact us to book your tickets today.</p>
          <a href="https://mtpentertainment.com/">Read More</a>
        </div>
      </div>
      <div class="col-xl-6 col-lg-6 col-md-6 col-sm-12">
        <div class="about-box">
          <figure><img src="images/about.png" alt="#" /></figure>
        </div>
      </div>
    </div>

  </div>
</div>
<!-- end abouts -->




<!-- upcoming -->
<div id="upcoming" class="upcoming">
  <div class="container-fluid padding_left3">
    <div class="row display_boxflex">
      <div class="col-xl-5 col-lg-5 col-md-5 col-sm-12">
       <div class="box_text">
          <div class="titlepage">
            <h2>Upcoming Concerts</h2>
          </div>
          <p>If you have been through Skytour on MTP entertainment or on Netflix and want to see it live once. So don't worry, at the end of this year, Son Tung plans to make a big music show around Vietnam called Skytour2. Let's wait together. </p>
          <a href="./concert">Read More</a>
        </div>
      </div> 
    
      <div class="col-xl-7 col-lg-7 col-md-7 col-sm-12 border_right">
         <div class="upcomimg">
           <figure><img src="images/up.jpg" alt="#"/></figure>
        </div>
          </div>
  </div>
    </div>
</div>
<!-- end upcoming -->

<!-- Gallery -->


<div id="gallery" class="Gallery">
  <div class="container"> 
    <div class="row display_boxflex">
      <div class="col-xl-8 col-lg-8 col-md-8 col-sm-12">
        <div class="row">
          <div class="col-xl-6 col-lg-6 col-md-6 col-sm-12 margi_bott">
            <div class="Gallery_img">
              <figure><img src="images/Gallery1.jpg" alt="#"/></figure>
            </div>
            <div class="hover_box">
             
              <ul class="icon_hu">
                 <h3>Work night</h3>
                <li><a href="#"><img src="icon/h.png" alt="#"/></a></li>
                 <li><a href="#"><img src="icon/h.png" alt="#"/></a></li>
              </ul>
            </div>
          </div>
          <div class="col-xl-6 col-lg-6 col-md-6 col-sm-12 margi_bott">
            <div class="Gallery_img">
              <figure><img src="images/Gallery2.jpg" alt="#"/></figure>
            </div>
            <div class="hover_box">
             
              <ul class="icon_hu">
                 <h3>"Muon roi ma sao con"</h3>
                <li><a href="#"><img src="icon/h.png" alt="#"/></a></li>
                 <li><a href="#"><img src="icon/h.png" alt="#"/></a></li>
              </ul>
            </div>
          </div>
          <div class="col-xl-6 col-lg-6 col-md-6 col-sm-12 margi_bott1">
            <div class="Gallery_img">
              <figure><img src="images/Gallery3.jpg" alt="#"/></figure>
            </div>
            <div class="hover_box">
             
              <ul class="icon_hu">
                 <h3>Korea</h3>
                <li><a href="#"><img src="icon/h.png" alt="#"/></a></li>
                 <li><a href="#"><img src="icon/h.png" alt="#"/></a></li>
              </ul>
            </div>
          </div>
          <div class="col-xl-6 col-lg-6 col-md-6 col-sm-12">
            <div class="Gallery_img">
              <figure><img src="images/Gallery4.jpg" alt="#"/></figure>
            </div>
            <div class="hover_box">
             
              <ul class="icon_hu">
                 <h3>Music night</h3>
                <li><a href="#"><img src="icon/h.png" alt="#"/></a></li>
                 <li><a href="#"><img src="icon/h.png" alt="#"/></a></li>
              </ul>
            </div>
          </div>
        </div>
      </div>
      <div class="col-xl-4 col-lg-4 col-md-4 col-sm-12">
        <div class="Gallery_text">
          <div class="titlepage">
            <h2>Gallery</h2>
          </div>
          <p>Here are some images related to Son Tung MTP. Let's have a look together.</p>
          <a href="https://mtpentertainment.com/gallery/">Read More</a>
        </div>
      </div>
    </div>
  </div>
</div>

<!-- end Gallery --> 




    <!--  footer -->
    <footr>
      <div class="footer ">
        <div class="container">
          <div class="row">
            <div class="col-md-12">
              <form class="contact_bg">
            <div class="row">
              <div class="col-md-12">
                <div class="titlepage">
                  <h2>Contact us</h2>
                </div>
                <div class="col-md-12">
                  <input class="contactus" placeholder="Your Name" type="text" name="Your Name">
                </div>
                <div class="col-md-12">
                  <input class="contactus" placeholder="Your Email" type="text" name="Your Email">
                </div>
                <div class="col-md-12">
                  <input class="contactus" placeholder="Your Phone" type="text" name="Your Phone">
                </div>
                <div class="col-md-12">
                  <textarea class="textarea" placeholder="Message" type="text" name="Message"></textarea>
                </div>
                <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12">
                  <button class="send">Send</button>
                </div>
              </div>
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
          <script src="js/modalHome.js"></script>
          <script src="js/search.js"></script>
          <script src="js/profile-box.js"></script>





          <!-- sidebar -->
          <script src="js/jquery.mCustomScrollbar.concat.min.js"></script>
          <script src="js/custom.js"></script>
          <script src="https:cdnjs.cloudflare.com/ajax/libs/fancybox/2.1.5/jquery.fancybox.min.js"></script>




</body>

</html>