
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<div id="toolbar">--%>
    <%--<div style="padding: 5px; background-color: #fff;">--%>
        <%--<label>用户姓名：</label>--%>
        <%--<input class="easyui-textbox" type="text" id="title">--%>
        <%--<!--http://www.cnblogs.com/wisdomoon/p/3330856.html-->--%>
        <%--<!--注意：要加上type="button",默认行为是submit-->--%>
        <%--<button onclick="searchForm()" type="button" class="easyui-linkbutton">搜索</button>--%>
    <%--</div>--%>
<%--</div>--%>
<table id="dgTra"></table>

<script>
      function searchForm() {
        $('#dgTra').datagrid('load', {
            userName: $('#title').val(),
        });
    }

    $('#dgTra').datagrid({
        multiSort: true,
        pageSize: 5,
        pageList: [5, 10, 20],
        toolbar: '#toolbar',
        fit: true,
        pagination: true,
        url: 'TradeList',
        columns: [[
//            id,createTime, status,userNo,userName, accountNo, mobile,password,payPwd
//            {field: 'ck', checkbox: true},
            {field: 'id', title: '序号', width: 50, sortable: true},
            {field: 'productName', title: '商品名称', width: 100},
            {field: 'merchantOrderNo', title: '商户订单号', width: 100},
            {field: 'createTime', title: '创建时间', width: 100},
//            {field:'sellPoint',title:'卖点',width:200},
            {field: 'creater', title: '创建者', width: 100},
            {field: 'merchantNo', title: '商户编号', width: 100},
            {field: 'orderAmount', title: '订单金额', width: 100},
//            {field: 'orderAmount', title: '账户编号', width: 100},
            {field: 'paySuccessTime', title: '支付成功时间', width: 100},
            {field: 'payWayName', title: '支付方式名称', width: 100},
            {field: 'trxNo', title: '支付流水号', width: 100},
            {field: 'payTypeName', title: '支付类型名称', width: 100},
            {field:'remark',title:'操作',width:100 ,formatter: function(value,row,index){
                return '<a style="color:blue" href="${pageContext.request.contextPath}/showSettRecordId.action?id = ${settRecordId.id}">支付配置</a>';
            }},
            {field:'remark',title:'操作',width:100 ,formatter: function(value,row,index){
                return '<a style="color:blue" href="${pageContext.request.contextPath}/showSettRecordId.action?id = ${settRecordId.id}">收支明细</a>';
            }}

        ]]
    });


</script>
