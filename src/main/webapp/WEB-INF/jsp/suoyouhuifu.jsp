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
                <c:if test="${hbiaoshi==1}">所有教师回复页面</c:if>
                <c:if test="${hbiaoshi==2}">所有学生回复页面</c:if>
                <c:if test="${hbiaoshi==null}">回复页面</c:if>
            </button>
        </h1>
           <table align="center" border="1">
               <tr>
                   <td  align="center" colspan="<c:if test="${hbiaoshi==1}">3</c:if><c:if test="${hbiaoshi!=1}">2</c:if>">
                       <input type="button" value="查看所有学生回复" onclick="suoyouhuifu('${uid}','${htid}','2')">
                       <input type="button" value="查看所有回复" onclick="suoyouhuifu('${uid}','${htid}','')">
                       <input type="button" value="查看所有教师回复" onclick="suoyouhuifu('${uid}','${htid}','1')">
                   </td>
               </tr>
               <tr>
                   <td align="center">回复内容</td>
                   <td align="center">回复人</td>
                   <c:if test="${hbiaoshi==1}">
                       <td>
                           评价
                       </td>
                   </c:if>
               </tr>
               <c:forEach var="u" items="${pageInfo.list}">
                   <tr>

                       <td align="center">${u.hneirong}</td>
                       <td align="center">${u.huname}</td>
                       <c:if test="${hbiaoshi==1}">
                           <td>
                               <input type="button" value="
                                     <c:if test="${u.hpingjia!=1}">评价</c:if>
                                     <c:if test="${u.hpingjia==1}">追加评价 </c:if>
                                 " onclick="pingjia('${u.hid}','${u.hxuid}','${u.hjuid}')">

                           </td>
                       </c:if>
                   </tr>
               </c:forEach>
               <tr>
                   <td colspan="<c:if test="${hbiaoshi==1}">3</c:if><c:if test="${hbiaoshi!=1}">2</c:if>">
                       <a href="${pageContext.request.contextPath}/kjfl/suoyouhuifu?page=1?uid=${uid}&htid=${htid}">首页</a>
                       <a href="${pageContext.request.contextPath}/kjfl/suoyouhuifu?page=${pageInfo.hasPreviousPage?pageInfo.prePage:1}&uid=${uid}&htid=${htid}">上一页</a>
                       <a href="${pageContext.request.contextPath}/kjfl/suoyouhuifu?page=${pageInfo.hasNextPage?pageInfo.nextPage:pageInfo.pages}&uid=${uid}&htid=${htid}">下一页</a>
                       <a href="${pageContext.request.contextPath}/kjfl/suoyouhuifu?page=${pageInfo.pages}&uid=${uid}&htid=${htid}">尾页</a>
                       ${pageInfo.pageNum}/${pageInfo.pages}页    共${pageInfo.total}条数据

                   </td>
               </tr>
               <tr>
                   <td align="center" colspan="<c:if test="${hbiaoshi==1}">3</c:if><c:if test="${hbiaoshi!=1}">2</c:if>">
                       <button><a href="javascript:history.go(-1)">返回上个页面</a></button>
                       <input type="button" value="刷新本页面" onclick="shuaxin()" align="center">
                       <input type="button" value="返回主页面" onclick="zhuye('${uid}')">
                   </td>
               </tr>
           </table>


<script type="text/javascript">

    function zhuye(uid) {
        //前往主页面
        window.location.href="${pageContext.request.contextPath}/kjfl/login2?uid="+uid;
    }

    function shuaxin() {
        //刷新当前页面
        document.location.reload();
    }
    function suoyouhuifu(uid,tid,hbiaoshi) {
        //前往关于此问题的所有回复
        window.location.href="${pageContext.request.contextPath}/kjfl/suoyouhuifu?uid="+uid+"&htid="+tid+"&hbiaoshi="+hbiaoshi;
    }
    function pingjia(phid,pxuid,pjuid) {
        //前往关于此问题的所有回复
        window.location.href="${pageContext.request.contextPath}/kjfl/pingjia?phid="+phid+"&pxuid="+pxuid+"&pjuid="+pjuid;

    }
</script>

</body>
</html>