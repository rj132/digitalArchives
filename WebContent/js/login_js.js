
function createXHR(){
	if(typeof XMLHttpRequest != 'undefined'){
		return new XMLHttpRequest();

	}else if(typeof ActiveXObject!='undefined'){
		var version = [
			'MSXML2.XMLHttp.6.0',	
		    'MSXML2.XMLHttp.3.0',
			'MSXML2.XMLHttp'
		];
		for(var i=0;version.length;i++){
			try{
				return new ActiveXObject();
			}
			catch(e){
			}			
		}
	}else {
		throw new Error('not support');
	}
}

var Lib = function(){};
Lib.prototype.getId = function(id){
	var ele = document.getElementById(id);
	return ele;
};

var EventUtil = {	 
	 addHandler: function(element, type, handler){
					if (element.addEventListener){
						 element.addEventListener(type, handler, false);
					 } else if (element.attachEvent){
						 element.attachEvent("on" + type, handler);
					 } else {
						 element["on" + type] = handler;
					 }
				 },
	 removeHandler: function(element, type, handler){
					if (element.removeEventListener){
						 element.removeEventListener(type, handler, false);
					 } else if (element.detachEvent){
						 element.detachEvent("on" + type, handler);
					 } else {
						 element["on" + type] = null;
					 }
				 },
	 getEvent: function(event){
					return event ? event : window.event;
				 },
	 getTarget: function(event){                 
					 return event.target || event.srcElement;
				 },
	 preventDefault: function(event){     
					 if (event.preventDefault){
						 event.preventDefault();
					 } else {
						 event.returnValue = false;
					 }
				 },
	 stopPropagation: function(event){ 
						 if (event.stopPropagation){
							 event.stopPropagation();
						 } else {
							 event.cancelBubble = true;
						 }
				 }
 };

window.onload = function(){
	var lib = new Lib();
	var btn = lib.getId("login");
	EventUtil.addHandler(btn,"click",function(){
		var xhr = createXHR();
		xhr.open('get','Login_validateUser.action?username=linlianhuai&password=123456',false);
		xhr.send(null);
		alert(xhr.responseText);
	});
};



