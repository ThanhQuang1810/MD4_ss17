<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Máy Tính Đơn Giản</title>
</head>
<body>
<h1>Máy Tính Đơn Giản</h1>
<form action="/result" method="get">
    <label for="firstNumber">Số thứ nhất:</label>
    <input type="number" id="firstNumber" name="firstNumber" step="any" required><br/>

    <label for="secondNumber">Số thứ hai:</label>
    <input type="number" id="secondNumber" name="secondNumber" step="any" required><br/>

    <label>Phép tính:</label><br/>
    <input type="radio" name="action" value="add" required> Cộng (+)<br/>
    <input type="radio" name="action" value="subtract"> Trừ (-)<br/>
    <input type="radio" name="action" value="multiply"> Nhân (*)<br/>
    <input type="radio" name="action" value="divide"> Chia (/)<br/>

    <button type="submit">Tính</button>
</form>

<c:if test="${not empty error}">
    <p style="color:red">${error}</p>
</c:if>
</body>
</html>
