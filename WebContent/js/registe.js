$(document).ready(function(){
	$("#username").blur(function(){
		if($("#username").val()!=""){
			$(this).attr("class","indispensable ok");
		} else {
			$(this).attr("class","indispensable");
		}
	});
	$("#name").blur(function(){
		if($("#name").val()!=""){
			$(this).attr("class","indispensable ok");
		} else {
			$(this).attr("class","indispensable");
		}
	});
	$("#password").blur(function(){
		if($("#password").val()!=""){
			$(this).attr("class","indispensable ok");
		} else {
			$(this).attr("class","indispensable");
		}
	});
	$("#passwordComfire").blur(function(){
		if($("#passwordComfire").val()!="" && $("#passwordComfire").val()==$("#password").val()){
			$(this).attr("class","indispensable ok");
		} else {
			$(this).attr("class","indispensable");
		}
	});
	$("#phone").blur(function(){
		if($("#phone").val()!="" && $("#phone").val().length()==11){
			$(this).attr("class","indispensable ok");
		} else {
			$(this).attr("class","indispensable");
		}
	});
	$("#register").click(function () {
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
