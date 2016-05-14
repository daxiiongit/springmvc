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
        <form:form commandName="book" action="save_book" method="post">
            <%-- fieldset会将表单分组 --%>
            <fieldset>
                <legend>添加一本书</legend>
                <p>
                    <label for="category">图书分类</label>
                    <form:select path="category.id"
                                 id="category" items="${categories}"
                                 itemLabel="name" itemValue="id">
                    </form:select>
                </p>
                <p>
                    <label for="isbn">图书编号</label>
                    <form:input path="isbn" id="isbn"></form:input>
                </p>
                <p>
                    <label for="title">图示标题</label>
                    <form:input path="title" id="title"></form:input>
                </p>
                <p>
                    <label for="author">图书作者</label>
                    <form:input path="author" id="author"></form:input>
                </p>
                <p id="buttons">
                    <input id="reset" type="reset" tabindex="4">
                    <input id="submit" type="submit" tabindex="5" value="提交">
                </p>
            </fieldset>
        </form:form>
    </div>

</body>
</html>
