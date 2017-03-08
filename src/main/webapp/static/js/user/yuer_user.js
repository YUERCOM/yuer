$(function(){
	$.ajax({
        type: "GET",
        dataType:"json",
        url:"/manager/dept/getDeptList",
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

function deleteUser(id){
	alertMsg.confirm("确认删除吗？删除后不可恢复", {
		okCall: function(){
			$.ajax({
		        type: "POST",
		        dataType:"json",
		        url:"/manager/user/deleteUser",
		        data:{"id":id},
		        success: function (data) {
		            if(data.status == "success"){
		            	alertMsg.info("删除成功");
		            	navTab.reloadFlag("menu_6_5");
		            }else{
		            	alertMsg.error(data.result);
		            }
		        },
		        error: function(data) {
		        	alertMsg.error('服务器开小差...');
		        }
			});
		}
	});
}