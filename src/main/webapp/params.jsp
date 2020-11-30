<%--
  Created by IntelliJ IDEA.
  User: sucre
  Date: 2020/10/22
  Time: 14:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Title</title>
    </head>
    <body>
        <h3>请求参数绑定-基本数据类型</h3>
        <a href="param/testParam?username=hehe">请求参数绑定</a>

        <h3>请求参数绑定-实体类型JavaBean</h3>
        <form action="param/saveAccount" method="post">
            姓名：<input type="text" name="username"><br/>
            用户密码：<input type="text" name="password"><br/>
            金额：<input type="text" name="money"><br/>
            <input type="submit" value="保存">
        </form>

        <h3>请求参数绑定-包含引用类型的实体类型JavaBean</h3>
        <form action="param/saveUserAccount" method="post">
            姓名：<input type="text" name="username"><br/>
            用户密码：<input type="text" name="password"><br/>
            金额：<input type="text" name="money"><br/>
            用户名：<input type="text" name="user.uname"><br/>
            用户年龄：<input type="text" name="user.age"><br/>
            <input type="submit" value="保存">
        </form>

        <h3>请求参数绑定-自定义类型转换</h3>
        <form action="param/saveUser" method="post">
            用户名称：<input type="text" name="uname"><br/>
            用户年龄：<input type="text" name="age"><br/>
            用户生日：<input type="text" name="date"><br/>
            <input type="submit" value="保存">
        </form>
    </body>
</html>
