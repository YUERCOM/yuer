$(document).ready(function(){
	$("#loginButton").click(function(){
		$.ajax({
            type: "POST",
            url: "http://localhost:8071/manager/login",
            data: $("#loginForm").serializeArray(),
            success: function (result) {
                
            },
            error: function(data) {
                alert("error:"+data.responseText);
            }
		});
	});
	
	
	
});