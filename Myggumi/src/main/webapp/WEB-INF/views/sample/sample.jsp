<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h3>ȸ�� ����Ʈ</h3>
	<h3>TEST(�̼���) 20171221 Myggumi</h3>
	<table border="1">
		<tr>
			<th>�α���ID</th>
			<th>�̸�</th>
			<th>�̸���</th>
			<th>��ȭ��ȣ</th>
			<th>��������</th>
		</tr>

		<c:forEach var='list' items="${resultList}">
			<tr>
				<td>${list.USR_LGN}</td>
				<td>${list.USR_NM}</td>
				<td>${list.USR_EML}</td>
				<td>${list.USR_TEL}</td>
				<td>${list.CRT_DT}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>