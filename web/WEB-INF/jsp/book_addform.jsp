<%--
    Description: 代码
     
    Created by daxiongit on 2016/5/14 0014.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>form 标签</title>
</head>
<body>

    <form:form commandName="book" action="save_book" method="post">

    </form:form>


    <form:input path="bookname" id="bookname"/>
    <form:input path="user.username" id="username"/>

    <form:password path="user.password" showPassword="false" id="password"/>

    <form:hidden path="usernameid" id="usernameid"/>

    <form:textarea id="note" path="note" rows="5" cols="10"/>

    <form:checkbox path="apple" value="苹果"/>

    <form:checkboxes path="category" items="${cateforyList}"/>

    <form:radiobutton path="sex" value="男" label="man"/>
    <form:radiobutton path="helthy" value="好" label="helthy"/>

    <form:radiobuttons path="sexs" items="${sexsList}"/>

    <form:errors path="*"/>
    <form:errors path="usernmae"/>


</body>
</html>
