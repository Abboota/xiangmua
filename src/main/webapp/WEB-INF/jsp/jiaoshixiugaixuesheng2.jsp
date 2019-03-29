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
        <h1 align="center"><button>教师修改 ${useres.uname} 学生页面</button></h1>
       <form method="post" align="center">
           <table align="center">
               <tr>
                   <td align="center" colspan="2">
                       <input type="button" value="刷新本页面" onclick="shuaxin()" align="center">
                   </td>
               </tr>
               <tr>
                   <td align="center">手机号</td>
                   <td>
                       ${useres.uid}
                       <input type="hidden" name="uid" value="${useres.uid}">
                       <input type="hidden" value="${useres.umima}" name="umima">
                   </td>
               </tr>
               <tr>
                   <td align="center">真实姓名</td>
                   <td><input type="text" name="uname" value="${useres.uname}"></td>
               </tr>
               <tr>
                   <td align="center">选择负责老师</td>
                   <td align="center">
                       <select name="fid">

                           <c:forEach var="j" items="${jingli}">
                               <option value="${j.fid}"
                                       <c:if test="${j.fid==useres.fid}">selected</c:if>
                               >
                                    ${j.fname}
                               </option>
                           </c:forEach>
                       </select>
                   </td>
               </tr>
               <tr>
                   <td align="center">选择属学院</td>
                   <td align="center">
                       <select name="yid">
                           <c:forEach var="y" items="${xueYuans}">
                               <option value="${y.yid}"
                                       <c:if test="${y.yid==useres.yid}">selected</c:if>
                               >
                                    ${y.yname}
                               </option>
                           </c:forEach>
                       </select>
                   </td>
               </tr>
               <tr>
                   <td colspan="2"  align="center">
                       <input type="button" value="修改" onclick="xiugai()">
                       <button><a href="javascript:history.go(-1)">返回上个页面</a></button>
                       <input type="button" value="返回主页面" onclick="zhuye('${ujid}')">
                   </td>

               </tr>
           </table>
       </form>


<script type="text/javascript">

    function xiugai() {
        $.post("${pageContext.request.contextPath}/kjfl/jiaoshixiugaixuesheng3",$("form").serialize(),
            function (data) {
            if (data.success) {
                alert(data.message);
            }else {
                alert(data.message);
            }
        },"json");
    }
    function zhuye(uid) {
        //前往主页面
        window.location.href="${pageContext.request.contextPath}/kjfl/login2?uid="+uid;
    }
    function shuaxin() {
        //刷新当前页面
        document.location.reload();
    }
</script>

</body>
</html>