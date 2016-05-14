<%--
    Description: 代码
     
    Created by daxiongit on 2016/5/14 0014.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>Title</title>
</head>
<body>

<div id="global">
    <form:form commandName="testConverter" action="save_testConverter" method="post">
        <%-- fieldset会将表单分组 --%>
        <fieldset>
            <legend>添加日期</legend>
            <p>
                <label for="createtime">日期</label>
                <form:input path="createtime" id="createtime"></form:input>
            </p>
            <p id="buttons">
                <input id="submit" type="submit" tabindex="5" value="提交">
            </p>
        </fieldset>
    </form:form>
</div>

</body>
</html>
