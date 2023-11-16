<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<h2>form.jsp</h2>

<form action="/struts/pro.action" method="post">
	name: <input type="text" name="name"> <br />
	number: <input type="text" name="number"> <br />
	<input type="submit" value="전송">
</form>