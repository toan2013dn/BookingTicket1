
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <link rel="stylesheet" href="css/style1.css">
        <script src="https://kit.fontawesome.com/ad77abeb9b.js" crossorigin="anonymous"></script>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
    </head>
    <body>
        <c:if test="${sessionScope.acc !=null}">

        <div class="container-x1">
            <div class="table-title">
                <div class="row">
                    <div class="col-sm-5">
                        <h1>MTB's User Management</h1>
                    </div>
                    <div class="col-sm-7">
                        <a href="#" class="btn btn-secondary">
                            <i class="fa-solid fa-square-plus"></i>
                            <span>Add New User</span>
                        </a>
                    </div>
                </div>
            </div>
            
                <tr>
                    <th>ID<th>
                    <th>Name</th> 
                    <th>Email</th>
                    <th>Phone</th>
                    <th>Number of Ticket</th>
                    <th>Manage</th>
                </tr>
                <tr> <c:forEach items="q" >
                    <td><div>${sessionScope.acc.uID}</div></td>  
                    <td><div>${sessionScope.acc.firstname} ${sessionScope.acc.lastname}</div></td>    
                    <td><div>${sessionScope.acc.email}</div></td>   
                    <td><div>${sessionScope.acc.phonenumber}</div></td>   
                    <td><div>${sessionScope.acc.nOt}</div></td>   
                    <td><div>
                        <button type="button" class="btn btn-outline-info btn-circle btn-lg btn-circle"><i class="fa fa-key"></i> </button>
                        <button type="button" class="btn btn-outline-info btn-circle btn-lg btn-circle ml-2"><i class="fa fa-trash"></i> </button>
                        <button type="button" class="btn btn-outline-info btn-circle btn-lg btn-circle ml-2"><i class="fa fa-edit"></i> </button>
                        <button type="button" class="btn btn-outline-info btn-circle btn-lg btn-circle ml-2"><i class="fa fa-upload"></i> </button>
                        </div>
                    </td>
                    </c:forEach>
                </tr>
      
                </c:if>
                    </td>
                </tr>
            
        </div>
    </body>
</html>