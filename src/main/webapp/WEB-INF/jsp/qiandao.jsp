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
        <h1 align="center"><button>教师查看签到异常页面信息</button></h1>
        <form method="post" align="center" action="${pageContext.request.contextPath}/kjfl/qiandao2?puid=${puid}">
            <button>学生或教师名字:</button><input type="text" name="mohu" value="${mohu}"/>
            <input type="submit" value="搜索"/>
        </form>
        <table align="center" border="1">
            <tr>
                <td align="center" colspan="7">
                    <input type="button" value="刷新本页面" onclick="shuaxin()" align="center">
                </td>
            </tr>
            <tr>
                <td align="center">手机号</td>
                <td align="center">签到人</td>
                <td align="center">职位</td>
                <td align="center">签到日期</td>
                <td align="center">历史未签到次数</td>
                <td align="center">今天是否签到了</td>
                <td align="center">教师确认此学生是否签到</td>
            </tr>
            <c:forEach var="u" items="${pageInfo.list}">
                <tr>
                    <td align="center">${u.uid}</td>
                    <td align="center">${u.uname}</td>
                    <td align="center">
                        <c:if test="${u.ubiaoshi==1}">教师</c:if>
                        <c:if test="${u.ubiaoshi==2}">学生</c:if>
                    </td>
                    <td align="center">
                        <fmt:formatDate value="${u.qtime}" pattern="yyyy-MM-dd"/>
                    </td>
                    <td align="center">${u.qwcs}</td>
                    <td align="center">
                        <c:if test="${u.qjintian==0}">已签到</c:if>
                        <c:if test="${u.qjintian!=0}">未签到</c:if>
                    </td>
                    <td align="center">
                        <c:if test="${u.qid!=null}">
                            <c:if test="${u.qjintian!=0}">未签到</c:if>
                            <c:if test="${u.qjintian==0}">已签到</c:if>
                        </c:if>
                        <c:if test="${u.qid==null}">
                            <input type="button" value="未签到" onclick="xiugai('${u.uid}')">
                        </c:if>
                    </td>
                </tr>
            </c:forEach>
            <tr>
                <td colspan="7">
                    <a href="${pageContext.request.contextPath}/kjfl/qiandao2?page=1&mohu=${mohu}&puid=${puid}">首页</a>
                    <a href="${pageContext.request.contextPath}/kjfl/qiandao2?page=${pageInfo.hasPreviousPage?pageInfo.prePage:1}&mohu=${mohu}&puid=${puid}">上一页</a>
                    <a href="${pageContext.request.contextPath}/kjfl/qiandao2?page=${pageInfo.hasNextPage?pageInfo.nextPage:pageInfo.pages}&mohu=${mohu}&puid=${puid}">下一页</a>
                    <a href="${pageContext.request.contextPath}/kjfl/qiandao2?page=${pageInfo.pages}&mohu=${mohu}&puid=${puid}">尾页</a>
                    ${pageInfo.pageNum}/${pageInfo.pages}页    共${pageInfo.total}条数据

                </td>
            </tr>
            <tr>
                <td align="center" colspan="7">
                    <button><a href="javascript:history.go(-1)">返回上个页面</a></button>
                    <input type="button" value="返回主页面" onclick="zhuye('${puid}')">
                </td>
            </tr>
        </table>

<script type="text/javascript">
    function xiugai(uid) {
            $.post
            ("${pageContext.request.contextPath}/kjfl/weiqiandao",
                {uid:uid},
                function (data) {
                    if (data.success) {
                        alert(data.message);
                        //刷新当前页面
                        document.location.reload();
                    }else {
                        alert(data.message);
                    }
                },"json");
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