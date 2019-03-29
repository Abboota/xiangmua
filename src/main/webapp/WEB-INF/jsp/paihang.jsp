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

<h1 align="center">
    <button>
        <c:if test="${useres.ubiaoshi==1}">${useres.uname}教师在访问</c:if>
        <c:if test="${useres.ubiaoshi==2}">${useres.uname}学生在访问</c:if>
        <c:if test="${useres.ubiaoshi==null}">游客在访问</c:if>
        教师积分排行榜
    </button>
</h1>
<form method="post" align="center" action="${pageContext.request.contextPath}/kjfl/paihang?uid=${useres.uid}">
    <button>教师名字:</button><input type="text" name="mohu" value="${mohu}"/>
    <input type="submit" value="搜索"/>
</form>
<table align="center">
    <tr>
        <td align="center" colspan="4">
            <input type="button" value="升序"  onclick="sortData('${useres.uid}','1')">
            <input type="button" value="${sort==2?'此时降序':'此时升序'}">
            <input type="button" value="降序"  onclick="sortData('${useres.uid}','2')">
        </td>
    </tr>
</table>
<table align="center">
    <tr>
        <td align="center" colspan="4" bgcolor="#6495ed">教师名字</td>
        <td align="center" colspan="4" bgcolor="#6495ed">教师手机号</td>
        <td align="center" colspan="4" bgcolor="#6495ed">教师积分</td>
    </tr>
    <c:forEach var="u" items="${pageInfo.list}">
        <tr>
            <td align="center" colspan="4" bgcolor="#a9a9a9">
               ${u.uname}
            </td>
            <td align="center" colspan="4" bgcolor="#a9a9a9">
               ${u.uid}
            </td>
            <td align="center" colspan="4" bgcolor="#a9a9a9">
               ${u.jf}
            </td>
        </tr>
    </c:forEach>
</table>

<table align="center">
    <tr>
        <td colspan="6" bgcolor="#00ced1">
            <a href="${pageContext.request.contextPath}/kjfl/paihang?page=1&mohu=${mohu}&uid=${useres.uid}">首页</a>
            <a href="${pageContext.request.contextPath}/kjfl/paihang?page=${pageInfo.hasPreviousPage?pageInfo.prePage:1}&mohu=${mohu}&uid=${useres.uid}">上一页</a>
            <a href="${pageContext.request.contextPath}/kjfl/paihang?page=${pageInfo.hasNextPage?pageInfo.nextPage:pageInfo.pages}&mohu=${mohu}&uid=${useres.uid}">下一页</a>
            <a href="${pageContext.request.contextPath}/kjfl/paihang?page=${pageInfo.pages}&mohu=${mohu}&uid=${useres.uid}">尾页</a>
            ${pageInfo.pageNum}/${pageInfo.pages}页    共${pageInfo.total}条数据

        </td>
    </tr>
    <tr>
        <td align="center" colspan="4" bgcolor="#ff7f50">
            <button><a href="javascript:history.go(-1)">返回上个页面</a></button>
            <input type="button" value="返回主页面" onclick="zhuye('${useres.uid}')">
        </td>
    </tr>
</table>

    <script type="text/javascript">

        //窗体加载完毕之后触发的函数  document Dom对象  $(dom)
        $(document).ready(function () {

        });
        function zhuye(uid) {
            //前往主页面
            window.location.href="${pageContext.request.contextPath}/kjfl/login2?uid="+uid;
        }
        function sortData(uid,obj) {
            window.location.href="${pageContext.request.contextPath}/kjfl/paihang?uid="+uid+"&sort="+obj;
        }
    </script>

</body>
</html>