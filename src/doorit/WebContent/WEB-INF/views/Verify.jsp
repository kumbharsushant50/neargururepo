<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <link id="mainStyle" href="<c:url value="/resources/assets/css/vendor.css" />" rel="stylesheet" />
        <link rel="shortcut icon" href="<c:url value="/resources/assets/img/favicon.ico" />" />
          <link href="<c:url value="/resources/assets/plugins/font-awesome/font-awesome.css" />" rel="stylesheet">     
   <link href="<c:url value="/resources/assets/plugins/bootstrap/bootstrap.css" />" rel="stylesheet" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Nearguru- Vendor Verify</title>
<style type="text/css">
		.tg  {border-collapse:collapse;border-spacing:0;border-color:#ccc;}
		.tg td{font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#fff;}
		.tg th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#f0f0f0;}
		.tg .tg-4eph{background-color:#f9f9f9}
	</style>
</head>
<body>
	
          <div>
            <c:url var="uploads" value="/admin/uploads" ></c:url>
           <form:form action="${uploads}" commandName="document" enctype="multipart/form-data" > 
                <div >
                        <label><b>Upload doc</b></label>
	                    <input type="file" name="file" id="file"></input>
                </div>
                        <input type="submit" value="Submit"/>
               </form:form>
               <div >
                    <label><b>Download File</b></label>
          			<label><a href="${pageContext.request.contextPath}/downloadfile/${5}"/>Dowloand</a></label>
              </div>
               <br>
                 <div >
               <%--  <c:choose>
              	 <img src="<c:url value="/uploadpic/${2}" />" >
                <c:otherwise>
                  <img src="<c:url value="/resources/assets/img/imgPlace.jpg" />" class="img-responsive img-circle" alt="avatar" >
                 </c:otherwise>
                 </c:choose> 
                 --%>
                 
                  </div>
                 
                 
                
                 
                 <div>
                <%--  <c:url var="ServiceAdvertisement" value="/admin/ServiceAdvertisement" ></c:url>
	            <form:form  action="${ServiceAdvertisement}" commandName="serviceAdvertisement">
				
					 <div class="col-md-5">
					 	<b> Enter Product ID:</b>
						<form:input  path="productId" /> 
					</div>
					 <div class="col-md-5">
					 	<b> Enter Image Url : </b>
							<form:input  path="Text" />
					</div>
					 <div class="col-md-2"> 
					 		<input type="submit" class="btn btn-primary" value="<spring:message text="Submit "/>" />
					</div>
			
				</form:form> --%>
				
				
				
				
				
				
				
				<c:url var="addAction" value="/admin/ServiceAdvertisement/add" ></c:url>
				<form:form action="${addAction}" commandName="serviceAdvertisement">
					<div class="row bg-color" style="margin-top:50px;margin-bottom:50px">
				 	 <div class="col-md-5">
					 		<b>Enter Product Id:</b> 
							<form:input path="productId" />
					 </div>
					 <div class="col-md-5"> 
					 	<b>Enter Text:</b>
						<form:input  path="Text" />
					</div>
					 <div class="col-md-2"> 
					 		<input type="submit" class="btn btn-primary" value="<spring:message text="Submit "/>" />
					</div>
				</div>
				</form:form>
				
</div>  
</body>
</html>