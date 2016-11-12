<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Hello</title>
<script type="text/javascript" src="../js/jquery.js"></script>
<script type="text/javascript" src="../js/json2.js"></script>
</head>
<script type="text/javascript">
$.ajax({
    type: "POST",
    url: '../testJson.do',
    
    success: function (data) {
        var releaseResult = JSON.stringify(data);
        alert(releaseResult);
        alert(data.user);
    },
    error: function (e) {
        alert("出错：" + e.responseText);
    }
});
</script>
<body>
success return !
</body>
</html>