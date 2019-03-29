<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<!--响应式 元信息-->
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/index_work.css" type="text/css"></link>
<!-- jQuery (Bootstrap 的 JavaScript 插件需要引入 jQuery) -->
<script src="${pageContext.request.contextPath}/static/jquery/jquery.min.js"></script>
<head>
    <title>Title</title>
</head>
<body>
<h1 align="center"><button >
    学生评价页面
</button></h1>
<form method="post">
    <table>
        <tr>
            <td>
                <input type="hidden" name="phid" value="${phid}">
                <input type="hidden" name="pxuid" value="${pxuid}">
                <input type="hidden" name="pjuid" value="${pjuid}">
                <textarea name="pneirong"  placeholder="请输入回复内容" cols="30"   rows="8"></textarea>
            </td>
        </tr>
        <tr>
            <td>
                给此教师评分
                <input type="radio" name="jf" value="1" checked="checked">1分
                <input type="radio" name="jf" value="2">2分
                <input type="radio" name="jf" value="3">3分
                <input type="radio" name="jf" value="4">4分
                <input type="radio" name="jf" value="5">5分
            </td>
        </tr>
        <tr>
            <td>
                <input type="button" value="刷新本页面" onclick="shuaxin()" align="center">
                <input type="button" value="评价" onclick="pingjia()">
                <button><a href="javascript:history.go(-1)">返回上个页面</a></button>
                <input type="button" value="返回主页面" onclick="login('${pxuid}')">
            </td>
        </tr>
    </table>
</form>
<script type="text/javascript">

    //窗体加载完毕之后触发的函数  document Dom对象  $(dom)
    $(document).ready(function () {

    });
    function pingjia() {
        $.post("${pageContext.request.contextPath}/kjfl/pingjia2",$("form").serialize(),
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
    function login(uid) {
        window.location.href="${pageContext.request.contextPath}/kjfl/login2?uid="+uid;
    }
</script>

</body>
</html>