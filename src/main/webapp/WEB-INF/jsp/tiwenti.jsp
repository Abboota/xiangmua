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
<h1 align="center"><button>提问页面</button></h1>
<form align="center" method="post">
    <table align="center" border="1">
        <tr>
            <td align="center" colspan="2">
                <input type="button" value="刷新本页面" onclick="shuaxin()" align="center">
            </td>
        </tr>
        <tr>
            <td align="center">标题</td>
            <td align="center">
                <input type="text" name="tbiaoti" placeholder="请输入标题">
                <input type="hidden" name="tuid" value="${uid}">
            </td>
        </tr>
        <tr>
            <td align="center">内容</td>
            <td align="center">
                <textarea name="tneirong" placeholder="请输入内容" cols="30"   rows="8"></textarea>
            </td>
        </tr>
        <tr>
            <td align="center">问题紧急状态</td>
            <td align="center">
                <input type="radio" name="tdengji" value="1" checked>希望一周内给出答复
                <input type="radio" name="tdengji" value="2">希望两周内给出答复
                <input type="radio" name="tdengji" value="3">希望本月之内内给出答复
            </td>
        </tr>
        <tr>
            <td align="center" colspan="2">
                <input type="button" value="提交" onclick="tiwenti()">
                <button><a href="javascript:history.go(-1)">返回上个页面</a></button>
            </td>
        </tr>
    </table>
</form>

<script type="text/javascript">

    function tiwenti() {
        $.post("${pageContext.request.contextPath}/kjfl/tiwenti2",$("form").serialize(),
            function (data) {
                if (data.success) {
                    alert(data.message);
                }else {
                    alert(data.message);
                }
            },"json");
    }

    function shuaxin() {
        //刷新当前页面
        document.location.reload();
    }
</script>

</body>
</html>