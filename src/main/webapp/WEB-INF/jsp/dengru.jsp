<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<!--响应式 元信息-->
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/index_work.css" type="text/css"></link>
<!-- jQuery (Bootstrap 的 JavaScript 插件需要引入 jQuery) -->
<script src="${pageContext.request.contextPath}/static/jquery/jquery.min.js"></script>
<!-- 包括所有已编译的插件 -->
<script src="${pageContext.request.contextPath}/static/bootstrap/js/bootstrap.js"></script>
<head>
    <title>Title</title>
</head>
<body>
    <h1 align="center"><button >登入页面</button></h1>
    <h2 align="center"><button>${error}</button></h2>
    <form method="post" align="center">
        <table align="center">
            <tr>
                <td align="center" colspan="2">
                    <input type="button" value="刷新本页面" onclick="shuaxin()" align="center">
                </td>
            </tr>
            <tr>
                <td align="center">手机号</td>
                <td><input type="text" name="uid"></td>
            </tr>
            <tr>
                <td align="center">密码</td>
                <td><input type="text" name="umima"></td>
            </tr>
            <tr>
                <td colspan="2"  align="center">
                    <input type="button" value="登入" onclick="dengru()">
                    <input type="button" value="返回主页面" onclick="login('${uxjid}')">
                    <%--<input type="button" value="找回密码" onclick="zhaomima('${uxjid}')">--%>
                </td>

            </tr>
        </table>
    </form>
<script type="text/javascript">

    function dengru() {
        $.post(
            "${pageContext.request.contextPath}/kjfl/dengru2",
            $("form").serialize(),
            function (data) {
                if (data.success) {
                    alert(data.message);
                    //前往主页面  真是姓名 老师学生标示
                    window.location.href="${pageContext.request.contextPath}/kjfl/login2?uid="+data.useres.uid;
                }else {
                    alert(data.message);
                }
            },"json");
    }
    function login(uid) {
        window.location.href="${pageContext.request.contextPath}/kjfl/login2?uid="+uid;
    }
    function zhaomima(uid) {
        window.location.href="${pageContext.request.contextPath}/kjfl/zhaomima?uid="+uid;
    }
    function shuaxin() {
        //刷新当前页面
        document.location.reload();
    }
</script>

</body>
</html>