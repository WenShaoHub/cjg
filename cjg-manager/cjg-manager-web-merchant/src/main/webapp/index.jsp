<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>首页</title>
	<!-- 导入easyui的样式表 -->
	<link rel="stylesheet" href="js/jquery-easyui-1.5/themes/bootstrap/easyui.css">
	<link rel="stylesheet" href="js/jquery-easyui-1.5/themes/icon.css">
	<link rel="stylesheet" href="css/common.css">
</head>
<body class="easyui-layout">
<div data-options="region:'north'" style="height:70px;padding-left:10px;">
	<h2>商户后台</h2>
</div>

<div data-options="region:'west'" style="width:200px;">
	<div id="menu" class="easyui-accordion">

			<ul class="easyui-tree">
				<li data-options="attributes:{'href':''}">账户信息</li>
			</ul>
			<ul class="easyui-tree">
				<li data-options="attributes:{'href':''}">交易订单信息</li>
			</ul>
			<ul class="easyui-tree">
				<li data-options="attributes:{'href':''}">结算信息</li>
			</ul>


	</div>
</div>
<div data-options="region:'center'" style="background:#eee;">
	<div id="tab" class="easyui-tabs" data-options="fit:true">
		<div title="欢迎页面" style="padding:20px;">藏金阁欢迎你</div>
	</div>
</div>
<!-- jquery -->
<script src="js/jquery-easyui-1.5/jquery.min.js"></script>
<!-- jquery easyui -->
<script src="js/jquery-easyui-1.5/jquery.easyui.min.js"></script>
<script src="js/jquery-easyui-1.5/locale/easyui-lang-zh_CN.js"></script>
<script src="js/moment/moment-with-locales.js"></script>
<script>
    moment.locale('zh-cn')
</script>
<!-- 自定义脚本 -->
<script src="js/common.js"></script>
<!-- 自定义js -->
<script>
    ttshop.registerMenuEvent();
</script>

</body>
</html>