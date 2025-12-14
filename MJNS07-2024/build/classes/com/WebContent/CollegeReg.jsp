<!DOCTYPE html>
<%@page import="java.util.List"%>
<%@page import="java.util.Iterator"%>
<%@page import="com.dao.DBConnection"%>
<html lang="en">
	

<head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Home - Education Theme</title>
        <!-- Bootstrap -->
        <link href="css/bootstrap.css" rel="stylesheet">
        <!-- DL Menu CSS -->
        <link href="js/dl-menu/component.css" rel="stylesheet">
        <!--SLICK SLIDER CSS-->
        <link rel="stylesheet" type="text/css" href="css/slick.css"/>
        <!-- Font Awesome StyleSheet CSS -->
        <link href="css/font-awesome.min.css" rel="stylesheet">
        <!-- Font Awesome StyleSheet CSS -->
        <link href="css/svg.css" rel="stylesheet">
        <!-- Pretty Photo CSS -->
        <link href="css/prettyPhoto.css" rel="stylesheet">
        <!-- Shortcodes CSS -->
        <link href="css/shortcodes.css" rel="stylesheet">
        <!-- Widget CSS -->
        <link href="css/widget.css" rel="stylesheet">
        <!-- Typography CSS -->
        <link href="css/typography.css" rel="stylesheet">
        <!-- Custom Main StyleSheet CSS -->
        <link href="style.css" rel="stylesheet">
        <!-- Color CSS -->
        <link href="css/color.css" rel="stylesheet">
        <!-- Responsive CSS -->
        <link href="css/responsive.css" rel="stylesheet">
    </head>
    <body>
        <!--iqoniq Wrapper Start-->  
        <div class="iq_wrapper">
            <!--Header Wrap Start-->
            <header class="iq_header_1">
            	<div class="container">
                	<!--Logo Wrap Start-->
                	<div class="iq_logo">
                    	<a href="#"><img src="images/logo.jpg" alt="Iqoniq Themes"></a>
                    </div>
                    <!--Logo Wrap Start-->
                    <!--Top Strip Wrap Start-->
                    <div class="iq_ui_element">
                        <!--Top Strip Wrap Start-->
                        <div class="iq_top_strip">
                        	<div class="iq_top_contact pull-left">
                            	<a href="#"> Call us : +91 9581022022</a>
                                <a href="#"> Email :  info@info.com</a>
                            </div>
                            <div class="iq_time_wrap pull-right"><i class="fa fa-clock-o"></i> Mon - Sat : 09:00 am - 07:30 pm </div>
                        </div>
                        <!--Top Strip Wrap End-->
                        <!--Navigation wrap Start-->
                        <div class="navigation-wrapper pull-left">
                            <div class="navigation pull-left">
                            	<ul>
            						<li class="active"><a href="index-2.html">Home</a></li>
                                    <li><a href="UniversityLogin.jsp">Admin Login</a></li>
                                     <li><a href="CollegeLogin.jsp">University Login</a></li>
            						<li><a href="#">Colleges</a>
            							<ul class="children">
            								<li><a href="CollegeReg.jsp">Register</a></li>
            								<li><a href="CollegeLog.jsp">Login</a></li>
            								
            							</ul>
            						</li>
            						<li><a href="#">Data Analysis Model</a>
            							<ul class="children">
            								<li><a href="DataAnalysisModel.jsp">Login Page</a></li>
            								
            							</ul>
            						</li>
            						<li><a href="#">Alarm Process Model</a>
            						<ul class="children">
            								<li><a href="AlarmProcessingModel.jsp">Login Page</a></li>
            								
            							</ul>
            						</li>
            						
            						
            						<!-- <li><a href="contact-us.html">Countact Us</a></li> -->
            					</ul>
                            </div>
                            <!--DL Menu Start-->
                            <div id="mg-responsive-navigation" class="dl-menuwrapper">
                                <button class="dl-trigger">Open Menu</button>
                                <ul class="dl-menu">
                                    <li class="menu-item mg-parent-menu">
                                        <a href="index-2.html">home</a>
                                    </li>
                                    <li><a href="about-us.html">About us</a></li>
                                    <li class="menu-item mg-parent-menu"><a href="#">course</a>
                                        <ul class="dl-submenu">
                                           <li><a href="course-detail.html">course detail</a></li>
            								<li><a href="courses-small.html">Courses Small</a></li>
            								<li><a href="our-courses-list.html">Our Courses List</a></li>
            								<li><a href="our-courses.html">Our Courses</a></li>
                                        </ul>
                                    </li>
                                    <li class="menu-item mg-parent-menu"><a href="#">Blog</a>
                                        <ul class="dl-submenu">
                                            <li><a href="blog-large.html">Blog Large</a></li>
            								<li><a href="blog-medium.html">blog medium</a></li>
            								<li><a href="blog-small.html">Blog small</a></li>
            								<li><a href="blog-detail.html">Blog Detail</a></li>
                                        </ul>
                                    </li>
                                    <li class="menu-item mg-parent-menu"><a href="#">Event</a>
                                    	<ul class="dl-submenu">
                                    		<li><a href="event-detail.html">Event Detail</a></li>
            								<li><a href="event-calender.html">Even Calender</a></li>
            							</ul>
                                    </li>
                                    <li class="menu-item mg-parent-menu"><a href="#">Staff</a>
                                        <ul class="dl-submenu">
                                            <li><a href="our-teachers.html">Our Staff</a></li>
            								<li><a href="staff-detail.html">Staff Detail</a></li>
                                        </ul>
                                    </li>
                                    <li class="menu-item mg-parent-menu"><a href="#">Gallery</a>
                                    	<ul class="dl-submenu">
            	                        	<li><a href="gallery-medium.html">Gallery medium</a></li>
            								<li><a href="gallery-small.html">Gallery small</a></li>
            								<li><a href="gallery-mesnory.html">Masonry Gallery</a></li>
            							</ul>
                                    </li>
                                    <li class="menu-item mg-parent-menu">
                                    	<a href="contact-us.html">contact us</a>
                                    </li>
                                </ul>
                            </div>
                            <!--DL Menu END-->
                            <!--Search Wrap Start-->
                            <div class="iq_search pull-right">
                                <button data-toggle="modal" data-target="#search-box"><i class="fa fa-search"></i></button>
                            </div>
                        	<!--Search Wrap End-->
                        </div>
                        <!--Navigation wrap End-->
                    </div>
                    <!--Top Strip Wrap End-->
                </div>
            </header>
            <!--Header Wrap End-->
            <!--Banner Wrap Start-->
			            	<!--Search Wrap End-->
			            </div>
			            <!--Navigation wrap End-->
			        </div>
			        <!--Top Strip Wrap End-->
			    </div>
			</header>
			<style>
   .college-registration-section {
    background-color: #f0f4f8; /* Light background for contrast */
    padding: 60px 0;
}

