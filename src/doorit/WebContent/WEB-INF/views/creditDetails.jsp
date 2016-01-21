<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>

<!DOCTYPE html>
<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8"> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9"> <![endif]-->
<!--[if gt IE 8]><!-->
<html class="no-js">
    <!--<![endif]-->
    <!-- HEAD SECTION-->
    <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
     <meta name="robots" content="index, follow" />
	<meta name="YahooSeeker" content="INDEX, FOLLOW" />
	<meta name="msnbot" content="INDEX, FOLLOW" />
	<meta name="googlebot" content="INDEX, FOLLOW" />
	<meta name="application-name" content="nearguru" />
	<meta name="allow-search" content="yes" />
	<meta name="robots" content="index, follow" />
	<meta name="service" content=" Business,Sell, " />
	<meta name="document-type" content="Public" />
	<meta name="distribution" content="India" />
	<meta name="category" content=" Business " />
	<meta name="doc-type" content="web page" />
	<meta name="doc-class" content="Published" />
    <title> Nearguru | Hire an Expert Near You</title>
    
       
        <meta name="description" content="">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">   
        <!--[if lt IE 9]><script src="//html5shim.googlecode.com/svn/trunk/html5.js"></script><![endif]-->
        <!-- MAIN STYLE SECTION-->
		<link rel="shortcut icon" href="<c:url value="/resources/assets/img/favicon.ico" />" />
        <link href="<c:url value="/resources/assets/plugins/isotope/isotope.css" />" rel="stylesheet" media="screen" />
        <link href="<c:url value="/resources/assets/plugins/fancybox/jquery.fancybox.css" />" rel="stylesheet" />
        <link href="<c:url value="/assets/plugins/IconHoverEffects-master/css/component.css" />" rel="stylesheet" />
        <link href="<c:url value="/resources/assets/plugins/bootstrap/bootstrap.css" />" rel="stylesheet" />
        <link href="<c:url value="/resources/assets/css/about-achivements.css" />" rel="stylesheet" />
        <link href="<c:url value="/resources/assets/plugins/font-awesome/font-awesome.css" />" rel="stylesheet">    
         <link href='http://fonts.googleapis.com/css?family=Roboto' rel='stylesheet' type='text/css'>
        <link id="mainStyle" href="<c:url value="/resources/assets/css/vendor.css" />" rel="stylesheet" />
                <!-- END MAIN STYLE SECTION-->

  

        <style type="text/css">
		
		
            div.desc{
                background-color: #000;
                bottom:20px;
                color: #fff;
                left: 15px;
                opacity: 0.5;
                position: absolute;
                width: 90%;
                height:50px;
                padding:20px;
                font-size:25px;
            }

            .fix{
                width: 100%;
                padding: 0px;
            }
           
            
            .list-group-item
            {
                border-radius:2px;
            }
        </style>


    </head>
    <!-- END HEAD SECTION-->

    <!-- BODY SECTION-->
    <body>
            
            <!-- HEADER SECTION -->
  <%@ include file="header.jsp" %>
          
         <section>
 <div class="container-fluid">
        <div class="row">
            <div class="col-md-12 bg-color">
               <div class="container">
                   <h2 class=""> <a href="#" title=""></a> Credit Details </h2>
               </div>
           </div>
</div>
       </div>   
   </section>
           
   
  
        <div class="container-fluid"> 
            <!-- END HEADER SECTION -->  
            <!--PAGE CONTENT--> 
            <!-- HOMEPAGE SECTION-->  
          
           
            <section class="section " >  
                <div class="container-fluid" style="margin-top:30px">
                    <div class="row ">
                    <div class="col-md-6 col-sm-6">
                 	<form:form  action="${pageContext.request.contextPath}/creditPackages" commandName="CreditPack"> 
                 	 <%-- 	<form:label path="">Credit point</form:label>    
      					<form:input path="" /> --%> 
      					 <div class="col-md-6 col-sm-6" >Credit Balance</div>
      					  <div class="col-md-6 col-sm-6" >50</div>
      					 <input type="submit" class="btn btn-success btn-lg" id="btnContinue" value="Buy Credit"/>
      					 <div><a href="#">Refer and win Credit</a></div>  
      					 <div><a href="#">Reports</a></div>  
      					 <div><a href="#">Credit used Details</a></div>     
      					 <div><a href="#">Credit Buy Details</a></div> 
      					 <div><a href="#">Product Credit Mapping</a></div>        
                    </form:form>                          
                     </div>
                     </div>
               </div>
                

            </section>

</div>
       


<!-- footer -->
<%@ include file="footer.jsp" %>
       
       

        <!-- MAIN SCRIPTS SECTION-->
       <script src="<c:url value="/resources/assets/js/modernizr-2.6.2-respond-1.1.0.min.js" />"></script>
        	<script src="<c:url value="/resources/assets/js/jquery.js" />"></script>
        
      		 <script src="<c:url value="/resources/assets/js/scrollReveal.js" />"></script>
       
	        <script src="assets/js/scrollReveal.js"></script>
	        <script>
	            window.scrollReveal = new scrollReveal(); //please put this script here to show animation at the time of scroll
	        </script>
	        
	        <script src="<c:url value="/resources/assets/js/jquery.easing.1.3.js" />"></script>
	        <script src="<c:url value="/resources/assets/plugins/bootstrap/bootstrap.min.js" />"></script>
	        <script src="<c:url value="/resources/assets/plugins/isotope/jquery.isotope.min.js" />"></script>
	        <script src="<c:url value="/resources/assets/plugins/fancybox/jquery.fancybox.pack.js" />"></script>
	        <script src="<c:url value="/resources/assets/js/jquery.localscroll-1.2.7-min.js" />"></script>
	        <script src="<c:url value="/resources/assets/js/jquery.appear.js" />"></script>
	        <script src="<c:url value="/resources/assets/scripts/main.js" />"></script>
	        <script src="<c:url value="/resources/assets/scripts/login.js" />"></script>

        <!--END MAIN SCRIPTS SECTION-->


    </div>
</body>

<!--END  BODY SECTION-->
</html>  