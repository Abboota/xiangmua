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
        <h1 align="center"><button>教师修改学生的个人信息页面</button></h1>
        <form method="post" align="center" action="${pageContext.request.contextPath}/kjfl/jiaoshixiugaixuesheng?ujid=${ujid}">
            <button>学生名字:</button><input type="text" name="mohu" value="${mohu}"/>
            <input type="submit" value="搜索"/>
        </form>
        <table align="center" border="1">
            <tr>
                <td align="center" colspan="5">
                    <input type="button" value="刷新本页面" onclick="shuaxin()" align="center">
                </td>
            </tr>
            <tr>
                <td align="center">手机号</td>
                <td align="center">真实姓名</td>
                <td align="center">负责老师</td>
                <td align="center">所属学院</td>
                <td align="center">修改</td>
            </tr>
            <c:forEach var="u" items="${pageInfo.list}">
                <tr>
                    <td align="center">${u.uid}</td>
                    <td align="center">${u.uname}</td>
                    <td align="center">
                        ${u.fname}
                    </td>
                    <td align="center">
                           ${u.yname}
                    </td>
                    <td align="center">
                        <input type="button" value="修改" onclick="xiugai('${u.uid}','${ujid}')">
                    </td>
                </tr>
            </c:forEach>
            <tr>
                <td colspan="5">
                    <a href="${pageContext.request.contextPath}/kjfl/jiaoshixiugaixuesheng?page=1&mohu=${mohu}&ujid=${ujid}">首页</a>
                    <a href="${pageContext.request.contextPath}/kjfl/jiaoshixiugaixuesheng?page=${pageInfo.hasPreviousPage?pageInfo.prePage:1}&mohu=${mohu}&ujid=${ujid}">上一页</a>
                    <a href="${pageContext.request.contextPath}/kjfl/jiaoshixiugaixuesheng?page=${pageInfo.hasNextPage?pageInfo.nextPage:pageInfo.pages}&mohu=${mohu}&ujid=${ujid}">下一页</a>
                    <a href="${pageContext.request.contextPath}/kjfl/jiaoshixiugaixuesheng?page=${pageInfo.pages}&mohu=${mohu}&ujid=${ujid}">尾页</a>
                    ${pageInfo.pageNum}/${pageInfo.pages}页    共${pageInfo.total}条数据

                </td>
            </tr>
            <tr>
                <td align="center" colspan="5">
                    <button><a href="javascript:history.go(-1)">返回上个页面</a></button>
                    <input type="button" value="返回主页面" onclick="zhuye('${ujid}')">
                </td>
            </tr>
        </table>

<script type="text/javascript">
    function xiugai(uid,ujid) {
       //前往修改学生信息页面
       window.location.href="${pageContext.request.contextPath}/kjfl/jiaoshixiugaixuesheng2?uid="+uid+"&ujid="+ujid;
    }

    function shuaxin() {
        //刷新当前页面
        document.location.reload();
    }
    function zhuye(uid) {
        //前往主页面
        window.location.href="${pageContext.request.contextPath}/kjfl/login2?uid="+uid;
    }
</script>

</body>
</html>