.form-box {
    background-color: #ffffff;
    border-radius: 10px;
    box-shadow: 0 4px 20px rgba(0, 0, 0, 0.1);
    padding: 40px;
    margin: auto;
}

h1 {
    font-size: 2.5rem;
    color: #333;
    text-align: center;
}

h1 span {
    color: #007bff; /* Primary color */
}

.form-group {
    margin-bottom: 20px;
}

label {
    font-size: 18px;
    color: #333;
    display: block;
    margin-bottom: 5px;
}

.form-control {
    width: 100%;
    padding: 10px;
    font-size: 16px;
    border: 1px solid #ced4da; /* Light border color */
    border-radius: 5px;
    transition: border-color 0.3s;
}

.form-control:focus {
    border-color: #007bff; /* Focused border color */
    outline: none;
}

.about-btn {
    background-color: #007bff; /* Primary button color */
    color: white;
    border: none;
    padding: 10px 20px;
    border-radius: 5px;
    font-size: 16px;
    cursor: pointer;
    transition: background-color 0.3s;
    margin-right: 10px; /* Space between buttons */
}

.about-btn:hover {
    background-color: #0056b3; /* Darker shade on hover */
}

@media (max-width: 768px) {
    .form-box {
        padding: 20px;
    }

    h1 {
        font-size: 2rem;
    }
}
</style>
 <%    /*  String cserver=(String)session.getAttribute("sname"); */
		String sql = "select * from regcollege";
		List<String> lt = DBConnection.getCServer(sql);
		Iterator<String> itr = lt.iterator();
		%>
			
			<!--Header Wrap End-->
			<!--Banner Wrap Start-->
			<div class="iner_banner">
				<div class="container">
					<h5>College</h5>
					<div class="banner_iner_capstion">
						<ul>
							<li><a href="#">Home</a></li>
							<li><a href="#">About Us</a></li>
						</ul>
					</div>
				</div>
			</div>
			<!--Banner Wrap End-->
			<!--Iqoniq Content Start-->
			<div class="iq_content_wrap">
				<!--About Us START-->  
			<!-- University Login Section START -->  
