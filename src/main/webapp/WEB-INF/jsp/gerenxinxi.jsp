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
        <h1 align="center"><button>${useres.uname}的个人信息页面</button></h1>
        <h2 align="center" >
            <c:if test="${useres.ubiaoshi==1}"><button>若有其他想要修改的信息，请您去数据库手动修改</button></c:if>
            <c:if test="${useres.ubiaoshi==2}"><button>若有其他想要修改的信息，请私下联系带您的老师</button></c:if>
        </h2>
        <form method="post">
           <table align="center" border="1">
               <tr>
                   <td align="center" colspan="4">
                       <input type="button" value="刷新本页面" onclick="shuaxin()" align="center">
                   </td>
               </tr>
               <tr>
                   <td align="center">手机号</td>
                   <td align="center">密码</td>
                   <td align="center">负责经理</td>
                   <td align="center">所属学院</td>
               </tr>
               <tr>
                   <td align="center">${useres.uid}</td>
                   <td align="center">
                       <input type="text" value="${useres.umima}" name="umima">
                       <input type="hidden" value="${useres.uid}" name="uid">
                   </td>
                   <td align="center">
                       ${useres.fname}<c:if test="${useres.ubiaoshi==1}">您自己就是项目经理</c:if>
                   </td>
                   <td align="center">
                       ${useres.yname}
                   </td>
               </tr>
               <tr>
                   <td align="center" colspan="4">
                       <button><a href="javascript:history.go(-1)">返回</a></button>
                       <input type="button" value="修改" onclick="xiugai()">
                   </td>
               </tr>
           </table>
        </form>

<script type="text/javascript">

    function xiugai() {
        if(window.confirm("确认修改吗?")){
            $.post("${pageContext.request.contextPath}/kjfl/gerenxinxi2",$("form").serialize(),
                function (data) {
                    if (data.success) {
                        alert(data.message);
                        //前往登入页面
                        window.location.href="${pageContext.request.contextPath}/kjfl/dengru";
                    }else {
                        alert(data.message);
                    }
                },"json");
        }
    }

    function shuaxin() {
        //刷新当前页面
        document.location.reload();
    }
</script>

</body>
</html>