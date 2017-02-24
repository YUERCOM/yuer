$(function(){
	$.ajax({
        type: "GET",
        dataType:"json",
        url: host + "dept/getDeptList",
        success: function (data) {
            if(data.status == "success"){
            	var deptId = $("#searchDeptId");
            	deptId.empty();
            	var deptOption = "<option value=''>请选择部门</option>";
            	for(var i = 0; i < data.result.length; i++){
            		deptOption = deptOption + "<option value='" + data.result[i].id + "'>" + data.result[i].name + "</option>";
            	}
            	deptId.append(deptOption);
            	$("#searchSex").val($("#hiddenSex").val());
            	$("#searchDeptId").val($("#hiddenDeptId").val());
            }else{
            	alertMsg.error('服务器开小差...');
            }
        },
        error: function(data) {
        	alertMsg.error('服务器开小差...');
        }
	});
	
});