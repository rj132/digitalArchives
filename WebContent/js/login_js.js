
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

var xhr = createXHR();
//alert(xhr);    //object XMLHttpRequest 
//准备请求
xhr.open('get','Login_HelloServletUrl.action',false); //准备发送请求，以get、同步方式
//发送请求
xhr.send(null);
//查看返回结果
alert(xhr.responseText);



