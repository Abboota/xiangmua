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
        ${useres.uname}自己所提出的所有问题页面
    </button>
</h1>
<form method="post" align="center" action="${pageContext.request.contextPath}/kjfl/zijiwenti?uid=${useres.uid}">
    <button>标题或内容:</button><input type="text" name="mohu" value="${mohu}"/>
    <input type="submit" value="搜索（包含已解决及未解决）"/>
</form>
<table align="center">
    <tr>
        <td align="center" colspan="4">
            <input type="button" value="已解决" onclick="jiejue('1','${useres.uid}')">
            <input type="button" value="刷新本页面" onclick="shuaxin()" align="center">
            <input type="button" value="${sort==2?'此时问题等级降序':sort==1?'此时问题等级升序':'此时问题等级无序'}">
            <input type="button" value="未解决" onclick="jiejue('2','${useres.uid}')">
        </td>
    </tr>
    <tr>
        <td align="center" colspan="4">
            <input type="button" value="问题等级升序"  onclick="sortData('${useres.uid}','1')">
            <input type="button" value="问题等级无序"  onclick="sortData('${useres.uid}','0')">
            <input type="button" value="问题等级降序"  onclick="sortData('${useres.uid}','2')">
        </td>
    </tr>
</table>
    <c:forEach var="u" items="${pageInfo.list}">
<table align="center">
        <tr>
            <td align="center" bgcolor="#7fff00">标题:${u.tbiaoti}</td>
            <td align="center" bgcolor="#00ced1">问题等级:
                <c:if test="${u.tdengji==1}">希望一周内给出答复</c:if>
                <c:if test="${u.tdengji==2}">希望两周内给出答复</c:if>
                <c:if test="${u.tdengji==3}">希望本月之内内给出答复</c:if>
            </td>
            <td align="center" bgcolor="orange">问题提出时间:
                <fmt:formatDate value="${u.ttime}" pattern="yyyy-MM-dd" />
            </td>
            <td align="center" bgcolor="yellow">是否解决:
                <c:if test="${u.tjiejue==1}">已解决</c:if>
                <c:if test="${u.tjiejue==2}">未解决</c:if>
            </td>
        </tr>
</table>
<table align="center">
        <tr>
            <td align="center" colspan="4" bgcolor="#6495ed">
                ${u.tneirong}
            </td>
        </tr>
        <tr>
            <td align="center" colspan="4" bgcolor="#a9a9a9">
                <input type="button" value="确定解决" onclick="queding('${u.tid}','${u.tjiejue}')">
               <input type="button" value="查看所有回复" onclick="suoyouhuifu('${useres.uid}','${u.tid}')">
            </td>
        </tr>
    <tr>
        <td colspan="4" bgcolor="#e9967a">
            --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        </td>
    </tr>
</table>
    </c:forEach>
<table align="center">
    <tr>
        <td colspan="6" bgcolor="#00ced1">
            <a href="${pageContext.request.contextPath}/kjfl/zijiwenti?page=1&mohu=${mohu}&uid=${useres.uid}">首页</a>
            <a href="${pageContext.request.contextPath}/kjfl/zijiwenti?page=${pageInfo.hasPreviousPage?pageInfo.prePage:1}&mohu=${mohu}&uid=${useres.uid}">上一页</a>
            <a href="${pageContext.request.contextPath}/kjfl/zijiwenti?page=${pageInfo.hasNextPage?pageInfo.nextPage:pageInfo.pages}&mohu=${mohu}&uid=${useres.uid}">下一页</a>
            <a href="${pageContext.request.contextPath}/kjfl/zijiwenti?page=${pageInfo.pages}&mohu=${mohu}&uid=${useres.uid}">尾页</a>
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
        function jiejue(tjiejue,uid) {
            window.location.href="${pageContext.request.contextPath}/kjfl/zijiwenti?uid="+uid+"&tjiejue="+tjiejue;
        }
        function suoyouhuifu(uid,tid) {
            //前往此问题的所有回复页面
            window.location.href="${pageContext.request.contextPath}/kjfl/suoyouhuifu?uid="+uid+"&htid="+tid;
        }
        function sortData(uid,obj) {
            window.location.href="${pageContext.request.contextPath}/kjfl/zijiwenti?uid="+uid+"&sort="+obj;
        }
        function queding(tid,tjiejue) {
            if (tjiejue==2){
                $.post(
                    "${pageContext.request.contextPath}/kjfl/queding",
                    {tid:tid},
                    function (data) {
                        if (data.success) {
                            alert(data.message);
                            //刷新本页面
                            document.location.reload();
                        }else {
                            alert(data.message);
                        }
                    },"json");
            } else {
                alert("此问题已点击确定解决，无法更改")
            }

        }
    </script>

</body>
</html>