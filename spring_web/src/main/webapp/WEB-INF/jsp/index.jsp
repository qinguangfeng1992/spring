<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/9/26
  Time: 15:01
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
    <!-- 新 Bootstrap 核心 CSS 文件 -->
    <link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.0/css/bootstrap.min.css">

    <!-- 可选的Bootstrap主题文件（一般不用引入） -->
    <link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.0/css/bootstrap-theme.min.css">

    <!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
    <script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>

    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
    <script src="http://cdn.bootcss.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
    <script>
        $(document).ready(function () {
            $("#quanxuan").click(function () {
                $(".ch").attr("checked", true);
            });

        });

    </script>
</head>
<body>
<h1 style="font-family: 黑体;text-align: center">欢迎光临大帅哥！</h1>
<hr/>
<table class="table table-striped table-bordered table-hover" style="width: 80%;margin: 0 auto;font-family: 黑体">
    <tr>
        <td>标题ID</td>
        <td>标题名字</td>
        <td>编辑</td>
        <td>删除</td>

    </tr>
    <%-- EL表达式的地方--%>
    <c:forEach items="${list.content}" var="slist">
        <tr>
            <td><input type="checkbox" class="ch" value="${slist.tid}"></td>
            <td>${slist.tname}</td>


            <td>
                <a href="edittop?tid=${slist.tid}" type="button" class="btn btn-primary">编辑</a>
            </td>
            <td>
                <button type="button" class="btn btn-danger" title="${slist.tid}">删除</button>
            </td>
        </tr>


    </c:forEach>

    <tr>
        <td colspan="4" align="right">
            <button type="button" class="btn btn-success" id="quanxuan">全选</button>

            <a href="addtopicindex" type="button" class="btn btn-success">新增</a>
        </td>

    </tr>
</table>
<nav style="text-align: center">
    <ul class="pagination">
        <%-- <c:if test="${currpage<=0}">
           <li><a href="javascript:void(0)">&laquo;</a></li>
         </c:if>

         <c:if test="${currpage>0}">
           <li><a href="topicindex?page=${currpage-1}">&laquo;</a></li>

         </c:if>
         --%>
        <li><a href="topicindex?page=${currpage-1}">&laquo;</a></li>

        <c:forEach var="p" begin="0" end="${list.totalPages-1}">
            <li><a href="topicindex?page=${p}">${p+1}</a></li>
        </c:forEach>

        <li><a href="topicindex?page=${currpage+1}">&raquo;</a></li>
    </ul>
</nav>



<script>
    $(function () {
        $(".btn-danger").click(function () {
            if(confirm("您确认删除吗？")){
                var ssid = $(this).attr("title");
                $.post("deletop", {tid: ssid}, function (data) {
                    if (data == 1) {
                        alert("删除成功")
                        location.reload();
                    } else {
                        alert("删除失败")
                    }
                });
            }
        });


    });
</script>
</body>
</html>
