<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
</head>
<body>
	아이디 :
	<input type="text" id="id" value="${param.id }">
	<input type="button" value="채팅입장" id="enterbtn">
	<input type="button" value="채팅퇴장" id="exitbtn">
	<h1>채팅방</h1>
	<div id="chatarea">
		<div id="chatmsgarea"></div>
		메시지 : <input type="text" id="msg">
		<input type="button" id="sendbtn" value="전송">
		<input type="file" id="ff" value="">
	</div>
<script>
var  ws;
$("#enterbtn").on("click",()=>{
	ws = new WebSocket("ws://<%=request.getLocalAddr()%>:<%=request.getLocalPort()%><%=request.getContextPath()%>/chatws");
	// 서버응답 수신시
	ws.onmessage = (server)=>{
		let msg = server.data;
		if(msg.split(":")[0]===$("#id").val()){
			msg = '<p style="background-color : yellow; text-align : right">'+msg.split(":")[1]+'</p>';
		}else{
			msg = '<p>'+server.data+'</p>';

		}
		$("#chatmsgarea").append(msg);
	}
	// 서버와 연결되었을 때
	ws.onopen = ()=>{
		console.log("연결완료");
	}
	//서버와 연결해제되었을 때
	ws.onclose= ()=>{
		console.log("연결해제");
	}
});
$("#exitrbtn").on("click",()=>{
	ws.close();
	ws = null;
}); 
//현재 클라이언트가 서버로 보내는 부분
$("#sendbtn").on("click",()=>{
	let id = $("#id").val();
	let msg = $("#msg").val();
	if(ws != undefined){
		ws.send(id + ": "+ msg);
	}
});

$("#msg").keyup(function(key) {
    if (key.keyCode == 13) {
    	let id = $("#id").val();
    	let msg = $("#msg").val();
    	if(ws != undefined){
    		ws.send(id + ": "+ msg);
    		$("#msg").val("");
    	}
    }
})
</script>
</body>
</html>