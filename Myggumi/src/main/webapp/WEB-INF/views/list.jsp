
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd"> 
    <script src="https://code.jquery.com/jquery-1.11.2.min.js"></script>


<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
    <title>Insert title here</title>
</head>
<body>
<h3>회원 리스트</h3>
<h3>TEST(배재현) 20171205 test /// 20171216 MyggumiAdmin </h3>

 <script type="text/javascript">
 $(function(){
		$('button').click(function(){
			var url='data:application/vnd.ms-excel,' + encodeURIComponent($('#exceldownload').html()) 
			location.href=url
			return false
		})
	})
 
 </script>



<form action="" id="form_ex" method="post">
<button>excelDownload</button>
<br>
	 <div id="exceldownload">
	 <table id="">
	 <tr>
	        <%--<td colspan="5" style="text-align:center;">회원명수 : ${resultCount}명</td>--%>
	    </tr>
	    <tr>
	        <th>로그인ID!</th>
	        <th>이름</th>
	        <th>이메일</th>
	        <th>전화번호</th>
	        <th>가입일자</th>
	    </tr>
	    <c:forEach var="list" items="${resultList}">
	        <tr>
	            <td>${list.USR_LGN}</td>
	            <td>${list.USR_NM}</td>
	            <td>${list.USR_EML}</td>
	            <td>${list.USR_TEL}</td>
	            <td>${list.CRT_DT}</td>
	
	        </tr>
	    </c:forEach>
	  </table>
	</div>
	
	

</form>
	
</body>
</html>