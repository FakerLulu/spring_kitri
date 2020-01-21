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
<h1>로그인 화면</h1>
<form action="./login" method="post" class="form">
	id : <input type="text" name="id" id="id" class="form-control">
	pw : <input type="text" name="pw" id="pw" class="form-control">
	<input type="submit" value="로그인" class="btn btn-default" >
	<input type="button" id="loginbtn" value="ajax로그인" class="btn btn-default" >
</form>
<div id="login_result"></div>

<script>
$('#loginbtn').on('click',()=>{
	$.ajax({
		url : '/mvc/ajax/login',
		data : {'id' : $('#id').val(), 'pw':$('#pw').val()},
		type:'post',
		datatype : 'json',
		success : (data)=>{
			$('#login_result').html(data.result + ":" + data.logintime);
			if(data.result ==='ok'){
				$('body').append(
						'<input type=button id="boardajaxbtn" value="게시물주셈">');
				$('body').append(
						'<div id="boardresult" class="container"></div>');
				
				$('#boardajaxbtn').on('click',()=>{
					$.ajax({
						url:'/mvc/ajax/boardlist',
						data:{},
						type:'post',
						datatype:'json',
						success:(data)=>{
							let i = 1;
							let result = '<table class="table table-striped table-hover">'+'<thead><th>번호</th><th>제목</th><th>글쓴이</th><th>시간</th><th>조회수</th></thead>';
							while(data[i]!=undefined){
								result+='<tr><td>'+data[i].seq+'</td><td><a href="" id="'+data[i].seq+'">'+data[i].title+'</a></td><td>'+data[i].writer+'</td><td>'+data[i].time+'</td><td>'+data[i].viewcount+'</td></tr>';							
								i++;
							}
							$('#boardresult').html(result+'</table>');
							
						},
						error:(e)=>{alert(e)}
					});
				});
			}else{
				$('#boardajaxbtn').remove();
				$('#boardresult').remove();
			}
		},
		error:(e)=>{alert(e) }
		}
	)
});

$('body').on('click','a',(ev)=>{
	ev.preventDefault();
	$.ajax({
		url:"./oneboard",
		data:{"seq":ev.currentTarget.id},
		datatype:'json',
		type:'get',
		success:(data)=>{alert(data.contents)},
		error : (e)=>{alert(e)}
	})
	
});



</script>
</body>
</html>