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
    <h1 align="center" ><button>主页面</button></h1>
    <h2 align="center" >
        <button>
            ${useres.uname}
            <c:if test="${useres.ubiaoshi==1}">教师在线</c:if>
            <c:if test="${useres.ubiaoshi==2}">学生在线</c:if>
            <c:if test="${useres.ubiaoshi==null}">游客在线</c:if>
        </button>
    </h2>
    <h2 align="center" >
            <input type="button" value="刷新本页面" onclick="shuaxin()">
    </h2>
    <h2 align="center" >
        <input type="button" value="学生注册" onclick="zhuce('${useres.uid}')">
        <input type="button" value="登入" onclick="dengru('${useres.uid}')">
        <input type="button" value="教师批量注册多名学生" onclick="jiaoshizhuce('${useres.ubiaoshi}','${useres.uid}','${useres.uname}')">
    </h2>
    <h2 align="center">
        <input type="button" value="教师审核" onclick="shenhe('${useres.ubiaoshi}','${useres.uid}','${useres.uname}')">
        <input type="button" value="个人信息" onclick="gerenxinxi('${useres.ubiaoshi}','${useres.uid}')">
        <input type="button" value="教师修改学生个人信息" onclick="jiaoshixiugaixuesheng('${useres.ubiaoshi}','${useres.uid}')">
    </h2>
    <h2 align="center">
            <input type="button" value="技术提问" onclick="tiwen('${useres.ubiaoshi}','${useres.uid}')">
            <input type="button" value="历史问题" onclick="lishiwenti('${useres.uid}')">
            <input type="button" value="自己问题的回复情况" onclick="zijiwenti('${useres.uid}')">
    </h2>
    <h2 align="center" >
        <input type="button" value="签到" onclick="qiandao('${useres.uid}','${useres.ubiaoshi}')">
        <input type="button" value="异常查询" onclick="qiandaochaxun('${useres.uid}')">
        <input type="button" value="教师回复等级排行榜" onclick="paihang('${useres.uid}')">
    </h2>

    <script type="text/javascript">
        function shuaxin() {
            //刷新当前页面
            document.location.reload();
        }
        function zhuce() {
            //前往注册页面
            window.location.href="${pageContext.request.contextPath}/kjfl/zhuce";
        }
        function jiaoshizhuce(ubiaoshi) {
            if (ubiaoshi==1){
                //前往批量注册注册页面
                window.location.href="${pageContext.request.contextPath}/kjfl/piliangzhuce";
            } else {
                alert("只有老师可以批量注册学生");
            }
        }
        function dengru(uid) {
            //前往登入页面
            window.location.href="${pageContext.request.contextPath}/kjfl/dengru?uid="+uid;
        }
        function shenhe(ubiaoshi,ujid,ujname) {
            if (ubiaoshi==1){
                //前往审核页面
                window.location.href="${pageContext.request.contextPath}/kjfl/shenhe?ujid="+ujid+"&ujname"+ujname+"&ujbiaoshi="+ubiaoshi;
            } else {
                alert("学生与游客无权审核");
            }
        }
        function gerenxinxi(ubiaoshi,uid) {
            if (ubiaoshi!=""){
                //前往审核页面
                window.location.href="${pageContext.request.contextPath}/kjfl/gerenxinxi?uid="+uid;
            } else {
                alert("游客无个人信息");
            }
        }
        function jiaoshixiugaixuesheng(ubiaoshi,ujid) {
            if (ubiaoshi==1){
                //前往教师修改学生页面
                window.location.href="${pageContext.request.contextPath}/kjfl/jiaoshixiugaixuesheng?ujid="+ujid;
            } else {
                alert("只有老师可以修改学生详细信息");
            }
        }
        function tiwen(ubiaoshi,uid) {
            if (ubiaoshi==2){
                //前往教师修改学生页面
                window.location.href="${pageContext.request.contextPath}/kjfl/tiwenti?uid="+uid;
            } else {
                alert("只有学生可以提问");
            }
        }
        function lishiwenti(uid) {
            //前往历史问题页面
            window.location.href="${pageContext.request.contextPath}/kjfl/lishiwenti?uid="+uid;
        }
        function zijiwenti(uid) {
            //前往自己问题页面
            window.location.href="${pageContext.request.contextPath}/kjfl/zijiwenti?uid="+uid;
        }
        function paihang(uid) {
            //前往评价问题页面
            window.location.href="${pageContext.request.contextPath}/kjfl/paihang?uid="+uid;
        }

        function qiandao(uid,ubiaoshi) {
            if (ubiaoshi!=''){
                //签到
                $.post
                ("${pageContext.request.contextPath}/kjfl/qiandao",
                    {qid:uid},
                    function (data) {
                        if (data.success) {
                            alert(data.message);
                        }else {
                            alert(data.message);
                        }
                    },"json");
            } else {
                alert("游客不可以签到");
            }
        }

        function qiandaochaxun(uid) {
            if (uid=='13021023372') {
                //前往评价问题页面
                window.location.href="${pageContext.request.contextPath}/kjfl/qiandao2?puid="+uid;
            }else {
                alert("只有专门查看异常的老师才可以进去查看");
            }
        }
    </script>

</body>
</html>