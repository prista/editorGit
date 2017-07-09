<%--
  Created by IntelliJ IDEA.
  User: victor
  Date: 09.06.17
  Time: 12:28
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="../css/bootstrap.min.css"/>
    <script src="../js/bootstrap.min.js"></script>
</head>

<body>
<div class="container">
    <nav class="nav navbar-default">
        <div class="container-fluid">
            <div class="navbar-header">
                <h2>Employees</h2>
            </div>
        </div>
    </nav>
    <!--Search Form -->
    <form action="/employee" method="get" id="seachEmployeeForm" role="form">
        <input type="hidden" id="searchAction" name="searchAction" value="searchByName">
        <div class="form-group col-xs-5">
            <input type="text" name="employeeName" id="employeeName" class="form-control" required="true" placeholder="Type the Name or Last Name of the employee"/>
        </div>
        <button type="submit" class="btn btn-info">
            <span class="glyphicon glyphicon-search"></span> Search
        </button>
        <br></br>
        <br></br>
    </form>

    <!--Employees List-->
    <form action="/employee" method="post" id="employeeForm" role="form" >

        <c:choose>
            <c:when test="${not empty employeeList}">
                <div class="table-respondive">
                    <table  class="table table-striped table-bordered table-hover">
                        <thead>
                        <tr class="active">
                            <th>#</th>
                            <th>Name</th>
                            <th>Last name</th>
                            <th>Birth date</th>
                            <th>Role</th>
                            <th>Department</th>
                            <th>E-mail</th>
                        </tr>
                        </thead>
                        <c:forEach var="employee" items="${employeeList}">
                            <c:set var="classSucess" value=""/>
                            <c:if test ="${idEmployee == employee.id}">
                                <c:set var="classSucess" value="info"/>
                            </c:if>
                            <tr class="${classSucess}">
                                <td>${employee.id}</td>
                                <td>${employee.name}</td>
                                <td>${employee.lastName}</td>
                                <td>${employee.birthDate}</td>
                                <td>${employee.role}</td>
                                <td>${employee.department}</td>
                                <td>${employee.email}</td>

                            </tr>
                        </c:forEach>
                    </table>
                </div>
            </c:when>
            <c:otherwise>
                <br>
                <div class="alert alert-info">
                    No people found matching your search criteria
                </div>
            </c:otherwise>
        </c:choose>
    </form>

</div>
</body>
</html>