<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<%-- it acts as directory to check from where is is importing --%>


<html>
<head>
<style>
    body{
        font-family: Arial;
        background:#f2f2f2;
    }
    .box{
        width: 300px;
        margin: 100px auto;
        padding: 20px;
        background: white;
        border-radius: 8px;
        box-shadow: 0 0 10px #aaa;
    }
    input{
        width: 100%;
        padding: 6px;
        margin-top: 4px;
    }
    button{
        margin-top: 10px;
        width: 100%;
        padding: 8px;
        background: #4CAF50;
        color: white;
        border: none;
        cursor: pointer;
    }
</style>
</head>

<body>

<div class="box">
<form:form action="login" method="post" modelAttribute="LoginPage">

    UserID:<br/>
    <form:input path="UID"/><br/><br/>

    PassID:<br/>
    <form:password path="PWD"/><br/><br/>

    <button type="submit">Login</button>

</form:form>
</div>

</body>
</html>