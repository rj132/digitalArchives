$($("#login").bind("click", function () {
	$.ajax({ 
        type: "post", 
        cache: false, 
        dataType: 'JSON',
        url: "Login_validateUser.action",
        data:{
        	username : $("#username").val(),
			password : $("#password").val()
         },
         success: function(data) {
        	 alert(data);
         }
     });
}));