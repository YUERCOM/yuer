$(document).ready(function(){
	$("#loginButton").click(function(){
		$.ajax({
            type: "POST",
            dataType:"json",
            url: host + "login",
            data: $("#loginForm").serializeArray(),
            success: function (data) {
                if(data.status == "success"){
                	window.location.href = host + "home/";
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