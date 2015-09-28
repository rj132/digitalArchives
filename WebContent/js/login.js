$(document).ready(function(){
	$('#username').bind('input propertychange', function() {
		if($("#username").val()!=""){
			$(this).attr("class","indispensable ok");
		} else {
			$(this).attr("class","indispensable");
		}
	});
	$('#password').bind('input propertychange', function() {
		if($("#password").val()!=""){
			$(this).attr("class","indispensable ok");
		} else {
			$(this).attr("class","indispensable");
		}
	});
	$("#login").click(function () {
		if(dataOk()) {
			$.ajax({ 
		        type : "post", 
		        cache: false, 
		        dataType : 'JSON',
		        url : "Login_validateUser.action",
		        data :{
		        	username : $("#username").val(),
					password : $("#password").val()
		         },
		         success : function(data) {
		        	 alert(data);
		         }
		     });
	}});
	function dataOk(){
		var isTrue = 0;
	    $(".indispensable").each(function () {
	        if(!$(this).hasClass("ok")) {
	            isTrue = 1;
	        }
	    });
	    if(isTrue == 0) {
	        return true;
	    }
	    else {
	        return false;
	    }
	}

});
