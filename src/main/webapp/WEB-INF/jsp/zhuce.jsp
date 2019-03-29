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
        <h1 align="center"><button>学生注册页面</button></h1>
       <form method="post" align="center">
           <table align="center">
               <tr>
                   <td align="center" colspan="2">
                       <input type="button" value="刷新本页面" onclick="shuaxin()" align="center">
                   </td>
               </tr>
               <tr>
                   <td align="center">手机号</td>
                   <td><input type="text" name="uid" placeholder="请输入手机号"></td>
               </tr>
               <tr>
                   <td align="center">真实姓名</td>
                   <td><input type="text" name="uname" placeholder="请输入真实姓名"></td>
               </tr>
               <tr>
                   <td align="center">密码</td>
                   <td><input type="text" name="umima" placeholder="请输入密码"></td>
               </tr>
               <tr>
                   <td align="center">选择自己的负责老师</td>
                   <td align="center">
                       <select name="fid">
                           <c:forEach var="j" items="${jingli}">
                               <option value="${j.fid}">
                                    ${j.fname}
                               </option>
                           </c:forEach>
                       </select>
                   </td>
               </tr>
               <tr>
                   <td align="center">选择自己所属学院</td>
                   <td align="center">
                       <select name="yid">
                           <c:forEach var="y" items="${xueYuans}">
                               <option value="${y.yid}">
                                    ${y.yname}
                               </option>
                           </c:forEach>
                       </select>
                   </td>
               </tr>
               <tr>
                   <td colspan="2"  align="center">
                       <input type="button" value="注册" onclick="zhuce()">
                       <button><a href="javascript:history.go(-1)">返回</a></button>
                   </td>

               </tr>
           </table>
       </form>


<script type="text/javascript">

    function zhuce() {
        $.post("${pageContext.request.contextPath}/kjfl/zhuce2",$("form").serialize(),
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