$(document).ready(function(){
	$('#username').bind('input propertychange', function() {
		if($("#username").val()!=""){
			$.ajax({ 
		        type : "post", 
		        cache: false, 
		        dataType : 'JSON',
		        url : "Register_username.action",
		        data :{
		        	username : $("#username").val()
		         },
		         success : function(data) {
		        	 if(data=="username") {
		     			$(this).attr("class","indispensable ok");
		        	 } else {
		        		 
		        	 }
		         }
		     });
		} else {
			alert("kong");
			$(this).attr("class","indispensable");
		}
	});
	$('#name').bind('input propertychange', function() {
		if($("#name").val()!=""){
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
	$('#passwordComfire').bind('input propertychange', function() {
		if($("#passwordComfire").val()!="" && $("#passwordComfire").val()==$("#password").val()){
			$(this).attr("class","indispensable ok");
		} else {
			$(this).attr("class","indispensable");
		}
	});
	$('#phone').bind('input propertychange', function() {
		var phone = $("#phone").val();
		if(phone && /^1[3|4|5|8]\d{9}$/.test(phone)){
			$(this).attr("class","indispensable ok");
		} else {
			$(this).attr("class","indispensable");
		}
	});
	$('#id_card_code').bind('input propertychange', function() {
		if($("#id_card_code").val()!=""){
			$.ajax({ 
		        type : "post", 
		        cache: false, 
		        dataType : 'JSON',
		        url : "Register_id_card_code.action",
		        data :{
		        	id_card_type : $("#id_card_type").val(),
		        	id_card_code : $("#id_card_code").val()
		         },
		         success : function(data) {
		        	 if(data=="id_card_code") {
		     			$(this).attr("class","indispensable ok");
		        	 } else {
		        		 
		        	 }
		         }
		     });
		} else {
			$(this).attr("class","indispensable");
		}
	});
	$('#email').bind('input propertychange', function() {
		if($("#email").val().match(/^\w+((-\w+)|(\.\w+))*\@[A-Za-z0-9]+((\.|-)[A-Za-z0-9]+)*\.[A-Za-z0-9]+$/)){
			$.ajax({ 
		        type : "post", 
		        cache: false, 
		        dataType : 'JSON',
		        url : "Register_email.action",
		        data :{
		        	email : $("#email").val()
		         },
		         success : function(data) {
		        	 if(data=="email") {
		     			$(this).attr("class","indispensable ok");
		        	 } else {
		        		 
		        	 }
		         }
		     });
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
		        url : "Register_register.action",
		        data :{
		        	username : $("#username").val(),
		        	name : $("#name").val(),
					password : $("#password").val(),
					phone : $("#phone").val(),
		        	id_card_type : $("#id_card_type").val(),
		        	id_card_code : $("#id_card_code").val(),
		        	email : $("#email").val()
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
