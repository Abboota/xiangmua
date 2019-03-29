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
        <h1 align="center"><button>审核页面</button></h1>
        <form method="post" align="center" action="${pageContext.request.contextPath}/kjfl/shenhe?ujid=${ujid}">
            <button>学生名字:</button><input type="text" name="mohu" value="${mohu}"/>
            <input type="submit" value="搜索"/>
        </form>
           <table align="center" border="1">
               <tr>
                   <td align="center" colspan="6">
                       <input type="button" value="批量通过" onclick="pitongguo('1')">
                       <input type="button" value="批量不通过" onclick="pitongguo('3')">
                   </td>
               </tr>
               <tr>
                   <td align="center"><input type="checkbox" id="qx">全选</td>
                   <td align="center">手机号</td>
                   <td align="center">真实姓名</td>
                   <td align="center">选择的自己的负责老师</td>
                   <td align="center">选择的自己所属学院</td>
                   <td align="center">审核</td>
               </tr>
               <c:forEach var="u" items="${pageInfo.list}">
                   <tr>
                       <td align="center"><input type="checkbox" class="ck" value="${u.uid}"></td>
                       <td align="center">${u.uid}</td>
                       <td align="center">${u.uname}</td>
                       <td align="center">
                           ${u.fname}
                       </td>
                       <td align="center">
                           ${u.yname}
                       </td>
                       <td align="center">
                           <input type="button" value="通过" onclick="tongguo('1','${u.uid}')">
                           <input type="button" value="不通过" onclick="tongguo('3','${u.uid}')">
                       </td>
                   </tr>
               </c:forEach>
               <tr>
                   <td colspan="6">
                       <a href="${pageContext.request.contextPath}/kjfl/shenhe?page=1&mohu=${mohu}&ujid=${ujid}">首页</a>
                       <a href="${pageContext.request.contextPath}/kjfl/shenhe?page=${pageInfo.hasPreviousPage?pageInfo.prePage:1}&mohu=${mohu}&ujid=${ujid}">上一页</a>
                       <a href="${pageContext.request.contextPath}/kjfl/shenhe?page=${pageInfo.hasNextPage?pageInfo.nextPage:pageInfo.pages}&mohu=${mohu}&ujid=${ujid}">下一页</a>
                       <a href="${pageContext.request.contextPath}/kjfl/shenhe?page=${pageInfo.pages}&mohu=${mohu}&ujid=${ujid}">尾页</a>
                       ${pageInfo.pageNum}/${pageInfo.pages}页    共${pageInfo.total}条数据

                   </td>
               </tr>
               <tr>
                   <td align="center" colspan="6">
                       <button><a href="javascript:history.go(-1)">返回上个页面</a></button>
                       <input type="button" value="刷新本页面" onclick="shuaxin()" align="center">
                       <input type="button" value="返回主页面" onclick="zhuye('${ujid}')">
                   </td>
               </tr>
           </table>


<script type="text/javascript">

    //窗体加载完毕之后触发的函数  document Dom对象  $(dom)
    $(document).ready(function () {
        //全选
        $("#qx").click(function () {
            $(".ck").each(function () {
                this.checked=$("#qx")[0].checked;
            });
        });
    });

    function tongguo(shenhe,uid) {
        $.post("${pageContext.request.contextPath}/kjfl/shenhe2",
            {shenhe:shenhe,uid:uid},
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

    function pitongguo(shenhe) {
        var uid=$(".ck").map(function () {
            if (this.checked){
                return this.value;
            }
        }).get().join(",");
        if (uid!=null&uid!=""){
            alert(uid);
           tongguo(shenhe,uid);
        } else {
            alert("请选择您要审核的数据");
        }
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