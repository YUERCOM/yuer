$(document).ready(function(){
	$("#loginButton").click(function(){
		$.ajax({
            type: "POST",
            url: host + "login",
            data: $("#loginForm").serializeArray(),
            success: function (result) {
                
            },
            error: function(data) {
                alert("error:"+data.responseText);
            }
		});
	});
	
	
	
});