<
<!-- Store College Data Section START -->
<!-- College Registration Section START -->
<section class="college-registration-section">
    <div class="container">
        <div class="row justify-content-center">
            <div class="col-md-8 col-sm-12">
                <div class="form-box">
                    <h1 class="mb-4 pb-0">College's<br><span>Registration</span></h1>
                    <form action="CollegeReg" method="post">
                        <div class="form-group">
                            <label for="cname">College Name</label>
                            <input type="text" id="cname" name="cname" class="form-control" required />
                        </div>
                        <div class="form-group">
                            <label for="cid">College ID</label>
                            <input type="text" id="cid" name="cid" class="form-control" required />
                        </div>
                        <div class="form-group">
                            <label for="caddress">College Address</label>
                            <input type="text" id="caddress" name="caddress" class="form-control" required />
                        </div>
                        <div class="form-group">
                            <label for="cpassword">Password</label>
                            <input type="password" id="cpassword" name="cpassword" class="form-control" required />
                        </div>
                        <div class="form-group">
                            <label for="uselection">Select University</label>
                            <select id="uselection" name="uselection" class="form-control" required>
                                <option value="0">----Select University----</option>
                                <%
                                while (itr.hasNext()) {
                                    String vm = itr.next();
                                %>
                                <option value="<%= vm %>"><%= vm %></option>
                                <%
                                }
                                %>
                            </select>
                        </div>
                        <div class="form-group">
                            <button type="submit" class="about-btn">Register</button>
                            <button type="reset" class="about-btn">Reset</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
</section>
             <!--    </div>
            </div>
        </div>
    </div> -->
