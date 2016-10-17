<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/9/28
  Time: 23:05
  To change this template use File | Settings | File Templates.
--%>
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
        /*      alert(data);*/
        /* if(data==true){
         alert("成功")
         else(
         alert("失败")
         )
         }*/
        $(function () {
            $("#btn").click(function () {
                $.post("addtopic", {"tid": $("#tid").val(), "tname": $("#tname").val()}, function (data) {
                    $("msg").fadeOut(1000);
                    if (data == true) {
                        $("#msg").removeClass("alert-danger").addClass("alert alert-success")
                        $("#msg").html("成功！")

                    } else {
                        $("#msg").html("失败！")
                        $("#msg").removeClass("alert-success").addClass("alert alert-danger")
                    }
                        $("msg").fadeIn(3000);

                });
            });
        }) ;


    </script>
</head>
<body>
<table style="width: 60%;" align="center" class="table table-bordered">
    <tr>
        <td align="center"><h2>新增主题</h2></td>

    </tr>
    <tr>
        <td>
            <div class="form-group">
                <div class="input-group">
                    <div class="input-group-addon">主题ID</div>
                    <input class="form-control" type="text" name="tid" id="tid" placeholder="主题ID">
                </div>
            </div>
        </td>
    </tr>
    <tr>
        <td>
            <div class="form-group">
                <div class="input-group">
                    <div class="input-group-addon">主题名称</div>
                    <input class="form-control" type="text" name="tname" id="tname" placeholder="主题名称">
                </div>
            </div>
        </td>
    </tr>
    <tr>
        <td align="right">
            <button type="button" id="btn" class="btn btn-success">新增主题</button>
        </td>

    </tr>

</table>
<div id="msg"  style="width: 60%;margin: 0 auto"></div>


</body>
</html>
