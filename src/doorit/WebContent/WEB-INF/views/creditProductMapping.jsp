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
        <title>Nearguru.com |Credit Product Mapping</title>
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

  
  input:required:valid {
    background-image: url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAYAAAAf8/9hAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAAepJREFUeNrEk79PFEEUx9/uDDd7v/AAQQnEQokmJCRGwc7/QeM/YGVxsZJQYI/EhCChICYmUJigNBSGzobQaI5SaYRw6imne0d2D/bYmZ3dGd+YQKEHYiyc5GUyb3Y+77vfeWNpreFfhvXfAWAAJtbKi7dff1rWK9vPHx3mThP2Iaipk5EzTg8Qmru38H7izmkFHAF4WH1R52654PR0Oamzj2dKxYt/Bbg1OPZuY3d9aU82VGem/5LtnJscLxWzfzRxaWNqWJP0XUadIbSzu5DuvUJpzq7sfYBKsP1GJeLB+PWpt8cCXm4+2+zLXx4guKiLXWA2Nc5ChOuacMEPv20FkT+dIawyenVi5VcAbcigWzXLeNiDRCdwId0LFm5IUMBIBgrp8wOEsFlfeCGm23/zoBZWn9a4C314A1nCoM1OAVccuGyCkPs/P+pIdVIOkG9pIh6YlyqCrwhRKD3GygK9PUBImIQQxRi4b2O+JcCLg8+e8NZiLVEygwCrWpYF0jQJziYU/ho2TUuCPTn8hHcQNuZy1/94sAMOzQHDeqaij7Cd8Dt8CatGhX3iWxgtFW/m29pnUjR7TSQcRCIAVW1FSr6KAVYdi+5Pj8yunviYHq7f72po3Y9dbi7CxzDO1+duzCXH9cEPAQYAhJELY/AqBtwAAAAASUVORK5CYII=);
    background-position: right top;
    background-repeat: no-repeat;
  }
input:focus:required:invalid {
  
  border-color:red ;
  color:black;
  }
</style>
        <style type="text/css">
            .btn-lg
            {
                width:100%;
            }
           
           
            .test{
            border:3px solid red;
            }
        </style>
        <script src="<c:url value="/resources/core/jquery.1.10.2.min.js" />"></script>
        <script src="http://maps.googleapis.com/maps/api/js?sensor=false&amp;libraries=places"></script>
   		<script src="<c:url value="/resources/core/jquery.geocomplete.js" />"></script>
   		   
	<script src="<c:url value="http://bassistance.de/jquery-plugins/jquery-plugin-validation/" />"></script>
	<script src="<c:url value="http://docs.jquery.com/Plugins/Validation/" />"></script>
	<script src="<c:url value="http://docs.jquery.com/Plugins/Validation/validate#toptions" />"></script>
         
	
	      
          <script src="<c:url value="/resources/core/jquery.1.10.2.min.js" />"></script>
        <script src="http://maps.googleapis.com/maps/api/js?sensor=false&amp;libraries=places"></script>
   		<script src="<c:url value="/resources/core/jquery.geocomplete.js" />"></script>
   		   
	<script src="<c:url value="http://bassistance.de/jquery-plugins/jquery-plugin-validation/" />"></script>
	<script src="<c:url value="http://docs.jquery.com/Plugins/Validation/" />"></script>
	<script src="<c:url value="http://docs.jquery.com/Plugins/Validation/validate#toptions" />"></script>

    </head>
    <!-- END HEAD SECTION-->

    <!-- BODY SECTION-->
    <body>
        <!-- HEADER SECTION -->
           <%@ include file="headerStatic.jsp" %>
        
        <div class="container-fluid">
        <div class="row">
            <div class="col-md-12 bg-color">
               <div class="container">
                   <h2 class=""> <a href="#" title=""></a> Create Credit Packages </h2>     
               </div>
           </div>
</div>
       </div>   
		<div class="row" style="margin-top:1%">   
			<div class="col-md-4 col-md-offset-2"><b>Credit Packages <a href="${pageContext.request.contextPath}/admin/creditPack" class="btn btn-danger btn-lg" >Create </a></b></div>
			
		</div>  
		<hr/> 
		   <div class="container-fluid">
        <div class="row">
            <div class="col-md-12 bg-color">
               <div class="container">
                   <h2 class=""> <a href="#" title=""></a> Credit Product Mapping </h2>
               </div>
           </div>
