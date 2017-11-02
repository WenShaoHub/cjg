
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
<table id="dgacc"></table>

<script>
      function searchForm() {
        $('#dgacc').datagrid('load', {
            userName: $('#title').val(),
        });
    }

    $('#dgacc').datagrid({
        multiSort: true,
        pageSize: 5,
        pageList: [5, 10, 20],
        toolbar: '#toolbar',
        fit: true,
        pagination: true,
        url: 'userInfoList',
        columns: [[
//            id,createTime, status,userNo,userName, accountNo, mobile,password,payPwd
//            {field: 'ck', checkbox: true},
            {field: 'id', title: '序号', width: 50, sortable: true},
            {field: 'userNo', title: '用户编号', width: 100},
//            {field:'sellPoint',title:'卖点',width:200},
            {field: 'userName', title: '用户名称', width: 100},
            {field: 'accountNo', title: '账户编号', width: 100},
            {field: 'alance', title: '可结算余额', width: 100},
            {field: 'frozenMoney', title: '冻结金额', width: 100},
            {field: 'todayIncome', title: '今日收益', width: 100},
            {field: 'todayExpend', title: '今日支出', width: 100},
            {field:'remark',title:'操作',width:100 ,formatter: function(value,row,index){
                return '<a style="color:blue" href="${pageContext.request.contextPath}/showSettRecordId.action?id = ${settRecordId.id}">支付配置</a>';
            }},
            {field:'remark',title:'操作',width:100 ,formatter: function(value,row,index){
                return '<a style="color:blue" href="${pageContext.request.contextPath}/showSettRecordId.action?id = ${settRecordId.id}">收支明细</a>';
            }}

        ]]
    });


</script>