</section> --> -->

				<!-- Video Wrap Start--> 
				<section class="video-wrap">
					<div class="container">
						<h1>Start Learning New Things</h1>
						<h5>We are the best online course professionals</h5>
						<a href="#" class="play-track"><i class="fa fa-play-circle-o"></i>Watch Video</a>
					</div>
				</section>
				<!-- Video Wrap End--> 
				<!-- <!-- Our Teacher Wrap Start
			    <section>
			    	<div class="container">
			            Heading Wrap Start
			            <div class="iq_heading_1 text-center">
			                <h4>Our <span>Teachers</span></h4>
			                <p>This is Photoshop's version  of Lorem Ipsum. Proin gravida nibh vel velit auctor aliquet. Aenean sollicitudin, </p>
			                <p>lorem quis bibendum auctor, nisi elit consequat ipsum, nec sagittis sem nibh id elit.</p>
			            </div>
			            Heading Wrap End
			            Teacher Wrap List Start
			            <div class="row">
			                Teacher Thumb Start
			            	<div class="col-md-4 col-sm-6">
			                	<div class="iq_teacher_style_1">
			                    	<figure>
			                        	<img src="extra-images/teacher-01.jpg" alt="Image Here">
			                        </figure>
			                        <div class="text">
			                            <h4><a href="#">Anna Doe</a></h4>
			                            <h6>Language Instructor</h6>
			                            <p>This is Photoshop's version  of Lorem Ipsum. Proin gravida nibh vel velit auctor aliquet. Aenean sollicitudinris.</p>
			                            <ul class="iq_footer_social">
			                            	<li><a href="#"><i class="fa fa-facebook"></i></a></li>
			                                <li><a href="#"><i class="fa fa-twitter"></i></a></li>
			                                <li><a href="#"><i class="fa fa-skype"></i></a></li>
			                                <li><a href="#"><i class="fa fa-pinterest"></i></a></li>
			                            </ul>
			                        </div>
			                    </div>
			                </div>
			                Teacher Thumb End
			                Teacher Thumb Start
			                <div class="col-md-4 col-sm-6">
			                	<div class="iq_teacher_style_1">
			                        <div class="text">
			                        	<h4><a href="#">John Doe</a></h4>
			                            <h6>Vice President</h6>
			                            <p>This is Photoshop's version  of Lorem Ipsum. Proin gravida nibh vel velit auctor aliquet. Aenean sollicitudinris.</p>
			                            <ul class="iq_footer_social">
			                            	<li><a href="#"><i class="fa fa-facebook"></i></a></li>
			                                <li><a href="#"><i class="fa fa-twitter"></i></a></li>
			                                <li><a href="#"><i class="fa fa-skype"></i></a></li>
			                                <li><a href="#"><i class="fa fa-pinterest"></i></a></li>
			                            </ul>
			                        </div>
			                       <figure>
			                        	<img src="extra-images/teacher-02.jpg" alt="Image Here">
			                        </figure>
			                    </div>
			                </div>
			                Teacher Thumb End
			                Teacher Thumb Start
			                <div class="col-md-4 hidden-sm">
			                	<div class="iq_teacher_style_1">
			                    	<figure>
			                        	<img src="extra-images/teacher-03.jpg" alt="Image Here">
			                        </figure>
			                        <div class="text">
			                            <h4><a href="#">Sara Adward</a></h4>
			                            <h6>Manager</h6>
			                            <p>This is Photoshop's version  of Lorem Ipsum. Proin gravida nibh vel velit auctor aliquet. Aenean sollicitudinris.</p>
			                            <ul class="iq_footer_social">
			                            	<li><a href="#"><i class="fa fa-facebook"></i></a></li>
			                                <li><a href="#"><i class="fa fa-twitter"></i></a></li>
			                                <li><a href="#"><i class="fa fa-skype"></i></a></li>
			                                <li><a href="#"><i class="fa fa-pinterest"></i></a></li>
			                            </ul>
			                        </div>
			                    </div>
			                </div>
			                Teacher Thumb End
			            </div>
			            Teacher Wrap List End
			        </div>
			    </section>
			    Our Teacher Wrap End -->
			</div> -->
			<!--Iqoniq Content End-->
			<!--Contact Info Wrap End-->
            <!--Footer Wrap Start-->
            <footer class="iq_footer_bg">
            	<div class="container">
            		<div class="row">
                        <!--Widget About Start-->
            			<div class="col-md-3 col-sm-6">
            				<div class="iq_uni_title">
                                <!--Widget Title Start-->
            					<h4>university of <span>education</span></h4>
                                <!--Widget Title End-->
            					<p>Lorem ipsum dolor sit amet elit, sed do eiusmod tempor incididunt ut labore et dolore .</p>
            					<ul>
            						<li><span>Moday - Saturday</span> 08:00- 05:00</li>
            						<li><span>Saturday</span> Second Saturday Closed</li>
            						<li><span>Sunday</span> Closed</li>
            						<li><span>All Government Holidays</span> Closed</li>
            					</ul>
            				</div>
            			</div>
            			<!--Widget About End-->
                        <!--Widget Archive Start-->
            			<div class="col-md-3 col-sm-6">
                            <div class="widget widget_archive">
                                <!--Widget Title Start-->
                                <h5 class="widget-title"><span>Our</span> Services</h5>
                                <!--Widget Title End-->
                                <!--Social Media Start-->
                                <ul>
                                    <li>
                                        <a href="#">Safety & Risk Management</a>
                                    </li>
                                    <li>
                                        <a href="#">Facilities Services</a>
                                    </li>
                                    <li>
                                        <a href="#">University Police</a>
                                    </li>
                                    <li>
                                        <a href="#">Campus Planning</a>
                                    </li>
                                    <li>
                                        <a href="#">Mail Services</a>
                                    </li>
                                    <li>
                                        <a href="#">Facilities IT</a>
                                    </li>
                                </ul>
                                <!--Social Media End-->
                            </div>
            			</div>
                        <!--Widget Archive End-->
                        <!--Widget Flickr Start-->
                        <div class="col-md-3 col-sm-6">
                            <div class="widget widget-flickr">
                                <!-- Widget Title Start-->
                                <h5 class="widget-title"><span>Our</span> Photo</h5>
                                <!-- Widget Title End-->
                                <div class="flickr-wrap">
                                    <a class="flickrbadges" href="#"><img src="extra-images/flickr1.jpg" alt=""></a>
                                    <a class="flickrbadges" href="#"><img src="extra-images/flickr2.jpg" alt=""></a>
                                    <a class="flickrbadges" href="#"><img src="extra-images/flickr3.jpg" alt=""></a>
                                    <a class="flickrbadges" href="#"><img src="extra-images/flickr4.jpg" alt=""></a>
                                    <a class="flickrbadges" href="#"><img src="extra-images/flickr5.jpg" alt=""></a>
                                    <a class="flickrbadges" href="#"><img src="extra-images/flickr6.jpg" alt=""></a>
                                    <a class="flickrbadges" href="#"><img src="extra-images/flickr4.jpg" alt=""></a>
                                    <a class="flickrbadges" href="#"><img src="extra-images/flickr5.jpg" alt=""></a>
                                    <a class="flickrbadges" href="#"><img src="extra-images/flickr6.jpg" alt=""></a>
                                </div>
                            </div>
                        </div>
                        <!--Widget Flickr End-->
                        <!--Widget News Letter Start-->
            			<div class="col-md-3 col-sm-6">
            				<div class="widget iq_footer_newsletter">
                                <!--Widget Title Start-->
                                <h5 class="widget-title"><span>Our</span> Newsletter</h5>
                                <!--Widget Title End-->
            					<p>Lorem ipsum dolor sit amet elit, sed do eiusmod tempor incididunt ut labore et dolore .</p>
                                <form class="iq-input">
                                    <input placeholder="Search ..." type="text">
                                    <label class="iq-input-icon"><input type="submit"></label>
                                </form>
                                <!--Widget Title Start-->
            					<h5 class="widget-title border-none"><span>Our</span> Connected</h5>
                                <!--Widget Title Start-->
            					<ul class="iq_footer_social">
            						<li>
            							<a href="https://www.facebook.com/login/"><i class="fa fa-facebook"></i></a>
            						</li>
            						<li>
            							<a href="https://x.com/i/flow/login"><i class="fa fa-twitter"></i></a>
            						</li>
            						<li>
            							<a href="https://www.instagram.com/accounts/login/?hl=en"><i class="fa fa-instagram"></i></a>
            						</li>
            						<li>
            							<a href="https://in.pinterest.com/login/"><i class="fa fa-pinterest"></i></a>
            						</li>
            					</ul>
            				</div>
            			</div>
                        <!--Widget News Letter End-->
            		</div>
            	</div>
            </footer>
            <!--Footer Wrap End-->
            <!--Copy Right Start-->
			<div class="footer_strip">
				<h5><a target="_blank" href="####">Ahmed</a></h5>
			</div>
			<!--Copy Right End-->
			<!-- Modal -->
			<div class="modal fade" id="search-box" role="dialog">
      			<button type="button" class="close" data-dismiss="modal">&times;</button>
				<div class="modal-dialog">
				  	<!--SEARCH section STARTS-->  
					<div class="iqoniq_courses_search">
						<div class="container">
							<!--Heading Wrap Start-->
			            	<div class="iq_heading_1 text-center">
			                    <h4>Search For<span>Our Courses</span></h4>
			                    <p>Fill The Below Form and Star Searching</p>
			                </div>
			                <!--Heading Wrap End-->  
							<!--iqoniq FORM STARTS-->  
							<div class="row">
								<div class="col-md-3 col-sm-6">
									<!--Iconiq Input STARTS-->
									<div class="iq-input">
										<input class="first_input" type="text" placeholder="Search Words">
									</div>
									<!--Iconiq Input End-->
								</div>
								<div class="col-md-3 col-sm-6">
									<!--Iconiq Input STARTS-->
									<div class="iq-input">
			                            <select name="Category">
			                                <option value="0">Category</option>
			                                <option value="9">Publishing Date</option>
			                                <option value="2">Publishing Date</option>
			                                <option value="3">Publishing Date</option>
			                            </select>
									</div>
									<!--Iconiq Input End-->
								</div>
								<div class="col-md-3 col-sm-6">
									<!--Iconiq Input STARTS-->
									<div class="iq-input">
			                            <select name="Category">
			                                <option value="0">Category</option>
			                                <option value="9">Publishing Date</option>
			                                <option value="2">Publishing Date</option>
			                                <option value="3">Publishing Date</option>
			                            </select>
									</div>
									<!--Iconiq Input End-->
								</div> 
								<div class="col-md-3 col-sm-6">
									<!--Iconiq Input STARTS-->
									<div class="iq-input">
			                            <input class="iq_link_1" type="submit" value="Start Search">
									</div>
									<!--Iconiq Input End-->
								</div>    
							</div> 
							<!--iqoniq FROM END-->  
						</div>
					</div>
					<!--SEARCH section ENDS-->
				</div>
			</div>
        </div>
        <!--iqoniq Wrapper End-->
        <!--Javascript Library-->
        <script src="js/jquery.js"></script>
        <!--Bootstrap core JavaScript-->
        <script src="js/bootstrap.min.js"></script>
        <!--SLICK SLIDER JavaScript-->
        <script src="js/slick.min.js"></script>
        <!--Dl Menu Script-->
        <script src="js/dl-menu/modernizr.custom.js"></script>
        <script src="js/dl-menu/jquery.dlmenu.js"></script>
        <!--Pretty Photo JavaScript-->
        <script src="js/jquery.prettyPhoto.js"></script>
        <!--Image Filterable JavaScript-->
        <script src="js/jquery-filterable.js"></script>
        <!--Number Count (Waypoints) JavaScript-->
        <script src="js/waypoints-min.js"></script>
        <!--Custom JavaScript-->
        <script src="js/custom.js"></script>
    </body>

</html>
