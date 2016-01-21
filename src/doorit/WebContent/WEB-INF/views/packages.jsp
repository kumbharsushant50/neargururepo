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
    <title>NearGuru- Pune Locations  </title>
    <meta name="description" content="Nearguru helps you to contact, compare and hire the best service provider near you at a price that is right for you.">
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
        <link id="mainStyle" href="<c:url value="/resources/assets/css/dashboard.css" />" rel="stylesheet" />
      <!-- END MAIN STYLE SECTION-->
  <link id="mainStyle" href="<c:url value="/resources/assets/css/vendor.css" />" rel="stylesheet" />


    <style type="text/css">
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
                   <h2 class="">credits packs</h2>
               </div>
           </div>
</div>
       </div>
   </section>
    <div class="container">
        <div class="row" style="margin-top:30px;margin-bottom:30px">     
   	 <c:forEach var="creditPackage" items="${creditPackList}">
   	 		<div class="col-sm-6 col-md-4">
   	 	 <c:url var="test" value="/buyPack" ></c:url> 
		<form:form  action="${test}" commandName="CreditPack">
			<%--  <div style="border:solid 2px;">  
			 	<div class="header-table color-red">	${creditPackList.creditPoint}
			 	
			 		 <div>credits</div>
                                              <div style="margin-left: 10%;margin-right: 10%;"><hr/></div>
                                            <div>${creditPackList.creditPrice}</div>
                                        </div>  
			 	
			 	
			 	</div> --%>
                                     <div style="border:solid 2px;">
                                    <center>  
                                        <div class="header-table color-red">
                                           	<div style=" margin-top:15px"><font size="10px">${creditPackage.creditPoint}</font></div>
                                            <div>credits</div>
                                              <div style="margin-left: 10%;margin-right: 10%;"><hr/></div>
                                            <div>${creditPackage.creditPrice} - credit Price</div>
                                            
                                             <div>Amount  - ${creditPackage.amount}</div>
                                        </div>  
                                        	<div>${creditPackage.discountOnPack} discount</div>    
                                            
                                            <div>Auto refundable &nbsp;<i class="fa fa-check-square text-info"></i></div>
                                       		 <div>Quote view email &nbsp;<i class="fa fa-check-square text-info"></i></div>
                                           <div style="margin-bottom: 30px"><input type="submit" value="Buy&Send" class="btn btn-info btn-lg"></input></div>
                                 	<form:hidden value="${creditPackage.creditPoint}" path="creditPoint"></form:hidden>
                                 	<form:hidden value="${creditPackage.amount}" path="amount"></form:hidden>
                                 	<form:hidden value="${creditPackage.discountOnPack}" path="discountOnPack"></form:hidden>
                                 
                                   </center>
                                    </div>   
        </form:form>  
		 </div>
   	 	</c:forEach>
   	 	</div>
   	 	</div>
   	 
<%--  <div class="container">
 	
            <section>
            
           <div class="container">
            
            
             <div class="row" style="margin-top:30px;margin-bottom:30px">
             
             	 <c:forEach var="creditPack" items="${CreditPack}">
  				 <c:url var="/admin/creditPackeges" value="/admin/creditPackeges" ></c:url> 
				 <c:set var="index"  value="${index}+1"/>
           		<form:form action="${CreditPack}" commandName="creditPack">
           		 <div class="col-sm-6 col-md-4">
                                    <div style="border:solid 2px;">
                                    <center>  
                                        <div class="header-table color-red">
                                           	<div style=" margin-top:15px"><font size="10px">${creditpack.creditPoint}</font></div>
                                            <div>credits</div>
                                              <div style="margin-left: 10%;margin-right: 10%;"><hr/></div>
                                            <div><c:out value=${creditpack.creditPrice}/></div>
                                        </div>
                                        	<div><c:out value=${creditpack.discountOnPack}/>credits</div>
                                            <div>Auto refundable&nbsp;<i class="fa fa-check-square text-info"></i></div>
                                        <div>Quote view email &nbsp;<i class="fa fa-check-square text-info"></i></div>
                                           <div style="margin-bottom: 30px"><a href="#" class="btn btn-info btn-lg">Buy&Send</a></div>
                                 
                                   </center>
                                    </div>
                                </div>
           		
           		</form:form>
           		</c:forEach>
     
                                     </div>
            
           </div>
            
            </section>
 
 </div> --%>

<!-- footer   -->  
<%@ include file="footer.jsp" %>



<!-- MAIN SCRIPTS SECTION-->

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



</body>

<!--END  BODY SECTION-->
</html>


