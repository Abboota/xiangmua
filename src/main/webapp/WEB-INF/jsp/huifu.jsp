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
    ${uname}
    <c:if test="${hbiaoshi==1}">教师在</c:if>
    <c:if test="${hbiaoshi==2}">学生在</c:if>
    回复页面</button></h1>
<form method="post">
            <input type="hidden" name="htid" value="${tiWen.tid}">
            <input type="hidden" name="hxuid" value="${tiWen.tuid}">
            <input type="hidden" name="hjuid" value="${uid}">
            <input type="hidden" name="huname" value="${uname}">
            <input type="hidden" name="hbiaoshi" value="${hbiaoshi}">
            <textarea name="hneirong"  placeholder="请输入回复内容" cols="30"   rows="8"></textarea>
            <input type="button" value="刷新本页面" onclick="shuaxin()" align="center">
            <input type="button" value="回复" onclick="huifu()">
            <button><a href="javascript:history.go(-1)">返回上个页面</a></button>
            <input type="button" value="返回主页面" onclick="login('${uid}')">
</form>
<script type="text/javascript">

    //窗体加载完毕之后触发的函数  document Dom对象  $(dom)
    $(document).ready(function () {

    });
    function huifu() {
        $.post("${pageContext.request.contextPath}/kjfl/huifu2",$("form").serialize(),
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