
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
//׼������
xhr.open('get','Login_HelloServletUrl.action',false); //׼������������get��ͬ����ʽ
//��������
xhr.send(null);
//�鿴���ؽ��
alert(xhr.responseText);



