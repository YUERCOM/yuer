$(function(){
	var hiddenSex = $("#hidden_sex").val();
	var hiddenDeptId = $("#hidden_deptId").val();
	var hiddenRoleId = $("#hidden_roleId").val();
	if(hiddenSex != ""){
		$("#sex").val(hiddenSex);
	}
	//加载部门
	getDeptFun(hiddenDeptId);
	//加载角色
	getRoleFun(hiddenRoleId);
	
});

function getDeptFun(hiddenDeptId){
	$.ajax({
        type: "GET",
        dataType:"json",
        url:"/manager/dept/getDeptList",
        success: function (data) {
            if(data.status == "success"){
            	var deptId = $("#deptId");
            	deptId.empty();
            	var deptOption = "<option value=''>请选择部门</option>";
            	for(var i = 0; i < data.result.length; i++){
            		if(hiddenDeptId == data.result[i].id){
            			deptOption = deptOption + "<option value='" + data.result[i].id + "' selected='selected'>" + data.result[i].name + "</option>";
            		}else{
            			deptOption = deptOption + "<option value='" + data.result[i].id + "'>" + data.result[i].name + "</option>";
            		}
            	}
            	deptId.append(deptOption);
            }else{
            	alertMsg.error('服务器开小差...');
            }
        },
        error: function(data) {
        	alertMsg.error('服务器开小差...');
        }
	});
}

function getRoleFun(hiddenRoleId){
	$.ajax({
        type: "GET",
        dataType:"json",
        url:"/manager/role/getRoleList",
        success: function (data) {
            if(data.status == "success"){
            	var roleId = $("#roleId");
            	roleId.empty();
            	var roleOption = "<option value=''>请选择角色</option>";
            	for(var i = 0; i < data.result.length; i++){
            		if(hiddenRoleId == data.result[i].id){
            			roleOption = roleOption + "<option value='" + data.result[i].id + "' selected='selected'>" + data.result[i].name + "</option>";
            		}else{
            			roleOption = roleOption + "<option value='" + data.result[i].id + "'>" + data.result[i].name + "</option>";
            		}
            	}
            	roleId.append(roleOption);
            }else{
            	alertMsg.error('服务器开小差...');
            }
        },
        error: function(data) {
        	alertMsg.error('服务器开小差...');
        }
	});
}

function saveUser(){
	$.ajax({
		type: "POST",
	    url: "/manager/user/saveUser",
	    dataType:"json",
	    data: $("#saveUserForm").serialize(),
	    success: function (data) {
            if(data.status == "success"){
            	alertMsg.info("操作成功");
            	$.pdialog.closeCurrent();
            	navTab.reloadFlag("menu_6_5");
            }else{
            	alertMsg.error(data.result);
            }
        }
	});
	
	
	
}






