$(document).ready(function(){
	$("#loginButton").click(function(){
		$.ajax({
            type: "POST",
            dataType:"json",
            url: rootPath + "/login",
            data: $("#loginForm").serializeArray(),
            success: function (data) {
                if(data.status == "success"){
                	window.location.href = rootPath + "/home/";
                }else{
                	$("#errorDiv").html(data.result);
                }
            },
            error: function(data) {
                $("#errorDiv").html("服务器开小差....");
            }
		});
	});
	
	
	
});