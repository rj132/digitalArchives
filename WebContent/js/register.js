$($("#register").click(function () {
	$.ajax({ 
        type: "post", 
        cache: false, 
        dataType: 'JSON',
        url: "Register_register.action",
        data:{
        	username : $("#username").val(),
			password : $("#password").val()
         },
         success: function(data) {
        	 alert(data);
         }
     });
}));