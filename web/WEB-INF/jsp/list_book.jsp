<%--
    Description: 代码
     
    Created by daxiongit on 2016/5/14 0014.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%-- 加入 jstl 声明 --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>图书信息</title>
</head>
<body>

    <div id="global">
        <h1>图书信息</h1>
        <a href="input_book">添加图书</a>
        <br>
        <table>
            <tr>
                <th>图书分类</th>
                <th>图书编号</th>
                <th>图书标题</th>
                <th>图书作者</th>
                <th>&nbsp;</th>
            </tr>
            <c:forEach items="${books}" var="book">
                <tr>
                    <td>${book.category.name}</td>
                    <td>${book.isbn}</td>
                    <td>${book.title}</td>
                    <td>${book.author}</td>
                    <td><a href="edit_book/${book.id}">编辑</a></td>
                </tr>
            </c:forEach>

        </table>
    </div>

</body>
</html>
