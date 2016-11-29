<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.6.3/css/font-awesome.min.css">
</head>
<body>
<%@include file="header.jsp" %>
<div class="container">
  <h2>Modal Example</h2>
  <!-- Trigger the modal with a button -->
  <button type="button" class="btn btn-info btn-lg" data-toggle="modal" data-target="#myModal">Open Modal</button>

  <!-- Modal -->
  <!--  <div class="modal fade" id="myModal" role="dialog">-->
 
    <div class="modal-dialog">
    
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header">
          <!--  <button type="button" class="close" data-dismiss="modal">&times;</button>-->
          <h4 class="modal-title">Login</h4>
        </div>
        <div class="modal-body">
          
<div align="center">
        <form name="loginForm" commandName="stud" class="form-horizontal" method="post" action="<c:url value="/login" />"> 
		<!--  <div class="form-group">
				 
					<div class="col-sm-5">
						<form:errors path="*"  cssStyle="color:red;"/>
					</div>
				</div>-->
		
            
           <div class="form-group">
				<label for="username" class="col-sm-2 control-label">Username:</label>
					<div class="col-sm-5">
					<div class="input-group">
					<div class="input-group-addon"><i class="fa fa-user fa-fw"></i></div>
						<input type="text" id="username" name="username" class="form-control" placeholder="Enter Your User ID"/>
					</div>
					</div>
			</div>
			
			<div class="form-group">
				<label for="password" class="col-sm-2 control-label"> Password:</label>
					<div class="col-sm-5">
					<div class="input-group">
					<div class="input-group-addon"><i class="fa fa-key fa-fw"></i></div>
						<input type="password" id="password" name="password" class="form-control" placeholder="Enter Your Password"/>
					</div>
					</div>
			</div>
			
			<div class="modal-footer">
          
        
			<div class="form-group">
					<div class="col-sm-10">
						<input type="submit" name="signin" value="Sign In" class="btn btn-success pull-center"/>
						 <a href="<spring:url value="/" />" class="btn btn-danger margin-left25">Cancel</a>
					</div>
		</div> 
		</div>
		     <!--  <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />-->
            </form>
            </div>
            </div>
		</div>
	
        </div>
        
      </div>
      
    </div>
  </div>
  <%@include file="footer.jsp" %>
<a href="blog">click to go to blog</a>

</body>
</html>