</div>
       </div>   
			<div class="contaier"> 
				<div class="row">
					<div class="col-md-6 col-md-offset-2">
								<c:url var="saveProductMapping" value="/admin/saveProductMapping" ></c:url>
 							<form:form action="${saveProductMapping}" id="saveProductMapping" commandName="creditProductMap">
                            <br>
                              <fieldset>  
                              <div class="form-group">   
                               		
                               		 <label> <b>Product  </b></label> 
                               		 
                               		 
                               		<form:select id="docNo" required="required"  class="form-control invalid cursor" path="productId" oninvalid="this.setCustomValidity('Please select an answer')" oninput="setCustomValidity('')">
							    						  
							    									<c:forEach var="product" items="${productList}">  
   																				<li class="list-group-item"> <form:option label="${product.productName}" value="${product.productId}"  /></li>
																	</c:forEach>  
						     						 </form:select> 
                               <%--  <label for="name"> <b>Full Name </b></label> 
                                  	<form:input    required ="required" maxLength="30" id="username" name="username" type="text" path="name"  class="form-control glowing-border invalid"    oninvalid="this.setCustomValidity('Please enter  name')" oninput="setCustomValidity('')" /> --%>
                              </div>
                                <div id="mobile" class="form-group"> 
                               <label> <b>Credit Point</b> </label>   
                                        
                                            <form:input type="text"   required ="required"    id="mobileInput" maxlength="12" class="form-control invalid" path="creditPoint"  oninvalid="this.setCustomValidity('Please enter credit value')" oninput="setCustomValidity('')"  /> 
                                          </div>    
                              <br>
                              <button  id="btnCreateAccount"  class="btn btn-primary btn-lg">Save</button>
                               
                             </fieldset>  
                                
                          </form:form> 
                           <hr/>  
                          <div class="row">
                          <div class="col-md-2">
                          		<label> <b>Product Id</b></label>
                          	</div>
                          	<div class="col-md-2">
                          		<label><b>Product</b></label>
                          	</div> 
                          	<div class="col-md-2">
                          		<label><b>Credit point</b></label>
                          	</div>
                          	<div class="col-md-4">
                          		<label><b>Updated date</b></label> 
                          	</div>
                          		<div class="col-md-2">
                          		<label><b>Update</b></label> 
                          	</div>
                          	<%-- <div class="col-md-3">
                          		<div class="col-md-2" ><a class="btn btn-danger" href="<c:url value='/admin/updateCreditProductMapping/${product.productId}' />" >Update </a></div>
                          	</div> --%> 
                          </div>
                           <hr/> 
                        <div class="row"> 
                           <c:forEach items="${creditProductMapList}" var="creditProductMap">
						<div class="row" style="margin-top:10px;margin-bottom:10px"> 
						  <div class="col-md-2"> 
                          		<label>${creditProductMap.productId}</label>
                          	</div> 
						 
								<div class="col-md-2" ><b>${creditProductMap.productDesc}</b></div>
								<div class="col-md-2" ><b>${creditProductMap.creditPoint}</b></div> 
								<div class="col-md-4" ><b>${creditProductMap.lastUpdatedDate}</b></div>   
				               	<div class="col-md-2">
                          		<a class="btn btn-danger" href="${pageContext.request.contextPath}/admin/updateCreditProductMapping/${creditProductMap.creditProductId}" >Update</a>
                          	</div> 
                          			 
						</div>  
					</c:forEach>
                          </div>
                        
					</div>
					
                          
					</div>
				</div>  
				
			</div>
            <!-- MAIN SCRIPTS SECTION-->
            <script src="<c:url value="/resources/assets/js/modernizr-2.6.2-respond-1.1.0.min.js" />"></script>
        	
      		 <script src="<c:url value="/resources/assets/js/scrollReveal.js" />"></script>
       
	        <script src="assets/js/scrollReveal.js"></script>
	        <script>
	          //  window.scrollReveal = new scrollReveal(); //please put this script here to show animation at the time of scroll
	        </script>
	        
	       
	        <script src="<c:url value="/resources/assets/plugins/bootstrap/bootstrap.min.js" />"></script>
	        
	        <script src="<c:url value="/resources/assets/plugins/fancybox/jquery.fancybox.pack.js" />"></script>
	        
	       
	        <script src="<c:url value="/resources/assets/scripts/main.js" />"></script>
	        <script src="<c:url value="/resources/assets/scripts/login.js" />"></script>
	        
	       

            <!--END MAIN SCRIPTS SECTION-->


      <!-- footer -->
<%@ include file="footer.jsp" %>  
    </body>

    <!--END  BODY SECTION-->
</html>