
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div id="toolbar">
    <div style="padding: 5px; background-color: #fff;">
        <label>用户姓名：</label>
        <input class="easyui-textbox" type="text" id="title">
        <!--http://www.cnblogs.com/wisdomoon/p/3330856.html-->
        <!--注意：要加上type="button",默认行为是submit-->
        <button onclick="searchForm()" type="button" class="easyui-linkbutton">搜索</button>
    </div>
</div>

<table id="dg"></table>

<script>
      function searchForm() {
        $('#dg').datagrid('load', {
            userName: $('#title').val(),
        });
    }

    $('#dg').datagrid({
        multiSort: true,
        pageSize: 5,
        pageList: [5, 10, 20],
        toolbar: '#toolbar',
        fit: true,
        pagination: true,
        url: 'userInfoList',
        columns: [[
//            id,createTime, status,userNo,userName, accountNo, mobile,password,payPwd
            {field: 'ck', checkbox: true},
            {field: 'id', title: '序号', width: 150, sortable: true},
            {field: 'userNo', title: '用户编号', width: 200, sortable: true},
//            {field:'sellPoint',title:'卖点',width:200},
            {field: 'userName', title: '用户名称'},
            {field: 'accountNo', title: '账户编号'},
            {field: 'status', title: '状态'},
            {
                field: 'createTime', title: '创建时间', formatter: function (value, row, index) {
                return moment(value).format('dddd, MMMM Do YYYY, h:mm:ss a');
            }
            },
        ]]
    });


</script>
